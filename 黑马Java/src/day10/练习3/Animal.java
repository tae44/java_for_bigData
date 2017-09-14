package day10.练习3;

public abstract class Animal {
    private String color;
    private int leg;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

//    public void eat() {
//        System.out.println(getClass().toString().substring(16,19) + "正在吃饭...");
//    }
    public abstract void eat();
}
