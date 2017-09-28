package day23.练习;

/*
    键盘输入10个数，放到数组中
        (1)去除该数组中大于10的数
        (2)将该数组中的数字写入到本地文件number.txt中
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> list = createArr();
        writeData(list);
    }

    public static void writeData(List<Integer> list) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("E:\\number.txt");
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
        String s = new Scanner(System.in).next();
        // 输入的数字以逗号分隔 22,5,78,11,3,90,4,77,8,19
        String[] sArr = s.split(",");
        for (String str : sArr) {
            Integer i = Integer.parseInt(str);
            if (i <= 10) {
                list.add(i);
            }
        }
        return list;
    }
}
