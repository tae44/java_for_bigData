package day32.练习;

/*
    写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
	public Object getProperty(Object obj, String propertyName, Object value){}
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test6 {
    private static Class c;

    public static void main(String[] args) throws Exception {
        Class t = Class.forName("day32.练习.Test6");
        Method method = t.getMethod("getProperty", Object.class, String.class, Object.class);
        c = C.class;
        Object obj1 = t.newInstance();
        Object obj2 = c.newInstance();
        Object o = method.invoke(obj1, obj2, "name", "jeff");
        System.out.println(o);
    }

    public Object getProperty(Object obj, String propertyName, Object value) throws Exception {
        Field field = c.getField(propertyName);
        field.set(obj, value);
        Object o = field.get(obj);
        return o;
    }
}

class C {
    public String name;
    public int age;

    public C() {}

    @Override
    public String toString() {
        return "C{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
