package day32.练习;

/*
    写一个方法，此方法可以获取obj对象中名为propertyName的属性的值
	public Object getProperty(Object obj, String propertyName, Object value){}
 */

public class Test6 {
    public static void main(String[] args) {

    }

    public Object getProperty(Object obj, String propertyName, Object value){
        return null;
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
