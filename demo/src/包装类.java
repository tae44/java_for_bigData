public class 包装类 {
    public static void main(String[] args) {
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

        Integer i1 = new Integer("123");
    }
}
