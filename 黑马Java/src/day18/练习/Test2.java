package day18.练习;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("f");
        list.add("e");
        list.add("c");
        list.add("a");
        list.add("d");
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<String> list) {
        for (int a = 0; a < list.size(); a++) {
            for (int b = 0; b < list.size(); b++) {
                if (list.get(a).toCharArray()[0] < list.get(b).toCharArray()[0]) {
                    String temp = list.get(a);
                    list.set(a, list.get(b));
                    list.set(b, temp);
                }
            }
        }
    }
}
