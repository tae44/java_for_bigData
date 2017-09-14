package day11.练习1;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    public void keepHome() {
        System.out.println("狗看家");
    }
}
