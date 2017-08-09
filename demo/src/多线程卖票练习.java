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
    使用同步每次都要进行标志位的判断,所以效率低
    同步的前提:
      1.同步需要两个或两个以上的线程
      2.多个线程使用的是同一个锁
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
