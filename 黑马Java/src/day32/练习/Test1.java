package day32.练习;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws Exception {
        f1();
    }

    // 泛型为Integer的ArrayList中存放一个String类型的对象
    private static void f1() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(110);
        // list.add("abc");
        Class c = list.getClass();
        Method method = c.getMethod("add", Object.class);
        method.invoke(list, "abc");
        method.invoke(list, "fff");
        System.out.println(list);
    }

    // 用反射去创建一个对象，有2种方式，尽量用代码去体现
    private static void f2() throws Exception {
        Class c = Class.forName("XXX");
        Constructor con = c.getConstructor();
        Object o1 = con.newInstance();
        Object o2 = c.newInstance();
    }
}
