/*
    1.类与类之间是继承关系
    2.类与接口之间是实现关系
    3.接口与接口之间是继承关系,通过接口可以多继承
    4.interface C implements A,B  A和B必须都是接口

    抽象类和接口的区别:
     1.抽象类只能被单继承,而接口可以被多实现
     2.抽象类中可以定义非抽象方法,直接被子类使用;接口中只有抽象方法,必须被子类实现后才可以被使用
     3.抽象类中定义体系中的基本共性功能,接口中通常定义体系中对象的扩展功能
 */
public class 接口 {
    public static void main(String[] args) {
        M10 m = new M10();
        m.show1();
        m.show2();
        System.out.println(J1.a);
        System.out.println(m.a);
    }
}

// 接口中所有的方法都是抽象方法
interface J1 {
    // 接口中定义的变量为常量,默认的修饰符就是public final static
    /*public final static*/ int a = 1;
    // 接口中定义的方法默认的修饰符就是public abstract
    /*public abstract*/ void show1();
    /*public abstract*/ void show2();
}

class M10 implements J1 {
    @Override
    public void show1() {
        System.out.println("show1...");
    }

    @Override
    public void show2() {
        System.out.println("show2...");
    }
}
// 已复习
