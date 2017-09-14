package day10.练习1;

public class Manager extends Person {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getID() + " " + getSalary() + " " + getBonus());
    }
}
