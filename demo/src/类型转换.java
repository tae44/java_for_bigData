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
        byte b = (byte)a;  // 大范围 -> 小范围
        System.out.println(b);

        double a1 = 12.123;
        int b1 = (int)a1;
        System.out.println(b1);

        int a2 = 129;
        byte b2 = (byte)a2; // 溢出
        System.out.println(b2);

        System.out.println('a');
        System.out.println('a' + 1); // 自动转换
    }
}
