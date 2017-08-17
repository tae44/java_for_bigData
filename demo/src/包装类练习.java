import java.util.Arrays;

public class 包装类练习 {
    /*
        把字符串中的数值取出来从大到小排序
          1.把字符串拆分成字符串数组,split(regex),得到的是字符串数组
          2.把字符串数组转换成int数组,Integer.parseInt(s)
          3.使用Arrays中的工具类提供的方法sort进行排序
     */
    public static void main(String[] args) {
        String s = "20 78 9 -7 88 36 29";
        String[] arr = s.split(" ");
        int[] iArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
    }
}
// 已复习
