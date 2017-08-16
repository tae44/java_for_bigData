/*
    自动类型转换：把存储范围小的类型的值赋值给存储范围大的类型的变量。
    强制类型转换：把存储范围大的类型的值赋值给存储范围小的类型的变量。
 */
public class 类型转换 {
//    public static void main(String[] args) {
//        int a = 100;
//        float f = a;   小范围 -> 大范围
//        System.out.println(f);
//
//        byte b = 5;
//        double d = b;
//        System.out.println(d);
//    }

    public static void main(String[] args) {
        int a = 100;
        byte b = (byte) a;  // 大范围 -> 小范围
        System.out.println(b);

        double a1 = 12.123;
        int b1 = (int) a1;
        System.out.println(b1);

        int a2 = 129;
        byte b2 = (byte) a2; // 溢出,当最大值加1时,结果就变成了该范围中最小的值
        System.out.println(b2);

        System.out.println('a');
        System.out.println('a' + 1); // 自动转换

        short s = 3;
        // s = s + 2;    需要强制转换
        s += 2;       // 自动类型转换
        System.out.println(s);
    }
}
// 已复习
