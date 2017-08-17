import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("Hadoop");
        v.addElement("Storm");
        v.addElement("Spark");

        // 通过elements()方法进行遍历
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // 通过迭代器方式进行遍历
        Iterator i = v.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
// 已复习
