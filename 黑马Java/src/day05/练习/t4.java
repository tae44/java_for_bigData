package day05.练习;

// 打印1到100之内的整数,但数字中包含9的要跳过,每行输出5个满足条件的数,之间用空格分隔
public class t4 {
    public static void main(String[] args) {
        p();
    }

    public static void p() {
        int count = 0;
        for (int i = 1; i < 100; i++) {
            String s = Integer.toString(i);
            if (s.contains("9")) {
                continue;
            }
            if (count % 5 == 0) {
                System.out.println();
            }
            count += 1;
            System.out.print(s + " ");
        }
    }
}
