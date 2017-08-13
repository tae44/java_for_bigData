import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) {
        // method1();
        method2();
    }

    public static void method2() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/Users/jason/Desktop/a.txt");
            int c = 0;
//            while ((c = fis.read()) != -1) {
//                System.out.println((char) c);
//            }
            byte[] arr = new byte[1024];
            while ((c = fis.read(arr)) != -1) {
                System.out.println(new String(arr, 0, c));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void method1() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/jason/Desktop/a.txt");
            fos.write("hello".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
