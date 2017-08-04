public class 继承 {
    public static void main(String[] args) {
        M5 m1 = new M5();
        m1.name = "jeff";
        m1.age = 30;
        m1.study();

        M6 m2 = new M6();
        m2.name = "jason";
        m2.age = 34;
        m2.teach();
    }
}

/*
    继承:
    1.提高代码的复用性
    2.让类和类之间产生关系,提供了多态的前提
    3.JAVA不支持多继承
    4.默认继承隐藏父类Object
 */

// 父类
class Humen {
    String name;
    int age;
}

// 子类
class M5 extends Humen {
    void study() {
        System.out.println(name + " study " + age);
    }
}

class M6 extends Humen {
    void teach() {
        System.out.println(name + " teach " + age);
    }
}
