import java.util.Arrays;

public class 字符串方法 {
    public static void main(String[] args) {
        String s = "hello,world";
        // 转换(s);
        // 判断(s);
        // 比较();
        // 获取(s);
        // paixu();
        // cout();
    }

    public static void 获取(String s) {
        s.length();                               // 返回字符串的长度
        s.charAt(2);                              // 返回指定索引处的字符,不存在则发生异常
        s.indexOf('o');                           // 返回指定字符第一次出现的索引,如果找不到则返回-1,下同
        s.indexOf('o', 5);          // 返回指定字符第一次出现的索引,从指定索引开始搜索
        s.indexOf("wo");                          // 返回指定字符串在此字符串中第一次出现的索引
        s.indexOf("ll", 2);         // 返回指定字符串第一次出现的索引,从指定索引开始搜索
        s.lastIndexOf('l');                   // 返回指定字符最后一次出现的索引
        s.lastIndexOf('l', 3);      // 返回指定字符最后一次出现的索引,从指定索引开始反向搜索
        s.lastIndexOf("wo");                  // 返回指定字符串最后一次出现的索引
        s.lastIndexOf("wo", 3);     // 返回指定字符串最后一次出现的索引,从指定索引开始反向搜索
        s.substring(2);                           // 返回一个从指定索引到最后的新字符串,当头尾下标相等时结果是""字符串
        s.substring(2, 4);                        // 返回两个指定索引之间的新字符串,含头不含尾,当开始下标等于长度时结果是""字符串
    }

    public static void 转换(String s) {
        String[] arr = s.split(",");        // 把字符串拆分成字符串数组
        System.out.println(Arrays.toString(arr));

        char[] chs = s.toCharArray();             // 把字符串转换成字符数组
        for (char c : chs) {
            System.out.println(c);
        }

//        String str = "ab你";
//        byte[] bs = str.getBytes();               // 字符串转换成字节数组
//        System.out.println(Arrays.toString(bs));
//        bs = str.getBytes("GBK");
//        System.out.println(Arrays.toString(bs));

        s.toUpperCase();                            // 字符串变大写
        s.toLowerCase();                            // 字符串变小写
        s.replace('o', '$');       // 替换字符,当要替换的字符不存在时,结果还是是原来的字符串
        s.replace("ll", "%%");    // 替换字符串
        System.out.println("-" + "   abc   abc   ".trim() + "-");  // 去除前后两端空白
        System.out.println("Hello".concat(" World"));              // 拼接字符串
    }

    public static void 判断(String s) {
        String str = "hello,world";
        s.equalsIgnoreCase(str);                  // 忽略大小写比较
        s.contains("ll");                         // 判断是否包含字符串,不包含返回-1
        s.startsWith("h");                        // 判断是否以某个字符串开头
        s.endsWith("dd");                         // 判断是否以某个字符串结尾
    }

    public static void 比较() {
        System.out.println("a".compareTo("a"));   // 相等为0
        System.out.println("a".compareTo("b"));   // 小于为负
        System.out.println("h".compareTo("c"));   // 大于为正
    }

    /*
        把给定的字符串数组按照字典顺序从小到大排序
     */
    public static void paixu() {
        String[] arr = {"haha", "def", "qq", "abc", "cba", "zz"};
        System.out.println("排序前: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后: " + Arrays.toString(arr));
    }

    public static void sort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /*
        查找一个子串在字符串中出现的次数
        查找子串是否存在用indexof方法,如果查找到,则记录出现的位置index和出现次数,然后从下一个位置开始查找
     */
    public static void cout() {
        String str = "nbadfegginbavtopoivnbacveqa";
        String key = "nba";
        int count = 0;     // 记录出现的次数
        int index = 0;     // 记录出现位置的下标
        while ((index = str.indexOf(key, index)) != -1) {
            index += key.length();
            count++;
        }
        System.out.println(key + "出现的次数是: " + count);
    }
}
// 已复习
