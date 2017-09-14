package day10.练习2;

public class test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("阿宝");
        t.setAge(26);

        Student s = new Student();
        s.setName("依稀");
        s.setAge(16);

        t.eat();
        s.eat();
        t.teach();
        s.study();
    }
}
