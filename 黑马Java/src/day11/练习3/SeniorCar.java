package day11.练习3;

public class SeniorCar extends Car implements Advance {
    @Override
    public void autoDrive() {
        System.out.println(getBrand() + "可以自动驾驶");
    }

    @Override
    public void parking() {
        System.out.println(getBrand() + "可以自动泊车");
    }
}
