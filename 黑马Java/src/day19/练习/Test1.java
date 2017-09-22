package day19.练习;

/*
    (1)编写一个泛形方法，实现指定位置数组元素的交换
    (2)编写一个泛形方法，接收一个任意数组，并反转数组中的所有元素
 */

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        exchange(list1,0, 1);
        exchange(list2,1, 2);
        fanzhuan(list1);
        fanzhuan(list2);
    }

    public static void exchange(List list, int first, int second) {
        Object temp1 = list.get(first);
        Object temp2 = list.get(second);
        list.set(first, temp2);
        list.set(second, temp1);
        System.out.println(list);
    }

    public static void fanzhuan(List<?> list) {
        List ret = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {
            ret.add(list.get(i));
        }
        System.out.println(ret);
    }
}
