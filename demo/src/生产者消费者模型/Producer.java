package 生产者消费者模型;

public class Producer implements Runnable {

    private Resource res;
    public Producer(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            res.set("商品");
        }
    }
}
