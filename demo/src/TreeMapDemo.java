import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap<GZRen, String> h = new TreeMap<>();
        TreeMap<GZRen, String> h = new TreeMap<>(new ComparatorbyAgeFirst());
        h.put(new GZRen("jeff", 34), "北京");
        h.put(new GZRen("iooi", 32), "上海");
        h.put(new GZRen("alex", 33), "河南");
        h.put(new GZRen("ecri", 35), "山东");
        h.put(new GZRen("ecri", 34), "山东");
        Iterator<GZRen> i = h.keySet().iterator();
        while (i.hasNext()) {
            GZRen key = i.next();
            String value = h.get(key);
            System.out.println(key + " ==> " + value);
        }
    }
}

class GZRen implements Comparable {
    private String name;
    private int age;

    public GZRen() {
        super();
    }

    public GZRen(String name, int age) {
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
        return "GZRen [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Object o) {
        GZRen ren = (GZRen) o;
        int temp = this.getName().compareTo(ren.getName());
        return temp == 0 ? this.getAge() - ren.getAge() : temp;
    }
}

class ComparatorbyAgeFirst implements Comparator<GZRen> {
    @Override
    public int compare(GZRen o1, GZRen o2) {
        int temp = o1.getAge() - o2.getAge();
        return temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
    }
}
