package day11.练习1;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        work(a1);
        work(a2);
        // 需要强制转换一下类型
        Cat c = (Cat) p();
        System.out.println(c.getClass());
    }

    public static void work(Animal a) {
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.eat();
            c.catchMouse();
        } else {
            Dog d = (Dog) a;
            d.eat();
            d.keepHome();
        }
    }

    // 如果一个方法的返回值类型是父类,那么能否返回一个子类对象
    public static Animal p() {
        Cat c = new Cat();
        return c;
    }
}
