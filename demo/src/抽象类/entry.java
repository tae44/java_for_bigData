package 抽象类;

public class entry {
    public static void main(String[] args) {
        Programmer p = new Programmer("jeff", 1, 10000);
        p.work();

        ProjectManager m = new ProjectManager("jason", 100, 20000, 5000);
        m.work();
    }
}
