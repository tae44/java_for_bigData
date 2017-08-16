/*
    封装:是指隐藏对象的属性和实现细节,仅对外提供公共访问方式
    好处：
      1.提高安全性
      2.将变化隔离
      3.便于使用
      4.提高重用性
    封装原则：
      1.将不需要对外提供的内容都隐藏起来
      2.把属性都隐藏,提供公共方法对其访问
    常用封装方式之一:将成员变量私有化,对外提供对应的set和get方法对其进行访问,提高对数据访问的安全性
 */
public class 封装 {
    public static void main(String[] args) {
        M3 m = new M3();
        m.name = "jeff";
        m.setAge(30);
        // m.age = -30;
        m.speak();
        System.out.println(m.getAge());
    }
}

class M3 {
    public String name;
    // public int age;
    private int age;  // 私有,仅当前类可以使用

    public void speak() {
        System.out.println("我是" + name + ", 年龄是" + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("传入的年龄有问题!");
            return;
        }
    }

    public int getAge() {
        return this.age;
    }
}
// 已复习
