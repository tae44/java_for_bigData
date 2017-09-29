package day25.练习;

/*
	(1)定义学生类,包含姓名(String name),性别(String gender),年龄(int age)三个属性,生成空参有参构造,set和get方法,toString方法
	(2)键盘录入6个学员信息(录入格式:张三,男,25),要求有两个相同的信息,将6个学员信息存入到ArrayList集合中
	(3)将存有6个学员信息的ArrayList集合对象写入到E:\\StudentInfo.txt文件中
	(4)读取D:\\StudentInfo.txt文件中的ArrayList对象
	(5)对ArrayList集合中的6个学生对象进行去重并按照年龄从小到大的顺序排序
	(6)将ArrayList集合中排序后的结果利用PrintWriter流写入到E:\\StudentInfo.txt文件中(写入格式：张三-男-25)
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = createStudent();
        list = unique(list);
        // writeData(list);
        // readData();
        finalWrite(list);
    }

    // 写入最终结果
    public static void finalWrite(ArrayList<Student> list) throws IOException {
        PrintWriter pw = new PrintWriter("E:\\StudentInfo.txt");
        String ret;
        for (Student stu : list) {
            ret = stu.getName() + "-" + stu.getGender() + "-" + stu.getAge();
            pw.println(ret);
            pw.flush();
        }
        pw.close();
    }

    // 读取list文件
    public static void readData() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("E:\\StudentInfo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        System.out.println(o);
    }

    // 将list对象写入硬盘文件
    public static void writeData(ArrayList<Student> list) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\StudentInfo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
    }

    // list去重及排序
    public static ArrayList<Student> unique(ArrayList<Student> list) {
        HashSet<Student> set = new HashSet<>();
        for (Student stu : list) {
            set.add(stu);
        }
        list.clear();
        for (Student stu : set) {
            list.add(stu);
        }
        Collections.sort(list);
        return list;
    }

    // 创建学生
    public static ArrayList<Student> createStudent() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        String info;
        String[] infos;
        System.out.println("请输入学生信息:");
        // 创建6个学生并存到list中
        for (int i = 0; i < 6; i++) {
            info = sc.nextLine();
            infos = info.split(",");
            Student s = new Student();
            s.setName(infos[0]);
            s.setGender(infos[1]);
            s.setAge(Integer.parseInt(infos[2]));
            list.add(s);
        }
        return list;
    }
}
