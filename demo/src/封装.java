public class 封装 {
    public static void main(String[] args) {
        M3 m = new M3();
        m.name = "jeff";
        m.setAge(30);
//        m.age = -30;
        m.speak();
        System.out.println(m.getAge());
    }
}

class M3 {
    public String name;
//    public int age;
    private int age; // 私有,仅当前类可以使用

    public void speak() {
        System.out.println("我是" + name + ", 年龄是" + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("传入的年龄有问题!");
            return;
        }
    }

    public int getAge() {
        return this.age;
    }
}
