public class 学生类练习 {
    public static void main(String[] args) {
        Student s1 = new Student("jeff", 1, 68.0, 78.5, 88.0);
        Student s2 = new Student("jason", 2, 91.0, 58.5, 73.5);
        System.out.println(s1.sum());
        System.out.println(s1.avg());
        System.out.println(s2.max());
        System.out.println(s2.min());
    }
}

class Student {
    private String name;
    private int id;
    private double math;
    private double english;
    private double computer;

    public Student(String name, int id, double math, double english, double computer) {
        this.name = name;
        this.id = id;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("学号输入错误!");
        }
    }

    public int getId() {
        return this.id;
    }

    public void setComputer(double computer) {
        if (id > 0) {
            this.computer = computer;
        } else {
            System.out.println("计算机成绩输入错误!");
        }
    }

    public double getComputer() {
        return this.computer;
    }

    public void setEnglish(double english) {
        if (id > 0) {
            this.english = english;
        } else {
            System.out.println("英语成绩输入错误!");
        }
    }

    public double getEnglish() {
        return this.english;
    }

    public void setMath(double math) {
        if (id > 0) {
            this.math = math;
        } else {
            System.out.println("数学成绩输入错误!");
        }
    }

    public double getMath() {
        return this.math;
    }

    public double sum() {
        return this.math + this.english + this.computer;
    }

    public double avg() {
        return this.sum() / 3;
    }

    public double max() {
        double max = (this.math > this.computer) ? this.math : this.computer;
        return (max > this.english) ? max : this.english;
    }

    public double min() {
        double min = (this.math < this.computer) ? this.math : this.computer;
        return (min < this.english) ? min : this.english;
    }
}
// 已复习
