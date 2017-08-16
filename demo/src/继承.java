public class 继承 {
    public static void main(String[] args) {
        M5 m1 = new M5();
        m1.name = "jeff";
        m1.age = 30;
        m1.study();
        m1.sleep1();

        M6 m2 = new M6();
        m2.name = "jason";
        m2.age = 34;
        m2.teach();
        m2.sleep1();
    }
}

/*
    继承:
    1.提高代码的复用性
    2.让类和类之间产生关系,提供了多态的前提
    3.JAVA不支持多继承
    4.Java支持多层继承
    5.默认继承隐藏父类Object
 */

// 父类
class Humen {
    String name;
    int age;

    public void sleep1() {
        System.out.println(name + "睡觉了");
    }

    // 父类中的私有方法不可以被覆盖
    private void sleep2() {
        System.out.println(name + "睡觉了");
    }
}

// 子类
class M5 extends Humen {
    void study() {
        System.out.println(name + " study " + age);
    }

    /*
        重写父类方法注意事项：
          1.覆盖时,子类方法权限一定要大于等于父类方法权限
          2.静态只能覆盖静态
     */
    @Override
    public void sleep1() {
        // super.sleep1();
        System.out.println(name + "不睡");
    }
}

class M6 extends Humen {
    void teach() {
        System.out.println(name + " teach " + age);
    }
}
// 已复习
