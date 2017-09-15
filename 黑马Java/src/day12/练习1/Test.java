package day12.练习1;

public class Test {
    public static void main(String[] args) {
//        JavaEE j = new JavaEE("Jeff", "001");
//        j.work();
//
//        Net n = new Net("Eric", "002");
//        n.work();

        // 多态调用
        Employee e1 = new JavaEE("多态1", "100");
        Employee e2 = new Net("多态2", "200");
        p(e1);
        p(e2);
    }

    public static void p(Employee e) {
        if (e instanceof JavaEE) {
            JavaEE j = (JavaEE) e;
            j.work();
        } else {
            Net n = (Net) e;
            n.work();
        }
    }
}
