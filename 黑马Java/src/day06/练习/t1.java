package day06.练习;

import java.util.ArrayList;

/*
  定义一个学生类Student，包含三个属性姓名、年龄、性别，创建三个学生对象存入ArrayList集合中。
  A：遍历集合遍历输出。
  B：求出年龄最大的学生，让后将该对象的姓名变为：葫芦娃。
 */
public class t1 {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        crate(arr);
        changeName(arr);
        Student s = new Student();
        s.name = "abc";
        s.age = 31;
        s.sex = '女';
        arr.add(1, s);
        arr.remove(0);
        look(arr);
    }

    public static void crate(ArrayList<Student> arr) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name = "Jeff";
        s2.name = "Alex";
        s3.name = "Eric";
        s1.age = 15;
        s2.age = 21;
        s3.age = 17;
        s1.sex = '男';
        s2.sex = '男';
        s3.sex = '女';
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
    }

    public static void look(ArrayList<Student> arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }

    public static void changeName(ArrayList<Student> arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).age > max) {
                max = arr.get(i).age;
                index = i;
            }
        }
        Student s = arr.get(index);
        s.name = "葫芦娃";
        arr.set(index, s);
    }
}

class Student {
    String name;
    int age;
    char sex;

    @Override
    public String toString() {
        return "姓名:" + name + "  " + "年龄:" + age + "  " + "性别:" + sex;
    }
}
