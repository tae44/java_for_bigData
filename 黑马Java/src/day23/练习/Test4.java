package day23.练习;

/*
    产生10个1-100的随机数，并放到一个数组中
        (1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
        (2)把数组中的数字放到当前文件夹的number.txt文件中
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = createArr();
        writeData(list);
    }

    public static void writeData(List<Integer> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("number.txt");
            for (Integer i : list) {
                fw.write(i + " ");
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

    // 创建数组
    public static List<Integer> createArr() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int ran = new Random().nextInt(100) + 1;
            if (ran >= 10) {
                list.add(ran);
            }
        }
        System.out.println(list);
        return list;
    }
}
