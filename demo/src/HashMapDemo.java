import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        // 在HashMap中存Ren-籍贯(String)的键值对
        HashMap<Ren, String> h = new HashMap<>();
        h.put(new Ren("jeff", 34), "北京");
        h.put(new Ren("iooi", 36), "上海");
        h.put(new Ren("alex", 33), "河南");
        h.put(new Ren("ecri", 35), "山东");
        h.put(new Ren("ecri", 35), "山东");
        Iterator<Ren> i = h.keySet().iterator();
        while (i.hasNext()) {
            Ren key = i.next();
            String value = h.get(key);
            System.out.println(key + " ==> " + value);
        }
    }
}

class Ren {
    private String name;
    private int age;

    public Ren() {
        super();
    }

    public Ren(String name, int age) {
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
        return "Ren [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ren ren = (Ren) o;

        if (age != ren.age) return false;
        return name != null ? name.equals(ren.name) : ren.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
