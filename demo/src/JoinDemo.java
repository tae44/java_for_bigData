public class JoinDemo {
    public static void main(String[] args) {
        new M19("线程A").start();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                M19 m = new M19("线程B#####");
                m.start();
                try {
                    m.join(); // 强行插入进程,等待该线程终止之后,被插入之前的线程才能继续执行的
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}

class M19 extends Thread {
    public M19(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "***" + i);
        }
    }
}
// 已复习
