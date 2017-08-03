public class 数组 {
    public static void main(String[] args) {
        // 数组只能放同类型的数据
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
//        System.out.println(sArr[3]);  不能越界
    }
}
