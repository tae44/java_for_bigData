package day13.练习;

public class NewPhone extends Phone {
    @Override
    public void call() {
        System.out.println("打电话...");
    }

    @Override
    public void sendMessage() {
        System.out.println("发信息...");
    }
}
