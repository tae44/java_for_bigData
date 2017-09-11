package day05.练习;

import java.util.Scanner;

// 键盘录入两个数据,求两个数据之和
public class t1 {
    public static void main(String[] args) {
        String[] arr = createNum();
        System.out.println(compareNum(arr));
    }

    public static String[] createNum() {
        return new Scanner(System.in).nextLine().split(",");
    }

    public static int compareNum(String[] arr) {
        return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
    }
}
