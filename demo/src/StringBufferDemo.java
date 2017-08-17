/*
    StringBuffer:
      1.字符串的组成原理就是通过该类实现的
      2.StringBuffer可以对字符串内容进行增删
      3.StringBuffer是一个容器
      4.很多方法与String相同
      5.StingBuffer是可变长度的
    String和StringBuffer的区别:
       1.String对数据相连接变成新的字符串
       2.StringBuffer比string效率高些
       3.String一旦被初始化不可以被改变
       4.StringBuffer可以对字符串进行修改
       5.String和StringBuilder的区别与此类似
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        // 添加();
        // 插入();
        // 删除();
        // 替换();
        数组变字符串练习();
    }

    public static void 替换() {
        StringBuffer sb = new StringBuffer("abcd");
        // sb.replace(1, 3, "qq");   范围含头不含尾
        // sb.setCharAt(2, 'p');
        // sb.setLength(2);
        sb.reverse();
        System.out.println(sb);
    }

    public static void 删除() {
        StringBuffer sb = new StringBuffer("abcd");
        // sb.delete(1, 3);           删除
        // sb.delete(0, sb.length()); 清空
        // sb = new StringBuffer();   清空,不建议这么使用
        sb.deleteCharAt(2);
        System.out.println(sb);
    }

    public static void 插入() {
        StringBuffer sb = new StringBuffer("abcd");
        sb.insert(2, "qq");
        System.out.println(sb);
    }

    public static void 添加() {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = sb.append(5);
        System.out.println(sb1);
        System.out.println(sb);
        System.out.println(sb == sb1);

//        String s = "abc";
//        String s1 = s + "xxoo";
//        System.out.println(s == s1);
        /*
            在进行频繁的字符串拼接操作时,可以使用StringBuffer
            因为使用String每进行一次拼接操作,就会创建一个字符串对象,这会影响内存,而StringBuffer不会
         */

        sb.append(5);
        sb.append("hello");
        System.out.println("sb: " + sb);
        System.out.println("sb1: " + sb1);
    }

    public static void 数组变字符串练习() {
        int[] arr = {1, 2, 3, 4, 5};
        StringBuilder sb = new StringBuilder();
        for (int a : arr) {
            sb.append(a);
        }
        System.out.println(sb);
    }
}

/*
    StringBuffer    jdk 1   线程安全,同步,速度慢
    StringBuilder   jdk 5   单线程使用,线程不安全,速度快
    日后开发,常用的是StringBuilder,因为一般都是单线程
    如果真的有了多线程,那么建议使用StringBuffer
    StringBuilder的出现,是为了提高了效率
 */
// 已复习
