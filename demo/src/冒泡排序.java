/*
    原理是临近的数字两两进行比较,按照从小到大的顺序进行交换,一趟过去后,最大的数字被交换到了最后一位
    然后再从头开始进行两两比较交换,直到倒数第二位时结束
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {23,45,78,99,13,31};
        System.out.print("排序之前: ");
        print(arr);
        choose(arr);
        System.out.print("排序之后: ");
        print(arr);
    }

    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            print(arr);
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
