package day24.练习;

/*
    利用转换流将GBK格式文件以UTF-8输出
 */

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new
                FileInputStream("E:\\gbk.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new
                FileOutputStream("E:\\utf.txt"), "UTF-8");
        char[] c = new char[1024];
        int len;
        while ((len = isr.read(c)) != -1) {
            osw.write(c, 0, len);
        }
        osw.close();
        isr.close();
    }
}
