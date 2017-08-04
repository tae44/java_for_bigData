public class UUtil {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("函数内 " + "a: " + a + ", b: " + b);
    }

    // 方法重载
    public static void swap(Data d) {
        int temp = d.a;
        d.a = d.b;
        d.b = temp;
    }
}

class Data {
    public int a;
    public int b;
}

class M1 {
    public static void main(String[] args) {
        int c = UUtil.add(1, 2);
        System.out.println(c);

        int a = 5;
        int b = 8;
        UUtil.swap(a, b); // 传参数只是传的副本,值本身没改变
        System.out.println("函数外 " + "a: " + a + ", b: " + b);

        Data d = new Data();
        d.a = 10;
        d.b = 20;
        UUtil.swap(d);
        System.out.println("Data函数: " + "d.a: " + d.a + ", d.b: " + d.b);
    }
}
