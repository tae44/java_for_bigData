import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
    计算每个字母出现的次数,要求打印的结果 a(2) b(1) ...
    1.使用TreeMap类型的集合进行数据存储
    2.把字符串变成字符数组,依次判断
 */
public class Map练习 {
    public static void main(String[] args) {
        String s = "vjckioevjkjqu:klxasmsdj;vbmcey";
        TreeMap<Character, Integer> map = getCharCount(s);
        // System.out.println(map);
        String result = output(map);
        System.out.println(result);
    }

    // 重写打印格式
    public static String output(TreeMap<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<Character, Integer>> i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Character, Integer> entry = i.next();
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key).append("(").append(value).append(") ");
        }
        return sb.toString();
    }

    // 计算字母出现的次数
    public static TreeMap<Character, Integer> getCharCount(String s) {
        char[] arr = s.toCharArray();
        TreeMap<Character, Integer> m = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                continue;
            }
            Integer value = m.get(c);
            int count = 1;
            if (value != null) {
                count = value + 1;
            }
            m.put(c, count);
        }
        return m;
    }
}
