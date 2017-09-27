package day23.练习;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("E:\\abc.txt");
            fos.write(97);
        } catch (IOException e) {
            throw new RuntimeException("文件写入失败,请重试");
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭资源失败");
                }
            }
        }
    }
}
