package day10.练习1;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Jeff");
        m.setID("001");
        m.setSalary(10000.0);
        m.setBonus(3000.0);

        Developer d = new Developer();
        d.setName("Eric");
        d.setID("008");
        d.setSalary(6500.0);

        m.work();
        d.work();
    }
}
