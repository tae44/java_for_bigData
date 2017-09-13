package day07.练习;

// 计算5+15+25+35+....+1005的和
public class t3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i <= 1005; i += 10) {
            sum += i;
        }
        System.out.println(sum);
    }
}
