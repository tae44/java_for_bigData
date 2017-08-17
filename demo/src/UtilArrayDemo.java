import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilArrayDemo {
    public static void main(String[] args) {
        // fill();
        String[] arr = {"abc", "def", "xxoo"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list.contains("abc"));
        List<String> list1 = new ArrayList(list);
        System.out.println(list1);
        list1.add("kkk");
        System.out.println(list1);
    }

    public static void fill() {
        int[] arr = new int[5];
        // 设值
        Arrays.fill(arr, 8);
        System.out.println(Arrays.toString(arr));
    }
}
// 已复习
