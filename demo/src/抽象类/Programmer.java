package 抽象类;

public class Programmer extends Employee {
    public Programmer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("coding...");
    }
}
