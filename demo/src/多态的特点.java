public class 多态的特点 {
    public static void main(String[] args) {
        /*
            父类引用指向子类对象:
              1.调用的成员变量是父类中的
              2.对于成员方法而言,编译时调用父类的方法,运行时调用子类的.如果子类中没有该方法,则运行父类的
              3.对于静态方法而言,编译和运行时均调用父类的方法
         */
        M14 m = new M15();
        // System.out.println(m.num);
        m.show();
    }
}

class M14 {
    // int num  = 14;
//    void show() {
//        System.out.println("M14 show...");
//    }
    static void show() {
        System.out.println("M14 show...");
    }
}

class M15 extends M14 {
    // int num = 15;
//    void show() {
//        System.out.println("M15 show...");
//    }
    static void show() {
        System.out.println("M15 show...");
    }
}
// 已复习
