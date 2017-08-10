import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    Collection 根接口
    List 有序的 可以存储重复的元素
    Set  无序的 不可以存储重复的元素

    List
        ArrayList
        LinkedList
        Vector(不常用,已经被ArrayList取代)
 */

public class 集合 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("Hadoop");
        c.add("Spark");
        c.add("Strom");

        // method1();
        // method2();
        // method3(c);
        method4(c);
    }

    public static void method4(Collection c) {
        // 使用for循环进行元素的遍历,优先考虑这种方式
        for (Iterator i = c.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
    }

    public static void method3(Collection c) {
        // 使用迭代器进行元素的遍历
        Iterator i = c.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            String s = (String) obj;
            System.out.println(s + ":" + s.length());
            // System.out.println(i.next());  Exception in thread "main" java.util.NoSuchElementException
        }
    }

    public static void method2() {
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("Hadoop");
        c1.add("Spark");
        c1.add("Strom");
        c2.add("Hadoop");
        c2.add("Spark");
        c2.add("Strom");
        c2.add("Linux");
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        // 添加集合元素
        // c1.addAll(c2);
        // 把两个集合中的相同元素删除
        // c1.removeAll(c2);
        // 判断c2中是否包含c1的所有元素
        // boolean b = c2.containsAll(c1);
        // 取交集,取公共部分的元素,如果c2包含c1中的所有元素则返回true
        // boolean b = c2.retainAll(c1);
        // System.out.println(b);
    }

    public static void method1() {
        Collection coll = new ArrayList();
        // 添加元素
        coll.add("Hello");
        coll.add("World");
        coll.add("Hadoop");
        // 删除元素
        // coll.remove("Hello");
        // 清空
        // coll.clear();
        // 判断是否为空集合
        // System.out.println(coll.isEmpty());
        // 判断是否包含某个元素
        // System.out.println(coll.contains("Hadoop"));
        System.out.println(coll);
    }
}
