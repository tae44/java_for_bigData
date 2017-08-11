import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 存入和取出的顺序一致,不能存重复元素
        LinkedHashSet set = new LinkedHashSet();
        set.add("bbb");
        set.add("ccc");
        set.add("fff");
        set.add("aaa");
        set.add("bbb");
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
