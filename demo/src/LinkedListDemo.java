import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // method1();
        DuiLie d = new DuiLie();
        d.add("1");
        d.add("2");
        d.add("3");
        d.add("4");
        while (!d.isEmpty()) {
            System.out.println(d.get());
        }
    }

    public static void method1() {
        LinkedList l = new LinkedList();
        l.addFirst("Hadoop");
        l.addFirst("Storm");
        l.addFirst("Spark");
        // 获取第一个元素
        // System.out.println(l.getFirst());
        // 删除第一个元素,并返回被删除的元素
        // System.out.println(l.removeFirst());
        while (!l.isEmpty()) {
            // l.removeFirst();
            l.removeLast();
            System.out.println(l);
        }
    }
}

/*
    使用LinkedList模拟一个队列
    队列:先进先出  addFirst和removeLast共同使用
    堆栈:先进后出  addLast和removeLast共同使用
*/
class DuiLie {
    private LinkedList link;

    public DuiLie() {
        link = new LinkedList();
    }

    public void add(Object obj) {
        link.addFirst(obj);
    }

    public Object get() {
        return link.removeLast();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }
}
// 已复习
