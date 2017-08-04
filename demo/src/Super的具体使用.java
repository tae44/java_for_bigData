public class Super的具体使用 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println(z); // 调用了toString()  Zi@3429dbb8
        System.out.println(z.toString());
        String s1 = z + "-!@!";
        String s2 = z.toString() + "-!@!";
        System.out.println(s1);
        System.out.println(s2);
    }
}

// super 可以调用父类成员的变量,成员方法,构造方法
class Fu {
    public Fu() {
        System.out.println("Fu 实例化");
    }
}

// 会先实例化父类,再实例化子类
class Zi extends Fu {
    String name;
    int age;

    public Zi() {
        // 不写默认也是这么调用
        super();
    }

    // 重写了toString方法
    public String toString() {
        return "我的名字是" + name + ", 年龄是" + age;
    }
}
