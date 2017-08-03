import java.util.Arrays;

public class 内置工具排序 {
    public static void main(String[] args) {
        int[] arr = {23,45,78,99,13,31};
//        method1(arr);
//        method2(arr);
        method3(arr);
    }

    public static void method1(int[] arr) {
        System.out.print("排序之前: ");
        System.out.print(Arrays.toString(arr));
        System.out.println("\n");
        Arrays.sort(arr);
        System.out.print("排序之后: ");
        冒泡排序.print(arr);
    }

    public static void method2(int[] arr) {
        int[] ret1 = Arrays.copyOf(arr, 3);
        int[] ret2 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ret1));
        System.out.println(Arrays.toString(ret2));
    }

    public static void method3(int[] arr) {
        int[] ret1 = Arrays.copyOfRange(arr, 2, 4); //含头不含尾
        int[] ret2 = Arrays.copyOfRange(arr, 2, 10);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ret1));
        System.out.println(Arrays.toString(ret2));
    }
}
