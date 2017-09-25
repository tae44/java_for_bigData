package day21.练习;

public class Test {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void f() throws Exception {
        int[] arr = {1,2,3,4,5};
        if (arr.length < 6) {
            throw new Exception("索引没有5");
        }
        if (arr[5] > 100) {
            arr[5] /= 2;
        } else {
            arr[5] /= 3;
        }
    }
}
