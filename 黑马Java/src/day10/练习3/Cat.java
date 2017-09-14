package day10.练习3;

public class Cat extends Animal {
    public void catchMouse() {
        System.out.println(getClass().toString().substring(16,19) + "正在抓老鼠...");
    }

    @Override
    public void eat() {
        System.out.println(getClass().toString().substring(16,19) + "正在吃猫粮...");
    }
}
