package day20.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 *  实现模拟斗地主的功能
 *   1. 组合牌
 *   2. 洗牌
 *   3. 发牌
 *   4. 看牌
 */
public class Ddz {
    // 创建Map集合,键是编号,值是牌
    private static HashMap<Integer, String> pooker = new HashMap<>();

    // 创建List集合,存储编号
    private static ArrayList<Integer> pookerNumber = new ArrayList<>();

    public static void main(String[] args) {
        combination();
        shufflingPooker();
        faPooker();
    }

    // 看牌
    public static void look(ArrayList<Integer> player, HashMap<Integer, String> pooker) {
        for (Integer key: player) {
            String value = pooker.get(key);
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    // 发牌功能,将牌编号,发给玩家集合,底牌集合
    public static void faPooker() {
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> bottom = new ArrayList<>();
        // 发牌采用的是集合索引%3
        for (int i = 0; i < pookerNumber.size(); i++) {
            // 先将底牌做好
            if (i < 3) {
                bottom.add(pookerNumber.get(i));
            } else if (i % 3 == 0) {
                // 发给玩家1
                player1.add(pookerNumber.get(i));
            } else if (i % 3 == 1) {
                // 发给玩家2
                player2.add(pookerNumber.get(i));
            } else if (i % 3 == 2) {
                // 发给玩家3
                player3.add(pookerNumber.get(i));
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        // 调用看牌功能
        look(player1, pooker);
        look(player2, pooker);
        look(player3, pooker);
        look(bottom, pooker);
    }

    // 洗牌,将牌的编号打乱
    public static void shufflingPooker() {
        Collections.shuffle(pookerNumber);
    }

    // 组合牌
    public static void combination() {
        // 定义出13个点数的数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        // 定义4个花色数组
        String[] colors = {"♠","♥","♣","♦"};
        // 定义整数变量,作为键出现
        int index = 2;
        // 遍历数组,花色+点数的组合,存储到Map集合
        for (String number : numbers) {
            for (String color : colors) {
                pooker.put(index, color + number);
                pookerNumber.add(index);
                index++;
            }
        }
        // 存储大王和小王
        pooker.put(0, "大王");
        pooker.put(1, "小王");
        pookerNumber.add(0);
        pookerNumber.add(1);
    }
}
