package day15.练习;

/*
    (1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数
 */

public class Test3 {
    public static void main(String[] args) {
        String[] sArr = {"010","3223","666","7890987","123123"};
        p(sArr);
    }

    public static void p(String[] sArr) {
        int count = 0;
        for (String s : sArr) {
            StringBuilder sb = new StringBuilder(s);
            String s1 = sb.toString();
            String s2 = sb.reverse().toString();
            if (s1.equals(s2)) {
                count++;
                System.out.println(sb);
            }
        }
        System.out.println("对称个数为: " + count);
    }
}
