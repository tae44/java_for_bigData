import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            // 后面写true参数代表写入是以追加的方式进行
            f = new FileWriter("/Users/jason/Desktop/a.txt", true);
            f.write("hello ");
            f.write("world");
            // 强制把流中的数据写入到文件中
            f.flush();
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
// 已复习
