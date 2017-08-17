import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // 存入的顺序和取出的顺序不一致,不能存在重复的元素
        HashSet s = new HashSet();
//        s.add("bbb");
//        s.add("ccc");
//        s.add("fff");
//        s.add("aaa");
//        s.add("bbb");
//        s.add(new String("bbb"));

        // 重写Japenses的equals()和hashCode()方法可以去重
        s.add(new Japenese("ytg", 21));
        s.add(new Japenese("vds", 14));
        s.add(new Japenese("ioi", 29));
        s.add(new Japenese("ioi", 29));
        Iterator i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

class Japenese {
    private String name;
    private int age;

    public Japenese() {
        super();
    }

    public Japenese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Japenese [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Japenese japenese = (Japenese) o;

        if (age != japenese.age) return false;
        return name != null ? name.equals(japenese.name) : japenese.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
// 已复习
