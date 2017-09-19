package day15.练习;

/*
    (1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
					  总共10个字母
 */

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        String s = enter();
        System.out.println(s);
    }

    public static String enter() {
        int count = 0;
        String s = new Scanner(System.in).next();
        if (!s.endsWith("end")) {
            return "必须以end结尾!";
        }
        s = s.substring(0, s.length() - 3);
        char[] cArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cArr) {
            if (c >= 'a' && c <= 'z') {
                c -= 32;
                count++;
            } else if (c >= 'A' && c <= 'Z') {
                c += 32;
                count++;
            } else {
                c = '*';
            }
            sb.append(c);
        }
        System.out.println("总共" + count + "个字母");
        return sb.toString();
    }
}
