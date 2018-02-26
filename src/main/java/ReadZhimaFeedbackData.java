import com.google.gson.Gson;
import entity.Records;
import entity.RecordsList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hxc，xiongchao.hao@htouhui.com
 * @date 2017/11/3.
 */
public class ReadZhimaFeedbackData {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\Administrator\\Desktop\\07\\";
        List<String> files = getFileList(fileName);

        for (String name : files) {
            String json = readFileByLines(name);
            RecordsList recordsList = new Gson().fromJson(json, RecordsList.class);
            List<Records> list = recordsList.getRecords();
            List<String> orderIds = readFileByLinesToList("C:\\Users\\Administrator\\Desktop\\cs.csv");

            int i = 0;
            for (Records aList : list) {
                if (orderIds.contains(aList.getOrderNo())) {
                    i = ++i;
                    System.out.println(name +"--"+aList.getOrderNo()+"--"+i);
                }

            }
        }
    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    private static String readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                sb.append(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sb.toString();
    }

    private static List<String> getFileList(String strPath) {
        File dir = new File(strPath);
        File[] files = dir.listFiles();
        List<String> fileList = new ArrayList();
        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();
                if (file.isDirectory()) {
                    getFileList(file.getAbsolutePath());
                } else if (fileName.endsWith("json")) {
                    fileList.add("C:\\Users\\Administrator\\Desktop\\07\\" + file.getName());
                }
            }

        }
        return fileList;
    }


    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    private static List<String> readFileByLinesToList(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        List<String> listStr = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                listStr.add(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return listStr;
    }
}
