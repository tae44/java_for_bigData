/*
    字符串是一个特殊的对象
    字符串一旦初始化就不可以被改变
 */
public class 字符串 {
    public static void main(String[] args) {
        String name = "Jason";
        System.out.println(name);
        /*
            使用String name = "Jason"这种方式的好处:
              如果一个字符串已经被一个名称引用了,那么以后再有形同的字符串声明的时候,就不再重新开辟空间了
         */
        // String s = new String();  等价于String s = "";  不等于String s = null;

        name = new String("Jeff");
        System.out.println(name);
        System.out.println("hello".equals("hello"));

        String str1 = "abc"; // 创建并存放在常量池中
        String str2 = "abc";
        System.out.println("非new创建比较: " + (str1 == str2));

        String str3 = new String("abc"); // 创建并存放在堆内存中
        String str4 = new String("abc");
        System.out.println("new创建比较: " + (str3 == str4));
        System.out.println("new创建比较(equals): " + (str3.equals(str4)));

        System.out.println("new与非new比较: " + (str1 == str3));
        System.out.println("new与非new比较(equals): " + (str1.equals(str3)));

        byte[] arr = {97, 98, 99, 100};
        String str5 = new String(arr);
        System.out.println("byte数组: " + str5);

        char[] cc = {'a', 'b', 'x', 'y'};
        String str6 = new String(cc);
        System.out.println("char数组: " + str6);

        String str7 = new String(arr, 1, 2);
        System.out.println("带参数: " + str7);
    }
}
// 已复习
