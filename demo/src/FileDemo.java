import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/*
    IO流
        从设备到内存的过程叫输入
        从内存写到设备的过程叫输出
 */
public class FileDemo {
    public static void main(String[] args) {
//         method1();
//         method2();
//         method3();
//         method4();
//        method5();
        File f = new File("/Users/jason/Desktop/aa");
//         判断文件是否是文件
//         System.out.println(f.isFile());
//         判断文件是否是目录
//         System.out.println(f.isDirectory());
//        String[] names = f.list();
//        String[] names = f.list(new FilenameFilter());
//        for (String name : names) {
//            System.out.println(name);
//        }
//        File[] files = f.listFiles();
        File[] files = f.listFiles(new FilterByTxt(".txt"));
        for (File file : files) {
            System.out.println(file);
        }
    }

    // 创建和删除多级目录
    public static void method5() {
        File dir = new File("/Users/jason/Desktop/aaa/bbb/ccc");
        if (!dir.exists()) {
            dir.mkdirs();
        } else {
            dir.delete();  // 只会删除最底层的目录
        }
    }

    // 创建和删除单级目录
    public static void method4() {
        File dir = new File("/Users/jason/Desktop/ccc");
        if (!dir.exists()) {
            dir.mkdir();
        } else {
            dir.delete();
        }
    }

    // 创建和删除文件
    public static void method3() {
        File f = new File("/Users/jason/Desktop" + File.separator + "a.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            f.delete();
        }
    }

    // 获取file的属性
    public static void method2() {
        File f = new File("/Users/jason/Desktop" + File.separator + "a.txt");
        System.out.println("获取文件名: " + f.getName());
        System.out.println("获取文件的绝对路径: " + f.getAbsolutePath());
        System.out.println("获取文件的路径: " + f.getPath());
        System.out.println("获取文件的大小: " + f.length());
        System.out.println("获取文件最后修改的时间: " + f.lastModified());
    }

    // file的构造方法
    public static void method1() {
        // File.separator 根系统有关的分隔符
        File f1 = new File("/Users/jason/Desktop" + File.separator + "a.txt");
//        File f1 = new File("/Users/jason/Desktop/a.txt");
//        File f2 = new File("/Users/jason/Desktop/", "a.txt");
//        File parent = new File("/Users/jason/Desktop/");
//        File f3 = new File(parent, "a.txt");
    }
}

class FilenameFilter implements java.io.FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith("txt");
    }
}

class FilterByTxt implements FileFilter {
    private String s;

    public FilterByTxt(String s) {
        this.s = s;
    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(s);
    }
}
