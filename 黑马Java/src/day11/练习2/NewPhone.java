package day11.练习2;

public class NewPhone extends Phone implements IPlay {
    @Override
    public void playGame() {
        System.out.println("玩游戏...");
    }
}
