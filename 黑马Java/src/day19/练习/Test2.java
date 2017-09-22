package day19.练习;

/*
    将 goOd gooD stUdy dAy dAy up 每个单词的首字母转换成大写其余还是小写字母
 */

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "goOd gooD stUdy dAy daY uP";
        String[] ret = str.split("\\W");
        for (String s : ret) {
            s = s.toLowerCase();
            s = s.substring(0, 1).toUpperCase() + s.substring(1);
            list.add(s);
        }
        String result = list.toString().replaceAll("[\\[\\],]", "");
        System.out.println(result);
    }
}
