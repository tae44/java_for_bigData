package day15.练习;

/*
    (1)定义如下方法public static String getPropertyGetMethodName(String property);
	(2)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
	(3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
 */

public class Test2 {
    public static void main(String[] args) {
        String s = getPropertyGetMethodName("age");
        System.out.println(s);
    }

    public static String getPropertyGetMethodName(String property) {
        StringBuilder sb = new StringBuilder(property);
        String s = sb.substring(0, 1);
        sb.replace(0, 1, s.toUpperCase());
        sb.insert(0, "get");
        return sb.toString();
    }
}
