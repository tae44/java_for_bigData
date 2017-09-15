package day12.练习1;

public class JavaEE extends Developer {
    public JavaEE(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + "..." + getId() + "...开发淘宝");
    }
}
