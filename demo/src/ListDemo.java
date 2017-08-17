import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List list =  new ArrayList();
        list.add("Hadoop");
        list.add("Storm");
        list.add("Spark");

        // method1(list);
        // method2(list);
        // method3(list);
        method4(list);
    }

    // 列表迭代器,可以在遍历中修改迭代器
    public static void method4(List list) {
        ListIterator i = list.listIterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (s.equals("Storm")) {
                i.add("java");
            }
        }
        System.out.println(list);
        System.out.println("------------");
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }
        System.out.println(list);
    }

    /*
        Exception in thread "main" java.util.ConcurrentModificationException
        不允许修改迭代器
     */
    public static void method3(List list) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (s.equals("Storm")) {
                list.add("Java");
            } else {
                System.out.println(s);
            }
        }
    }

    public static void method2(List list) {
        // 通过迭代器进行遍历
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("------------");
        // 通过for循环和get进行遍历
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
    }

    public static void method1(List list) {
        System.out.println(list);
        // 在指定的位置插入元素
        // list.add(1, "Linux");
        // 删除指定位置的元素,返回被删除的元素
        // Object obj = list.remove(1);
        // System.out.println(obj);
        // 修改指定位置的元素,返回被修改的元素
        // Object obj = list.set(2, "Linux");
        // System.out.println(obj);
        // 获取指定位置的元素
        // System.out.println(list.get(0));
        // 获取指定位置的子列表
        System.out.println(list.subList(1, 2));
    }
}
// 已复习
