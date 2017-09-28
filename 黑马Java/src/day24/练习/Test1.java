package day24.练习;

/*
	(1)有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"
	(2)打印格式：
		to=3
		think=1
		you=2
		........
	(3)按照上面的打印格式将内容写入到E:\\count.txt文件中(要求用高效流)
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = countWord();
        writeData(map);
    }

    public static void writeData(HashMap<String, Integer> map) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\count.txt"));
        for (String key : map.keySet()) {
            String result = key + "=" + map.get(key);
            System.out.println(result);
            bw.write(result);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    public static HashMap<String, Integer> countWord() {
        HashMap<String, Integer> map = new HashMap<>();
        String s = "If you want to change your fate I think you must come to the dark horse to learn java";
        String[] sArr = s.split(" ");
        for (String str : sArr) {
            if (map.containsKey(str)) {
                Integer i = map.get(str);
                map.put(str, ++i);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }
}
