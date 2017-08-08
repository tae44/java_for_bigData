import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则 {
    public static void main(String[] args) {
        // 判断1();
        // 判断2();
        // 判断3();
        // 判断4();
        // 判断5();

        boolean flag = "2017-08-08".matches("\\d{4}-\\d{2}-\\d{2}");
        System.out.println(flag);

        String[] arr = "abc123abc12abc1234abc".split("\\d+");
        System.out.println(Arrays.toString(arr));

        String ss = "abc123abc12abc1234abc".replaceAll("\\d+", "_");
        System.out.println(ss);
    }

    private static void 判断5() {
        // 根据正则表达式进行替换
        String s = "abc123abc12abc1234abc";
        String regex = "\\d+";
        String ss = Pattern.compile(regex).matcher(s).replaceAll("_");
        System.out.println(ss);
    }

    private static void 判断4() {
        // 根据正则表达式进行拆分
        String s = "abc123abc12abc1234abc";
        String regex = "\\d+";
        String[] arr = Pattern.compile(regex).split(s);
        System.out.println(Arrays.toString(arr));
    }

    private static void 判断3() {
        String s = "2017-08-08";
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        if (Pattern.compile(regex).matcher(s).matches()) {
            System.out.println("匹配成功!");
        } else {
            System.out.println("匹配失败!");
        }
    }

    private static void 判断2() {
        String s = "1234567890";
        Matcher mathcher = Pattern.compile("[0-9]+").matcher(s);
        if (mathcher.matches()) {
            System.out.println("字符串是由纯数字组成");
        } else {
            System.out.println("字符串不是由纯数字组成");
        }
    }

    private static void 判断1() {
        // 判断一个字符串是否是由纯数字组成
        String s = "1234567890d";
        char[] chs = s.toCharArray();
        boolean flag = true;
        for (char c : chs) {
            if (c < '0' | c > '9') {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("字符串是由纯数字组成");
        } else {
            System.out.println("字符串不是由纯数字组成");
        }
    }
}
