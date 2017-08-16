import java.util.Arrays;

public class 数组 {
    public static void main(String[] args) {
        // method1();
        method2();
    }

    public static void method2() {
        int[] iArr = {23, 56, 89, 12, 44, 97, 7};
        // 对任意类型的数组进行升序排序
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        /*
            复制数组至指定长度,如果新数组的长度大于原数组则用数组类型的默认值来填充
            如果复制后的数组的长度小于原数组的长度则会从arr的第一个元素开始截取至满足新数组的长度为止
         */
        int[] a = Arrays.copyOf(iArr, 10);
        System.out.println(Arrays.toString(a));
        int[] b = Arrays.copyOfRange(iArr, 1, 10);
        System.out.println(Arrays.toString(b));
    }

    public static void method1() {
        // 数组只能放同类型的数据,数组的长度不能变
        // 数组是一种引用的数据类型,指向有效的内存
        String[] sArr; // 声明了一个字符串类型的数组
        int[] iArr;    // 声明了一个int类型的数组
        // 静态初始化
        // int[] iArr = new int[]{1,2,3};
        // int[] iArr = {1,2,3};  简写
        iArr = new int[]{1,2,3};
        System.out.println("length: " + iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            System.out.println(i + ": " + iArr[i]);
        }
        // foreach  适用于遍历
        for (int a : iArr) {  // a就是数组里对应的元素
            System.out.println(a);
        }

        // 动态初始化
        iArr = new int[3]; // 初始值为0
        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);

        sArr = new String[3]; // 初始值为null
        System.out.println(sArr[0]);
        System.out.println(sArr[1]);
        System.out.println(sArr[2]);
        // System.out.println(sArr[3]);  不能越界
    }
}
// 已复习
