package day23.练习;

/*
    从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
    没考虑文件夹下还有文件夹
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入源文件夹:");
        String srcFolder = sc.nextLine();
        System.out.println("请输入目的文件夹:");
        String destFolder = sc.nextLine();
        // 判断一下目的文件夹是否存在,不存在则创建
        File destFile = new File(destFolder);
        if (!destFile.exists()) {
            destFile.mkdirs();
        }

        File srcFile = new File(srcFolder);
        File[] files = srcFile.listFiles();
        // 遍历所有文件
        for (File f : files) {
            try {
                fis = new FileInputStream(f);
                fos = new FileOutputStream(destFolder + "\\" + f.getName());
                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("复制失败!");
            } finally {
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException("资源释放失败!");
                } finally {
                    try {
                        if (fis != null) {
                            fis.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("资源释放失败!");
                    }
                }
            }
        }
    }
}
