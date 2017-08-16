/*
    static关键字：
      用于修饰成员（成员变量和成员函数）
    被修饰后的成员具备以下特点：
      1.随着类的加载而加载
      2.优先于对象存在
      3.被所有对象所共享
      4.可以直接被类名调用
    使用注意:
      1.静态方法只能访问静态成员
      2.静态方法中不可以写this， super关键字
      3.静态关键字不能修饰局部变量
 */
public class Static关键字 {
    public static void main(String[] args) {
        M24.method();
        M24 m = new M24();
        m.method();

        M24.name = "jeff";
        System.out.println(m.name);
    }
}

class M24 {
    public static String name;
    public int age = 30;

    public static void method() {
        System.out.println("static关键字");
        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(this.name);
    }
}
// 已复习
