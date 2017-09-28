package day23.练习;

/*
    list集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫替换为王小丫,写入到"E:\\stuinfo.txt"
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        List<String> list = createArr();
        list = replaceData(list);
        writeData(list);
    }

    public static void writeData(List<String> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("E:\\stuinfo.txt");
            for (String s : list) {
                fw.write(s + " ");
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("写入失败!");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("资源释放失败!");
            }
        }
    }

    public static List<String> replaceData(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("二丫")) {
                list.remove(i);
                list.add(i, "王小丫");
            }
        }
        return list;
    }

    public static List<String> createArr() {
        List<String> list = new ArrayList<>();
        String[] sArr = {"张三", "李四", "王五", "二丫", "钱六", "孙七"};
        for (String s : sArr) {
            list.add(s);
        }
        return list;
    }
}
