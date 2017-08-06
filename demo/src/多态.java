public class 多态 {
    public static void main(String[] args) {
        // Cat c = new Cat();
        // Dogg d = new Dogg();
        // 父类引用指向子类对象
        Animal c = new Cat(); // 自动类型提升 向上转型
        Animal d = new Dogg();
        action(c);
        action(d);
        // 强制类型转换 向下转型
        // Cat a = (Cat) c;
        // a.catchMouse();
    }

    public static void action(Animal a) {
        a.eat();
        if (a instanceof Cat) {
            Cat aa = (Cat) a;
            aa.catchMouse();
        }
    }
}

abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dogg extends Animal {
    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
