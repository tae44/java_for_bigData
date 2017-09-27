package day23.练习;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StreamCorruptedException;

public class Test {
    public static void main(String[] args) throws IOException {
        f();
    }

    public static void f() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\aaa.txt");
        byte[] b = new byte[1024];
        int i;
        while ((i = fis.read(b)) != -1) {
            System.out.print(new String(b, 0, i));
        }
        fis.close();
    }
}
