import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    在Java中可以捕获的异常可分为两类: 编译时异常和运行时异常
    Java的编译器可以检测到的异常,称为编译时异常
    Java的编译器是检测不到的,因此能够正常编译,但是在运行时会发生的异常称为运行时异常（RuntimeException）
    常见的运行时异常:
      1.IndexOutOfBoundsException: 集合或数组的索引值超过范围时发生的异常
      2.NullPointerException: 应用程序在需要对象的地方使用null时发生的异常
      3.ArithmeticException: 出现异常的运算条件发生的异常
      4.IllegalArgumentsException: 传递的参数不合法或不正确发生的异常
      5.ClassCastException: 将对象强制转换成不是实例的子类时发生的异常
 */

public class 异常 {
    public static void main(String[] args) throws MyException {
        // 编译时异常();
        // 运行时异常();
        // finally测试();
        // 抛出异常1();
        int a = 1;
        int b = 0;
        try {
            抛出异常2(a, b);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    // throws 通常用于方法声明,后面跟着异常类,声明要抛出的异常
    private static void 抛出异常1() throws ClassNotFoundException {
        Class.forName("循环1");
    }

    private static void 抛出异常2(int a, int b) throws MyException {
        if (b == 0) {
            // 抛出异常,通常是自定义异常
            // throw 通常用于方法内部,用于抛出异常对象
            throw new MyException("除数为0");
        }
        System.out.println(a / b);
    }

    private static void finally测试() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("abc");
            System.out.println("创建IO流,分配内存资源");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("创建IO流发生异常");
        } finally {
            System.out.println("不管是否发生异常,都执行finally");
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void 运行时异常() {
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
         System.out.println(1 / 0);

        /*
           常见的运行时的异常:
            IndexOutOfBoundsException  下标越界异常
            NullPointerException       空指针异常
            ArithmeticException        算术异常
            ClassNotFoundException     找不到类异常
            ClassCastException         类型转换异常
         */
    }

    private static void 编译时异常() {
        try {
            // 需要检测的代码
            Class.forName("循环1");
            // 出现异常后,try块中后面的代码就不执行了,会直接跳到catch块运行
            System.out.println("进行类加载");
        } catch (ClassNotFoundException e) {
            // 异常处理代码
            // e.printStackTrace();  获取异常类名和异常信息,以及异常出现在程序中的位置,返回值void
            System.out.println(e.getMessage()); // 获取异常信息,返回字符串
            System.out.println(e.toString());   // 获取异常类名和异常信息,返回字符串
        } finally {
            // 一定会执行的代码
            // finally代码块只有一种情况不会被执行,就是在之前执行了System.exit(0)
        }
    }
}

// 自定义的异常类需要继承Exception类
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
// 已复习
