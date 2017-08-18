import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("/Users/jason/Desktop/a.txt");
            bw = new BufferedWriter(fw);
            bw.write("Hello");
            bw.newLine();
            bw.write("World");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
// 已复习
