import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
        m.put(1, "jeff");
        m.put(2, "iooi");
        m.put(3, "jason");
        m.put(4, "alex");
        m.put(5, "eric");
        Set<Integer> s = m.keySet();
        Iterator<Integer> i = s.iterator();
        while (i.hasNext()) {
            Integer key = i.next();
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
