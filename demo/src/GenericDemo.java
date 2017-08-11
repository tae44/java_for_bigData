import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("S");
        l.add("b");
        // l.add(1);

        add("aaa");
        add(123);
    }

    public static <T> void add(T t) { }
}
