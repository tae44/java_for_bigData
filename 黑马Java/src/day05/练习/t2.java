package day05.练习;

// 打印99乘法表
public class t2 {
    public static void main(String[] args) {
        p();
    }

    public static void p() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "  ");
            }
            System.out.println();
        }
    }
}
