package day12.练习1;

public class Net extends Maintainer {
    public Net(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println(getName() + "..." + getId() + "...正在检查网络是否畅通");
    }
}
