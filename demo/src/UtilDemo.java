import java.util.*;

public class UtilDemo {
    public static void main(String[] args) {
        // 给可重复的集合排序 -- List
        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("ruyif");
        list.add("oo");
        list.add("z");
        list.add("qwertvc");
        list.add("vfss");
        list.add("bbnlk");
        Comparator<String> c = new Comparatorbylength();
        System.out.println("排序之前: " + list);
        // method1(list);
        // method2(list, c);
        // 反转指定列表中元素的顺序
        // Collections.reverse(list);
        // 替换元素
        // Collections.replaceAll(list, "asd", "@@@");
        // 把所有元素替换为指定的元素
        // Collections.fill(list, "xxoo");
        // 打乱顺序
        Collections.shuffle(list);
        System.out.println("排序之后: " + list);
    }

    public static void method2(List<String> list, Comparator c) {
//        Collections.sort(list, c);
//        String min = Collections.min(list, c);
//        System.out.println("min=" + min);
//        String max = Collections.max(list, c);
//        System.out.println("max=" + max);

        // 返回一个比较器,强行逆转指定比较强的顺序
        Comparator<String> cc = Collections.reverseOrder(c);
        Collections.sort(list, cc);
    }

    public static void method1(List<String> list) {
        Collections.sort(list);
        String min = Collections.min(list);
        System.out.println("min=" + min);
        String max = Collections.max(list);
        System.out.println("max=" + max);
    }
}

class Comparatorbylength implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int temp = o1.length() - o2.length();
        return temp == 0 ? o1.compareTo(o2) : temp;
    }
}
// 已复习
