/*
    线程的实现方式二 Runnable接口:
      1.子类覆盖接口中的run方法
      2.通过Thread类创建线程,并将实现了Runnable接口的子类对象作为参数传递给Thread类的构造函数
      3.Thread类对象调用start方法开启线程
    继承Thread类和实现Runnable接口的区别:
      1.第一种方式的话都继承子类之后会造成资源不共享
      2.第二种的话就很方便了,实现一个接口,让多个线程去运行即可,这样就可以实现资源的共享了,所以在创建线程时建议使用第二种方式
 */
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
// 已复习
