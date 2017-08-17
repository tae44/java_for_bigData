package 生产者消费者模型;

public class Resource {

    private String name;
    private int count = 1;        // 商品编号
    private boolean flag = true;  // true表示商品可以被生产(不能被消费)

    // 被生产
    public synchronized void set(String name) {
        if (!flag) {
            try {
                wait(); // 等待,进入阻塞状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName() + "***生产了***" + this.name);
        flag = false;
        notify(); // 唤醒进程
    }

    // 被消费
    public synchronized void out() {
        if (flag) {
            try {
                wait(); // 不带参数的wait()方法会使线程永久的等待下去,需要使用notify或者notifyAll方法唤醒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "***消费了***" + this.name);
        flag = true;
        notify(); // wait()、notify()、notifyAll()只能在同步块或者同步方法中使用
    }
}
// 已复习
