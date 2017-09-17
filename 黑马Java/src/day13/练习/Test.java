package day13.练习;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        op.call();
        op.sendMessage();

        NewPhone np = new NewPhone();
        np.call();
        np.sendMessage();

        new PlayGame() {
            @Override
            public void playGame() {
                System.out.println("玩游戏...");
            }
        }.playGame();
    }
}
