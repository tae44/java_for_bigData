package day20.练习;

/*
    (1)定义一个学生类Student，包含属性：姓名(String name)、年龄(int age)
	(2)定义Map集合，用Student对象作为key，用字符串(此表示表示学生的住址)作为value
	(3)利用四种方式遍历Map集合中的内容，格式：key::value
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Map<Student, String> map = f1();
        f2(map);
    }

    public static Map<Student, String> f1() {
        Map<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student("a", 22), "BJ");
        studentMap.put(new Student("b", 17), "SH");
        studentMap.put(new Student("c", 24), "GZ");
        return studentMap;
    }

    public static void  f2(Map<Student, String> map) {
        // 1
        Set<Student> set = map.keySet();
        Iterator<Student> keyIt = set.iterator();
        while (keyIt.hasNext()) {
            Student key = keyIt.next();
            String value = map.get(key);
            System.out.println(key + "::" + value);
        }
        System.out.println("===============");
        // 2
        for (Student key : map.keySet()) {
            System.out.println(key + "::" + map.get(key));
        }
        System.out.println("===============");
        // 3
        Set<Map.Entry<Student, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Student, String>> entryIt = entrySet.iterator();
        while (entryIt.hasNext()) {
            Map.Entry<Student, String> entry = entryIt.next();
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
        System.out.println("===============");
        // 4
        for (Map.Entry<Student, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "::" + entry.getValue());
        }
    }
}
