public class 循环 {
    public static void main(String[] args) {
//        xunhuan1();
//        xunhuan2();
        xunhuan3();

        /*
            死循环
            while (true) {}
            for (;;) {}

            continue 跳出本次循环
            break    跳出循环
            return   跳出方法
         */
    }

    public static void xunhuan1() {
        int i = 1;
        int sum = 0;
        while (i < 11) {
            sum += i;
            i++;
        }
        System.out.println("while: " + sum);
    }

    public static void xunhuan2() {
        int i = 1;
        int sum = 0;
        do {    // 无论条件是否符合,至少执行一次
            sum += i;
            i++;
        } while (i < 11);
        System.out.println("do: " + sum);
    }

    public static void xunhuan3() {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("for: " + sum);
    }
}
