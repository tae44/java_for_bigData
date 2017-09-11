package day05.练习;

// 计算长方形和圆形的面积
public class t3 {
    public static void main(String[] args) {
        System.out.println(getArea(3));
        System.out.println(getArea(3, 5));
    }

    public static int getArea(int a, int b) {
        return a * b;
    }

    public static double getArea(double r) {
        return 3.14 * r * r;
    }
}
