/*
    1.switch语句表达式、取值的类型在jdk1.6只支持四种：byte，short，int ，char。jdk1.7时支持String类型
    2.case语句中的值的数据类型必须与表达式的数据类型相同，而且只能是常量或者字面常量
    3.当表达式的值与case分支后的值相等时，则开始执行该分支后的语句
    4.在case分支中，只要遇到break程序才会跳出switch，否则会执行到最后
    5.default分支如果存在，那么它必须是switch的最后一个分支
 */
public class switchDemo {
    public static void main(String[] args) {
        String s = "abc";
        switch (s) {
            case "xx":
                System.out.println("This is xx");
                break;
            case "abc":
                System.out.println("This is abc");
                break;
            default:
                System.out.println("This is default");
        }
    }
}
// 已复习
