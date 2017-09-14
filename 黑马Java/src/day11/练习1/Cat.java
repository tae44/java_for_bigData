package day11.练习1;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
