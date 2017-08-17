public class PriorityThread {
    public static void main(String[] args) {
        // 线程优先级越高,线程执行的几率就越高
        M22 m1 = new M22("低级");
        M22 m2 = new M22("普通级");
        M22 m3 = new M22("高级");
        m1.setPriority(Thread.MIN_PRIORITY);  // 1
        m2.setPriority(Thread.NORM_PRIORITY); // 5
        m3.setPriority(Thread.MAX_PRIORITY);  // 10
        m1.start();
        m2.start();
        m3.start();
        // main的优先级是5,NORM_PRIORITY
        System.out.println(Thread.currentThread().getPriority());
    }
}

class M22 extends Thread {
    public M22(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
// 已复习
