public class 子类方法重写 {
    public static void main(String[] args) {
        Ostrich o = new Ostrich();
        o.fly();
    }
}

class Bird {
    public void fly() {
        System.out.println("我会飞");
    }
}

// 鸵鸟子类重写了父类的方法
class Ostrich extends Bird {
    // 如果该方法不是从父类中继承的,即使同名也不叫重写
    public void fly() {
        // 调用父类的方法
        super.fly();
        System.out.println("我不会飞");
    }
}

/*
    重载:同一个类里同名不同参数的方法
    重写,覆盖:子类包含父类中同名的方法
 */
