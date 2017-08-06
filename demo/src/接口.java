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
    /*public final static*/ int a =1;
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
