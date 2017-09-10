package day04;

import java.util.Arrays;
import java.util.Scanner;

/*
    键盘录入三个整数，按照从小到大的顺序输出
 */
public class 三个整数比大小 {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(",");
        Arrays.sort(str);
        int a = Integer.valueOf(str[0]);
        int b = Integer.valueOf(str[1]);
        int c = Integer.valueOf(str[2]);
        System.out.println(a + " " + b + " " + c);
    }
}
