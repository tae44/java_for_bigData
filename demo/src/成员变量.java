public class 成员变量 {
    public String name;     // 实例成员变量
    public static int age;  // 类成员变量,只有一个

    public void setName(String s) {
        name = s; // s为局部变量
    }

    {
        // 局部变量
        int a;
    }
}

class M2 {
    public static void main(String[] args) {
//        System.out.println(成员变量.age);
//
//        成员变量 b = new 成员变量();
//        b.setName("jeff");
//        b.age = 15;
//        System.out.println(b.name);
//        System.out.println(b.age);
//
//        System.out.println(成员变量.age);

        成员变量 b1 = new 成员变量();
        成员变量 b2 = new 成员变量();
        b1.name = "b1";
        b1.age = 15;
        b2.name = "b2";
        b2.age = 20;   // 会覆盖b1.age的值

        System.out.println(b1.name);
        System.out.println(b1.age);
        System.out.println(b2.name);
        System.out.println(b2.age);
    }
}
// 已复习
