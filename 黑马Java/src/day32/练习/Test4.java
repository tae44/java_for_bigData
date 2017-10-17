package day32.练习;

/*
    写一个方法，此方法可将obj对象中名为propertyName的属性的值设置为value
	public void setProperty(Object obj, String propertyName, Object value){}
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test4 {
    private static Class c;

    public static void main(String[] args) throws Exception {
        Class t = Class.forName("day32.练习.Test4");
        Object obj1 = t.newInstance();
        Method method = t.getMethod("setProperty", Object.class, String.class, Object.class);
        c = Class.forName("day32.练习.B");
        Object obj2 = c.newInstance();
        method.invoke(obj1, obj2, "name", "Jeff");
        method.invoke(obj1, obj2, "age", 15);
        System.out.println(obj2);
    }

    public void setProperty(Object obj, String propertyName, Object value) throws Exception {
        Field field = c.getField(propertyName);
        field.set(obj, value);
    }
}

class B {
    public String name;
    public int age;

    public B() {}

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
