import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Chinese("jeff", 30));
        list.add(new Chinese("jane", 19));
        list.add(new Chinese("jason", 32));
        list.add(new Chinese("jicky", 27));
        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        list.add(5); // list.add(new Integer(5))
    }
}

class Chinese {
    private String name;
    private int age;

    public Chinese() {
        super();
    }

    public Chinese(String name, int age) {
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
        return "Chinese [name=" + name + ", age=" + age + "]";
    }
}
