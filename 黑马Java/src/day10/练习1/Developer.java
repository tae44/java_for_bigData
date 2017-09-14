package day10.练习1;

public class Developer extends Person {
    @Override
    public void work() {
        System.out.println(getName() + " " + getID() + " " + getSalary());
    }
}
