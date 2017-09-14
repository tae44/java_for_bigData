package day10.练习3;

public class Dog extends Animal {
    public void lookHome() {
        System.out.println(getClass().toString().substring(16,19) + "正在看家...");
    }

    @Override
    public void eat() {
        System.out.println(getClass().toString().substring(16,19) + "正在吃狗粮...");
    }
}
