import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class 文件复制练习1 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("/Users/jason/Desktop/a.txt");
            fw = new FileWriter("/Users/jason/Desktop/copy.txt");
            int c = 0;
//            读写过于频繁
//            while ((c = fr.read()) != -1) {
//                fw.write(c);
//            }
            char[] arr = new char[1024]; // 缓冲区
            while ((c = fr.read(arr)) != -1) {
                fw.write(arr, 0, c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
