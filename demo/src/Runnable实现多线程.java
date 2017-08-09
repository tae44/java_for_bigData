public class Runnable实现多线程 {
    public static void main(String[] args) {
        M17 m = new M17();
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        t1.start();
        t2.start();
    }
}

class M17 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "..." + i);
        }
    }
}
