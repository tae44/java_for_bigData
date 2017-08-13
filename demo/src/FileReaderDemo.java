import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader f = null;
        try {
            f = new FileReader("/Users/jason/Desktop/a.txt");
//            int i = f.read();
//            System.out.println(i);
//            读取单一字符
//            int c = 0;
//            数值等于-1代表后面没有字符了
//            while ((c = f.read()) != -1) {
//                System.out.println((char) c);
//            }
//            读到数组里面
//            char[] arr = new char[8];
//            int i = f.read(arr);
//            System.out.println(i + " ---> " + new String(arr));
//            i = f.read(arr);
//            System.out.println(i + " ---> " + new String(arr, 0, i));
            char[] arr = new char[8]; // 一般数组大小定为1024的整数倍
            int i = 0;
            while ((i = f.read(arr)) != -1) {
                System.out.println(new String(arr, 0, i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
