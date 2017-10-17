package day32.练习;

/*
    编写一个类A，增加一个实例方法showString,用于打印一条字符串，
	用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，并调用该对象中的方法showString
 */

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入类名: ");
        String className = sc.nextLine();
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        Method method = c.getMethod("showString");
        method.invoke(obj);
    }
}

class A {
    public A() {}

    public void showString() {
        System.out.println("该方法用于打印一条字符串");
    }
}
