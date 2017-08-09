public class 多线程 {
    public static void main(String[] args) {
//        new M16();
//        new M16();
//        new M16();
//        System.gc();  启动垃圾回收器,但是并不代表马上就进行垃圾回收

        M16 m1 = new M16("first");
        M16 m2 = new M16("second");
        m1.start();
        m2.start();
        // m1.run();  使用run方法还是单线程
        // m2.run();
        int i = 1 / 0;
        System.out.println("main over");
    }
}

class M16 extends Thread{

    private String name;

    public M16(String name) {
        super(name);
        // this.name = name;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            for (long j = 0; j < 9999; j++) { }
            int[] arr = new int[3];
            System.out.println(arr[4]);
            // getName() 获取线程的名字
            // Thread.currentThread() 获取当前正在执行的线程
            System.out.println(Thread.currentThread().getName() + "..." + i + "..." + name);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("垃圾回收");
    }
}
