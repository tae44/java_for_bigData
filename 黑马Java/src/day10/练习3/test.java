package day10.练习3;

public class test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setColor("黑色");
        c.setLeg(4);

        Dog d = new Dog();
        d.setColor("白色");
        d.setLeg(4);

        c.eat();
        c.catchMouse();
        d.eat();
        d.lookHome();
    }
}
