public class 构造方法 {
    public static void main(String[] args) {
        // M4 m = new M4();
        M4 m1 = new M4("jeff", 30);
        m1.speak();
        // 匿名对象,用完及扔
        // new M4("jason", 18).speak();
    }
}

class M4 {
    public String name;
    public int age;

    // 构造方法
    public M4() {
        System.out.println("M4实例化");
    }

    public M4(String name) {
        this.name = name;
    }

    public M4(String name, int age) {
        // this();
        // this.name = name;
        this("jeff"); // 调用的静态方法必须在第一行
        this.age = age;
    }

    public void speak() {
        System.out.println("我是" + name + ", 年龄是" + age);
        this.sleep();
    }

    public void sleep() {
        System.out.println("我睡觉啦");
    }
}
