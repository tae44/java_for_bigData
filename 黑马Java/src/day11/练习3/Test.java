package day11.练习3;

public class Test {
    public static void main(String[] args) {
        CommonCar cc = new CommonCar();
        cc.setBrand("科鲁兹");
        SeniorCar sc = new SeniorCar();
        sc.setBrand("奥迪");
        cc.run();
        sc.run();
        sc.autoDrive();
        sc.parking();
    }
}
