public class Person {
    // 权限修饰符,修饰成员变量
    public String name; // 公共的,任何类中都能用
    protected int age;
    private String sex; // 当前类可用

    // static, final, absract
    // static 类方法,直接使用类名即可调用
//    public static void main(String[] args) {
//
//    }

    public void sleep() {
        System.out.println("我睡觉了");
    }
}

class Test{
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name); // 有初始值
        System.out.println(p.age);
        p.sleep();
    }
}
