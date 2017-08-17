import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        // method1(m);
        method2(m);
    }

    public static void method2(Map<Integer, String> m) {
        m.put(1, "jeff");
        m.put(2, "iooi");
        m.put(3, "jason");
        m.put(4, "alex");
        m.put(5, "eric");
        // 遍历1:取出所有的key,通过key获取value值,因为key是唯一的
        Set<Integer> s1 = m.keySet();
        Iterator<Integer> i1 = s1.iterator();
        while (i1.hasNext()) {
            Integer key = i1.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
        // 遍历2:取出所有的value,无法获取key值,因为value不是唯一的
        Collection<String> c = m.values();
        Iterator<String> i2 = c.iterator();
        while (i2.hasNext()) {
            String value = i2.next();
            System.out.println(value);
        }
        // 遍历3:把所有的key-value对取出,然后通过键值对取出key和value
        Set<Map.Entry<Integer, String>> s2 = m.entrySet();
        Iterator<Map.Entry<Integer, String>> i3 = s2.iterator();
        while (i3.hasNext()) {
            Map.Entry<Integer, String> entry = i3.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }

    public static void method1(Map<Integer, String> m) {
        System.out.println(m.put(1, "jeff"));
        // 如果之前没有key,返回的是null,如果有,返回上次添加的value值
        System.out.println(m.put(1, "jason"));
        System.out.println(m.put(6, "ioi"));
        System.out.println(m.put(5, "alex"));
        // 删除,返回的是被删除的value值
        System.out.println(m.remove(5));
        // 判断是否包含key
        // System.out.println(m.containsKey(6));
        // 返回键值对的个数
        // System.out.println(m.size());
        System.out.println(m);
    }
}
// 已复习
