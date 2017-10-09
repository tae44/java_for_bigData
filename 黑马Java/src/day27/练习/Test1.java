package day27.练习;

/*
    有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池用一个数组int[] arr = {10,5,20,50,100,200,500,800,2,80,300};
	创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”，随机从arr数组中获取奖项元素并打印在控制台上,格式如下:

	抽奖箱1 又产生了一个 10 元大奖
	抽奖箱2 又产生了一个 100 元大奖
	.....
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        BonusPool bp = new BonusPool();
        Thread t1 = new Thread(bp);
        Thread t2 = new Thread(bp);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
    }
}

// 奖金池类
class BonusPool implements Runnable {
    private ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300));

    @Override
    public void run() {
        while (true) {
            luckDraw();
        }
    }

    // 抽奖的同步方法
    public synchronized void luckDraw() {
        Random r = new Random();
        if (arr.iterator().hasNext()) {
            int ran = r.nextInt(arr.size());
            System.out.println(Thread.currentThread().getName() + " 又产生了一个 " + arr.remove(ran) + " 元大奖");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
