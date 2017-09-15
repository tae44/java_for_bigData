package day11.练习3;

public class Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void run() {
        System.out.println(brand + "正在跑...");
    }
}
