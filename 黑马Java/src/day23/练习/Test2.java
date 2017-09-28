package day23.练习;

/*
    获取指定目录及子目录下所有txt文件的个数，并将这些txt文件复制到D盘下任意目录
    还未实现连同目录一起复制
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    // 存储txt文件路径的list
    private static List<File> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入指定目录:");
        String srcFolder = sc.nextLine();
        p(srcFolder);
        System.out.println("请输入目的目录:");
        String destFolder = sc.nextLine();
        mkdirDir(destFolder);
        copyFile(destFolder);
    }

    public static void copyFile(String destFolder) {
        FileReader fr = null;
        FileWriter fw = null;
        for (File f : list) {
            try {
                fr = new FileReader(f);
                fw = new FileWriter(destFolder + "\\" + f.getName());
                char[] c = new char[1024];
                int len;
                while ((len = fr.read(c)) != -1) {
                    fw.write(c, 0, len);
                    fw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("复制失败!");
            } finally {
                try {
                    if (fw != null) {
                        fw.close();
                    }
                } catch (IOException e) {
                    throw new RuntimeException("资源释放失败!");
                } finally {
                    try {
                        if (fr != null) {
                            fr.close();
                        }
                    } catch (IOException e) {
                        throw new RuntimeException("资源释放失败!");
                    }
                }
            }
        }
    }

    // 获取指定目录及子目录下所有txt文件,并存到list中
    public static void p(String path) {
        File file = new File(path);
        File[] files = file.listFiles(new MyFilter());
        for (File f : files) {
            if (f.isDirectory()) {
                p(f.toString());
            } else {
                list.add(f);
            }
        }
    }

    // 创建不存在的目录
    public static void mkdirDir(String path) {
        File pathFile = new File(path);
        if (!pathFile.exists()) {
            pathFile.mkdirs();
        }
    }
}

// 过滤txt文件
class MyFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.toString().endsWith(".txt");
    }
}
