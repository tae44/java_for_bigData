/*
    进程:
      进程指当前正在执行的程序,代表一个应用程序在内存中的执行区域
    线程:
      是进程中的一个执行控制单元,执行路径
      注意: 进程只是负责开辟内存空间的,线程才是负责执行代码逻辑的执行单元
 */
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
        // int i = 1 / 0;
        System.out.println("main over");
    }
}
/*
    线程的实现方式一 继承Thread类:
      1.子类覆盖父类中的run方法,将线程运行的代码存放在run中
      2.建立子类对象的同时线程也被创建
      3.通过调用start方法开启线程
    注意：如果直接调用这个对象的run方法,这时底层资源并没有完成资源的创建和执行,仅仅是简单的对象调用
    如果想要开启线程,需要去调用thread类中的另一个方法start来完成,这个方法做了两个事情, 1.开启线程 2.调用线程的run方法
 */
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
            System.out.println(arr[1]);
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
// 已复习
