package 生产者消费者模型;

public class Test {
    public static void main(String[] args) {
        Resource res = new Resource();
        Producer pro = new Producer(res);
        Consumer con = new Consumer(res);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        t1.start();
        t2.start();
    }
}
