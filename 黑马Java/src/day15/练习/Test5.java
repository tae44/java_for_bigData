package day15.练习;

/*
    (1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)定义一个方法
		public Object[] deleteSubString(String str1,String str2) {

		}
	(3)方法功能描述:从str1中删除所有的str2,并返回删除后的结果,返回结果为Object[]数组
		* 该数组的第一个元素为删除所有的str2后的最终的字符串
		* 该数组的第二个元素为删除的str2的个数
 */

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "QabcQwilQabcQjfasQabcQsi";
        String s2 = "abc";
        ArrayList<String> ret = deleteSubString(s1, s2);
        System.out.println(ret);
    }

    public static ArrayList<String> deleteSubString(String str1, String str2) {
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        int index;
        StringBuilder sb = new StringBuilder(str1);
        while ((index = sb.indexOf(str2)) != -1) {
            sb.delete(index, index + str2.length());
            count++;
        }
        list.add(sb.toString());
        list.add(Integer.toString(count));
        return list;
    }
}
