public class 汽车额外功能练习 {
    public static void main(String[] args) {
        GpsCar car = new GpsCar("奥迪", 60);
        System.out.println(car.getLovation());
    }
}

class Car {
    String name;
    double speed;

    public Car(String name, double speend) {
        this.name = name;
        this.speed = speend;
    }
}

interface GPS {
    public String getLovation();
}

class GpsCar extends Car implements GPS {
    public GpsCar(String name, double speend) {
        super(name, speend);
    }

    @Override
    public String getLovation() {
        return super.name + "的坐标是: " + super.speed + "," + super.speed;
    }
}
