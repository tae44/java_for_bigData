package day24.练习;

/*
    java写一个程序，实现从文件中读出文件内容，并将其打印在屏幕当中，并标注上行号
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader("E:\\a.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            count++;
            System.out.println(count + "  " + line);
        }
        br.close();
    }
}
