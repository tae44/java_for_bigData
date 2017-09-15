package day11.练习2;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        NewPhone np = new NewPhone();
        op.call();
        op.sendMessage();
        np.call();
        np.sendMessage();
        np.playGame();
    }
}
