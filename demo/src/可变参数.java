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

    /*
        方法重载:
        1.在同一个类中,允许存在一个以上的同名方法,只要它们的参数个数或者参数类型不同即可
        2.与返回值类型无关,只看参数列表
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
// 已复习
