package day22.练习;

/*
    1.使用文件名称过滤器筛选将指定文件夹下的小于200K的小文件获取并打印。
    2.从键盘接收一个文件夹路径,统计该文件夹大小。
    3.从键盘接收一个文件夹路径,删除该文件夹。
    4.从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
	例如:
	aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
	aaa
		bbb.txt
		ccc.txt
		ddd.txt
		eee
			fff.txt
			ggg.txt
5.键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数,注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
	用个数作为value,放入到map集合中,并用两种方式遍历map集合
	例如：
	doc 的类型的文件有  3 个
	java 的类型的文件有  5 个
	txt 的类型的文件有  7 个
 */

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    // 求和,重复字符串中均用到此属性
    private static int s = 0;
    // 记录缩进的变量
    private static String temp = "";
    // 记录文件类型及数量的map
    private static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        File file = new File(new Scanner(System.in).nextLine());
        // f1(file);
        // f2(file);
        // System.out.println(sum);
        // f3(file);
        // f4(file);
        f5(file);
        for (String key : map.keySet()) {
            System.out.println(key + " 类型的文件有 " + map.get(key) + " 个");
        }
    }

    public static void f5(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                f5(f);
            } else {
                // 获取后缀
                String[] suffixs = f.getName().split("\\.");
                String suffix = suffixs[suffixs.length - 1];
                if (map.containsKey(suffix)) {
                    Integer i = map.get(suffix);
                    map.put(suffix, ++i);
                } else {
                    map.put(suffix, 1);
                }
            }
        }
    }

    public static void f4(File file) {
        if (s == 0) {
            System.out.println(file.getName());
            // 每往下一层,\t多一个
            temp = getString("\t", ++s);
        } else {
            System.out.println(temp + file.getName());
            temp = getString("\t", ++s);
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                f4(f);
            } else {
                System.out.println(temp + f.getName());
            }
        }
    }

    public static void f3(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    public static void f2(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                f2(f);
            } else {
                s += f.length();
            }
        }
    }

    public static void f1(File file) {
        File[] files = file.listFiles(new MyFilter());
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f);
            }
        }
    }

    // 重复字符串的方法
    public static String getString(String s, int n) {
        String other = "";
        for (int i = 0; i < n; i++) {
            other += s;
        }
        return other;
    }
}
