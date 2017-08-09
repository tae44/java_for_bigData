public class 包装类的新特性 {
    public static void main(String[] args) {
        // 自动拆装箱();
        // int i = 127;
        int i = 128;
        Integer a = new Integer(i);
        Integer b = new Integer(i);
        System.out.println(a == b);
        System.out.println(a.equals(b));

        Integer x = i;
        Integer y = i;
        System.out.println(x == y); // 127 true ; 128 false
        System.out.println(x.equals(y));
        /*
            jdk 1.5 引入自动装箱,如果装箱的是一个字节,那么该数据会共享空间,不会重新开辟内存
         */
    }

    private static void 自动拆装箱() {
        int num = 4;
        num = num + 5;

        Integer i = 4; // Integer i = new Integer(4);        自动装箱,书写简化,基本数据类型变成Integer类型的对象
        // i = null;
        i = i + 5;     // i = new Integer(i.intValue() + 5)  自动拆箱,书写简化,Integer类型的对象变成int类型的值
        System.out.println(i);
    }
}
