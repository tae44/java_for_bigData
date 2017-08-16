/*
    1.final可以修饰类,方法,变量
    2.final修饰的类不可以被继承
    3.final修饰的方法不可以被覆盖
    4.final修饰的变量是一个常量,只能被赋值一次
 */
public class final修饰符 {
    public static void main(String[] args) {
        M9 m = new M9();
        m.show();
        // m.id = 10;
    }
}

/*final*/ class M8 {
    /*final*/ public void show() {
        System.out.println("父类show方法");
    }
}

class M9 extends M8 {
    final public static int id = 10;
    public void show() {
        System.out.println("子类show方法");
    }
}
// 已复习
