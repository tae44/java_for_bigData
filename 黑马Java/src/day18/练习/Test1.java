package day18.练习;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        frequency(list, "xxx");
    }

    public static void frequency(List<String> list, String key) {
        int count = 0;
        for (String s : list) {
            if (s.equals(key)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
