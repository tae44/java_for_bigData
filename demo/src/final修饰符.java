public class final修饰符 {
    public static void main(String[] args) {
        M9 m = new M9();
        m.show();
//        m.id = 10;
    }
}

// 被final修饰的类无法被继承
/*final*/ class M8 {
    // 被final修饰的方法无法被子类重写
    /*final*/ public void show() {
        System.out.println("父类show方法");
    }
}

class M9 extends M8 {
    // 被final修饰的变量只能被赋值一次
    final public static int id = 10;
    public void show() {
        System.out.println("子类show方法");
    }
}
