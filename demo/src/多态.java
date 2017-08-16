public class 多态 {
    public static void main(String[] args) {
        // Cat c = new Cat();
        // Dogg d = new Dogg();
        // 父类引用指向子类对象
        Animal c = new Cat();  // 自动类型提升 向上转型
        Animal d = new Dogg();
        action(c);
        System.out.println("-----------");
        action(d);
    }

    public static void action(Animal a) {
        a.eat();
        // instanceof 用于判断该对象是否所属于某个类型
        if (a instanceof Cat) {
            Cat cat = (Cat) a;  // 强制类型转换 向下转型
            cat.catchMouse();
        } else {
            Dogg dog = (Dogg) a;
            dog.lookHome();
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
// 已复习
