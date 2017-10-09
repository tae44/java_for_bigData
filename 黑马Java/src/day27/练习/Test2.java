package day27.练习;

/*
    某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,利用多线程模拟年会入场过程,
	并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程运行后打印格式如下：
	编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29, 30, 31, 32, 07]
	编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14, 22, 29, 32, 15]
	.....
	从后门入场的员工总共: 13 位员工
	从前门入场的员工总共: 87 位员工
 */

import java.util.ArrayList;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        PartyEntry pe = new PartyEntry();
        Thread t1 = new Thread(pe);
        Thread t2 = new Thread(pe);
        t1.setName("前门");
        t2.setName("后门");
        t1.start();
        t2.start();
    }
}

class PartyEntry implements Runnable {
    // 用于退出循环
    private int x = 0;
    // 员工id
    private int index = 1;
    private int frontDoor;
    private int backDoor;

    @Override
    public void run() {
        while (x < 100) {
            enter();
            x++;
        }
    }

    public synchronized void enter() {
        if (index > 100) {
            System.out.println("从前门入场的员工总共: " + frontDoor + " 位员工");
            System.out.println("从后门入场的员工总共: " + backDoor + " 位员工");
            return;
        }
        ArrayList<Integer> ssq = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int ran = r.nextInt(33) + 1;
            // 如果随机的数字不在数组里则添加
            if (!ssq.contains(ran)) {
                ssq.add(ran);
            }
        }
        // 添加蓝色球
        ssq.add(r.nextInt(16) + 1);
        String doorName = Thread.currentThread().getName();
        if (doorName.equals("前门")) {
            frontDoor++;
        } else {
            backDoor++;
        }
        System.out.println("编号为 " + index + " 的员工从 " + doorName + " 入场! 拿到的双色球彩票号码是: " + ssq);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        index++;
    }
}
