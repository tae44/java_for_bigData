public class DaemonDemo {
    public static void main(String[] args) {
        M20 m = new M20();
        m.setDaemon(true); // 后台线程,当前台所有线程都死亡了,后台线程也就死亡了
        m.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
        // main不是后台线程
        System.out.println(Thread.currentThread().isDaemon());
    }
}

class M20 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
        }
    }
}
