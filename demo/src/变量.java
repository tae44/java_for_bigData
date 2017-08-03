public class 变量 {
    public static void main(String[] args) {
        String name;
        String age = "2";
        name = "jeff";
        name = "jason"; // 后面会覆盖前面的
        System.out.println(name);
        System.out.println(age);

        byte b1 = 127;
//        byte b2 = 128;

        long num1 = 1234567890;
        long num2 = 12345678900L;

        float f = 9.0f;
        double d = 9.0;

        double d1 = 2.6;
        d1 -= 2;
        System.out.println(d1);

        char c = '\\';
        System.out.println(c);

        char c1 = 65;
        System.out.println(c1);

        char c2 = '\uffff';
        System.out.println(c2);
    }
}
