import utli.HttpClientUtil;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2018/2/1.
 */
public class HttpTest {

    final static int MAX_QPS = 1000;

    final static Semaphore semaphore = new Semaphore(MAX_QPS);


    public static void main(String[] args) {

        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(() -> semaphore.release(MAX_QPS), 1000, 1000, TimeUnit.MILLISECONDS);
        //lots of concurrent calls:100 * 1000
        ExecutorService pool = Executors.newFixedThreadPool(100);
        for (int i = 100; i > 0; i--) {
            final int x = i;
            pool.submit(() -> {
                for (int j = 1000; j > 0; j--) {
                    semaphore.acquireUninterruptibly(1);
                    System.out.println(HttpClientUtil.httpGetRequest("http://localhost:8080/api/test"));
//                    remoteCall(x, j);
                }
            });
        }
        pool.shutdown();
        try {
            pool.awaitTermination(1, TimeUnit.HOURS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("DONE");
    }
    private static void remoteCall(int i, int j) {
        System.out.println(String.format("%s - %s: %d %d", new Date(),
                Thread.currentThread(), i, j));
    }
}
