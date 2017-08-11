import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet t = new TreeSet();

        TreeSet t = new TreeSet(new ComparatorByLengthFirst());
        t.add("dfsdbqr");
        t.add("ab");
        t.add("coc");
        t.add("e");
        t.add("idd");
        t.add("xxoo");

//        TreeSet<BeijingRen> t = new TreeSet<BeijingRen>(new ComparatorByAgeFirst());
//        t.add(new BeijingRen("acc", 25));
//        t.add(new BeijingRen("bhiad", 14));
//        t.add(new BeijingRen("ioi", 27));
//        t.add(new BeijingRen("ioi", 27));
//        t.add(new BeijingRen("qwed", 31));

        Iterator i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

// Comparable 自然顺序
class BeijingRen implements Comparable {
    private String name;
    private int age;

    public BeijingRen() {
        super();
    }

    public BeijingRen(String name, int age) {
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
        return "BeijingRen [name=" + name + ", age=" + age + "]";
    }

    // 比较方式
    @Override
    public int compareTo(Object o) {
        BeijingRen b = (BeijingRen) o;
        // return age - b.age;
        int temp = this.getName().compareTo(b.getName());
        return temp == 0 ? this.getAge() - b.getAge() : temp;
    }
}

// Comparator 比较器
class ComparatorByAgeFirst implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
//        BeijingRen s1 = (BeijingRen) o1;
//        BeijingRen s2 = (BeijingRen) o2;
        int temp = ((BeijingRen) o1).getAge() - ((BeijingRen) o2).getAge();
        return temp == 0 ? ((BeijingRen) o1).getName().compareTo(((BeijingRen) o2).getName()) : temp;
    }
}

// 后面<>(泛型<T>)中如果能确定类型就写,不能就删除
class ComparatorByLengthFirst implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int temp = o1.length() - o2.length();
        return temp == 0 ? o1.compareTo(o2) : temp;
    }
}
