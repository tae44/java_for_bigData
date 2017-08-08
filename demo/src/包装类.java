public class 包装类 {
    public static void main(String[] args) {
        // method1();
        // 进制转换();
        Integer a = new Integer("3");
        Integer b = new Integer(3);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    private static void 进制转换() {
        // 十进制 --> 其他进制
        System.out.println(Integer.toBinaryString(60));     // 二进制
        System.out.println(Integer.toOctalString(60));      // 八进制
        System.out.println(Integer.toHexString(60));        // 十六进制
        System.out.println(Integer.toString(60, 2));  // 二进制
        System.out.println(Integer.toString(60, 8));  // 八进制
        System.out.println(Integer.toString(60, 16)); // 十六进制
        System.out.println(Integer.toString(60, 3));  // 三进制

        // 其他进制 --> 十进制
        System.out.println(Integer.parseInt("111100", 2));
        System.out.println(Integer.parseInt("74", 8));
        System.out.println(Integer.parseInt("3C", 16));
    }

    private static void method1() {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        // 把int类型的值转换成Integer类型的对象
        Integer i = new Integer(3);

        // 基本数据类型 <--> String
        // 1.String --> int
        int x = Integer.parseInt("123");
        System.out.println(x + 1);

        // 2.int --> String
        String s = 1 + "";
        s = String.valueOf(1);
        s = Integer.toString(2);

        // 把字符串封装成Integer对象,Integer对象调用intValue()方法转成int类型
        Integer i1 = new Integer("123");
        int i2 = i1.intValue();
    }
}
