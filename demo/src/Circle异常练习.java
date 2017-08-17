public class Circle异常练习 {
    public static void main(String[] args) {
        try {
            getArea(30);
            // 执行此句代码则finally不执行
            System.exit(0);
        } catch (CircleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("执行finally...");
        }
    }

    public static void getArea(double r) throws CircleException {
        if (r < 20) {
            throw new CircleException(r);
        }
        System.out.println("半径为" + r + "的圆的面积是: " + 3.14 * r * r);
    }
}

class CircleException extends Exception {
    public CircleException(double r) {
        System.out.println("发生异常的原因: 半径小于20");
        System.out.println("目前圆的半径是" + r);
    }
}
// 已复习
