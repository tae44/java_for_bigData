package day16.练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        // f1();
        f2();
    }

    public static void f2() throws ParseException {
        Calendar c = Calendar.getInstance();
        System.out.println("请输入要查询的年份:");
        String yearStr = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date yearDate = sdf.parse(yearStr + "-03-01");
        c.setTime(yearDate);
        c.add(Calendar.DAY_OF_MONTH, -1);
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day == 29) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
    }

    public static void f1() throws ParseException {
        System.out.println("请输入出生日期 格式 yyyy-MM-dd");
        String birthdayStr = new Scanner(System.in).next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayStr);
        Date today = new Date();
        long second = today.getTime() - birthdayDate.getTime();
        if (second < 0) {
            System.out.println("还没出生呢");
        } else {
            System.out.println(second / 1000 / 60 / 60 / 24);
        }
    }
}
