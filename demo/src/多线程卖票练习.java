public class 多线程卖票练习 {
    public static void main(String[] args) {
//        Ticket t1 = new Ticket();
//        Ticket t2 = new Ticket();
//        Ticket t3 = new Ticket();
//        t1.start();
//        t2.start();
//        t3.start();

        // Runnable方式可以资源共享
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
    多线程在执行的时候,可能存在安全隐患,为了解决这个问题,引入同步机制synchronized
    同步原理:
      通过一个对象锁,将多条操作共享数据的代码进行了封装并加锁。这样只有持有这个锁的线程才能操作同步中的代码。
      在这个线程执行期间,即是其他线程获得了执行权,因为没有获得锁,就只能在同步代码块外面等。只有当同步中的线程
      执行完同步代码块中的代码,才会释放这个锁,这个时候其他线程才有机会去获取这个锁,并只能有一个线程获取到锁而且进到同步中
    同步的前提:
      1.同步需要两个或两个以上的线程
      2.多个线程使用的是同一个锁
    未满足这两个条件则不能称其为同步
    好处：同步的出现解决了多线程的安全问题
    弊端：因为多个线程每次都要判断这个锁,所以效率会降低
 */

class Ticket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            sale();
        }
    }

    // 同步方法
    public synchronized void sale() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "..." + ticket--);
        }
    }
}

//class Ticket extends Thread {          方法一
//class Ticket implements Runnable {  // 方法二
//    // 有3个售票点共卖100张票
//    private int ticket = 100;
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 200; i++) {
//            // 同步代码块,线程锁
//            synchronized (this) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "..." + ticket--);
//                    // ticket -= 1;
//                }
//            }
//        }
//    }
//}
// 已复习
