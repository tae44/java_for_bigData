import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class 线程池 {
    public static void main(String[] args) {
        // 创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(6);
        // 提交任务
        pool.submit(new M23());
        pool.submit(new M23());
        // 关闭线程池
        pool.shutdown();
    }
}

class M23 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }
}
// 已复习
