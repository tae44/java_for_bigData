package day25.练习;

/*
	(1)已知配置文件config.properties中有三个键值对
   		name=zhangsan
   		score=80
   		address=beijing
	(2)使用IO字节流对象和Properties类结合使用,将配置文件中的score键的值修改为100
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/jason/Desktop/config.properties");
        Properties pro = new Properties();
        pro.load(fis);
        pro.setProperty("name", pro.getProperty("name"));
        pro.setProperty("score", "100");
        pro.setProperty("address", pro.getProperty("address"));
        FileOutputStream fos = new FileOutputStream("/Users/jason/Desktop/config.properties");
        pro.store(fos, "");
        fos.close();
        fis.close();
    }
}
