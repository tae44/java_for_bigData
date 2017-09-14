package day11.练习1;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        work(a1);
        work(a2);
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
}
