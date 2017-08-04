public class 可变参数 {
    // 可变参数类型必须一致,且要在参数列表的最后
    public static void main(String[] args) {
        test("jjj", "ggg");
    }

    public static void test(String... arg) {
        for (String a : arg) {
            System.out.println(a);
        }
    }

    // 可变参数只能有一个
    // public static void test(String... arg1, int... arg2) {}

    public static int add(int a, int b) {
        return a + b;
    }

    // 方法重载 参数个数不同或参数类型不同
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
