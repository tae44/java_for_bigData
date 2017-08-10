public class YieldThread {
    public static void main(String[] args) {
        new M21().start();
        new M21().start();
    }
}

class M21 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
            if (i == 20) {
                Thread.yield(); // 暂停当前正在执行的线程对象,并执行其他线程
            }
        }
    }
}
