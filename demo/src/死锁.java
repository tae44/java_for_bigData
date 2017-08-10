/*
    两条线程都在等待彼此先完成,造成了程序的停滞
 */

public class 死锁 {
    public static void main(String[] args) {
        M18 m1 = new M18();
        M18 m2 = new M18();
        m1.flag = true;
        m2.flag = false;
        Thread ta = new Thread(m1);
        Thread tb = new Thread(m2);
        ta.start();
        tb.start();
    }
}

class M18 implements Runnable{
    private static ZhangSan zs = new ZhangSan();
    private static LiSi ls = new LiSi();
    public boolean flag;

    @Override
    public void run() {
        if (flag) {
            // 张三先说
            synchronized (zs) {
                zs.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ls) {
                    zs.get();
                }
            }
        } else {
            // 李四先说
            synchronized (ls) {
                ls.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs) {
                    ls.get();
                }
            }
        }
    }
}

class ZhangSan {
    public void say() {
        System.out.println("张三对李四说:你先把你的画给我,我就把书给你");
    }

    public void get() {
        System.out.println("张三得到了书");
    }
}

class LiSi {
    public void say() {
        System.out.println("李四对张三说:你先把你的书给我,我就把画给你");
    }

    public void get() {
        System.out.println("李四得到了书");
    }
}
