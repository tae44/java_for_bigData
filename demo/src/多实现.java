/*
    接口是特殊的抽象类 不能实例化
    抽象类:
        需要被继承,而且是单继承
        定义了抽象方法和非抽象方法,子类继承后,可以直接使用非抽象方法
        is a的关系,基本共性功能
    接口:
        需要被实现,多实现
        所有的方法都是抽象方法,必须由子类实现
        like a的关系,额外功能
 */
public class 多实现 {
    public static void main(String[] args) {
        M11 m  = new M11();
        m.show();
        m.show1();
        m.show2();
    }
}

interface J2 {
    public void show();
    public void show1();
}

interface J3 {
    public void show();
    public void show2();
}

interface J4 extends J2, J3 {
    // 接口可以多继承
    public void show4();
}

class M12 {
    // 继承的同名方法不会覆盖接口的
    public void show1() {
        System.out.println("show111...");
    }
}

class M11 extends M12 implements J2, J3 {
    // 共同的实现一次即可
    @Override
    public void show() {
        System.out.println("show...");
    }

    @Override
    public void show1() {
        System.out.println("show1...");
    }

    @Override
    public void show2() {
        System.out.println("show2...");
    }
}

// 需要实现所有的方法
class M13 implements J4 {
    @Override
    public void show() {
        System.out.println("show M13...");
    }

    @Override
    public void show1() {
        System.out.println("show M13...");
    }

    @Override
    public void show2() {
        System.out.println("show M13...");
    }

    @Override
    public void show4() {
        System.out.println("show M13...");
    }
}
