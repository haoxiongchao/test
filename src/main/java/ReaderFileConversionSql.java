package entity;

import com.csvreader.CsvReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2017/10/17.
 */
public class ReaderFileConversionSql {

    public static void main(String[] args) throws IOException {
        readFileByLines();
    }

    private static void readFileByLines() throws IOException {
        String csvFilePath = "C:\\Users\\Administrator\\Desktop\\123.csv";
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
//            sb.append("INSERT INTO `pdl_refund_record` (`id`, `order_id`, `refund_amount`, `origin_trans_id`, `trans_id`, `refund_time`, `refund_method`, `remarks`, `admin_name`)" +
//                    " VALUES ('"+row+1+"', '"+csvList.get(row)[0]+"', '"+csvList.get(row)[1]+"', '"+csvList.get(row)[5]+"', NULL, '"+csvList.get(row)[6]+"', '1', '线上线下重复扣款', '郝雄超');\n");

        }
        System.out.println(sb.toString());
    }

}
