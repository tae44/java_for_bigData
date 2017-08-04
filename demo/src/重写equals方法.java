public class 重写equals方法 {
    public static void main(String[] args) {
        M7 m1 = new M7("jeff", 30);
        M7 m2 = new M7("jeff", 30);
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
    }
}

class M7 {
    public String name;
    public int age;

    public M7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 如果没有重写equals(),那么调用equals()进行比较时就相当于使用==,如果重写了,那么就按照指定的方式进行比较
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != M7.class) {
            return false;
        }
        M7 m = (M7) obj;
        if (this.name.equals(m.name) && this.age == m.age) {
            return true;
        }
        return false;
    }
}
