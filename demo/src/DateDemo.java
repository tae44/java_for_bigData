import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        // DataD();
        // 日期格式转字符串();
        字符串转日期格式();
    }

    private static void 字符串转日期格式() throws ParseException {
        String s = "2017年08月08日 13时10分28秒";
        String pattern = "yyyy年MM月dd日 HH时mm分ss秒";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    private static void 日期格式转字符串() {
        Date d = new Date();
        System.out.println("当前日期为: " + d);

        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String s = sdf.format(d);
        System.out.println("指定的日期格式为: " + s);
    }

    private static void DataD() {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // 获取毫秒值,1502167086164

        Date dd = new Date(1502167086164L);
        System.out.println(dd);

        long t = System.currentTimeMillis(); // 获取毫秒值
        System.out.println(t);
    }
}
