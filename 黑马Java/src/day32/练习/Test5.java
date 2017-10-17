package day32.练习;

/*
    定义一个标准的JavaBean，名叫Person，包含属性name、age。
	使用反射的方式创建一个实例、调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，
	不使用setAge方法直接使用反射方式对age赋值。
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test5 {
    public static void main(String[] args) throws Exception {
        Class c = Person.class;
        Constructor con = c.getConstructor(String.class, int.class);
        Object obj = con.newInstance("Jeff", 16);
        Method method = c.getMethod("setName", String.class);
        method.invoke(obj, "XXOO");
        System.out.println(obj);

        Field field = c.getField("age");
        field.set(obj, 22);
        System.out.println(obj);
    }
}

class Person {
    public String name;
    public int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
