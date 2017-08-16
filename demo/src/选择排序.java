/*
     比如在一个长度为N的无序数组中，在第一趟遍历N个数据，找出其中最小的数值与第一个元素交换
     第二趟遍历剩下的N-1个数据，找出其中最小的数值与第二个元素交换......
     第N-1趟遍历剩下的2个数据，找出其中最小的数值与第N-1个元素交换，至此选择排序完成
 */
public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {23,45,78,99,13,31};
        System.out.print("排序之前: ");
        print(arr);
        choose(arr);
        System.out.print("排序之后: ");
        print(arr);
    }

    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println("\n");
    }
}
// 已复习
