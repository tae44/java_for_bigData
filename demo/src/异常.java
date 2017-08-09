import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

    private static void 抛出异常1() throws ClassNotFoundException {
        // throws 通常用于方法声明,后面跟着异常类,声明要抛出的异常
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
            // 出现异常后,try之后的代码就不执行了,会直接跳到catch段运行
            System.out.println("进行类加载");
        } catch (ClassNotFoundException e) {
            // 异常处理代码
            // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            // 一定会执行的代码
        }
    }
}

// 自定义异常
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
