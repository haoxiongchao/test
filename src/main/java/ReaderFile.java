import com.csvreader.CsvReader;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2017/10/17.
 */
public class ReaderFile {

    public static void main(String[] args) throws IOException {
        readFileByLines();
    }

    private static void readFileByLines() throws IOException {
        String csvFilePath = "C:\\Users\\Administrator\\Desktop\\cs.csv";
        // 一般用这编码读就可以了
        CsvReader reader = new CsvReader(csvFilePath, ',',
                Charset.forName("UTF-8"));

        reader.readHeaders(); // 跳过表头 如果需要表头的话，不要写这句。
        // 用来保存数据
        ArrayList<String[]> csvList = new ArrayList<String[]>();
        // 逐行读入除表头的数据
        while (reader.readRecord()) {
            csvList.add(reader.getValues());
        }
        reader.close();
        System.out.println("正在写入...");
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < csvList.size(); row++) {
            if (row == csvList.size() - 1) {
                sb.append("'").append(csvList.get(row)[0]).append("'");
            } else {
                sb.append("'").append(csvList.get(row)[0]).append("',");
            }
        }
        System.out.println(sb.toString());
    }

}
