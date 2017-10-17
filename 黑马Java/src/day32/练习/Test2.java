package day32.练习;

/*
    编写一个类，增加一个实例方法用于打印一条字符串。
	并使用反射手段创建该类的对象，并调用该对象中的方法。
 */

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Class c = P.class;
        Object obj = c.newInstance();
        Method method = c.getMethod("print");
        method.invoke(obj);
    }
}

class P {
    public P() {}

    public void print() {
        System.out.println("该实例方法用于打印一条字符串");
    }
}
