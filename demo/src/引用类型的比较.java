public class 引用类型的比较 {
    public static void main(String[] args) {
        String s1 = "Hello"; // 在常量池中创建
        String s2 = "Hello";
        String s3 = new String("Hello"); // 在堆内存中创建
        String s4 = new String("Hello");

        System.out.println("s1 == S2: " + (s1 == s2));           // 比较的是内存地址
        System.out.println("s1.equals(s2): " + (s1.equals(s2))); // 比较的是值

        System.out.println("s1 == S3: " + (s1 == s3));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));

        System.out.println("s3 == S4: " + (s3 == s4));
        System.out.println("s3.equals(s4): " + (s3.equals(s4)));
    }
}
