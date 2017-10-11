package day29.练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

/*
    map中有如下数据(用户名=密码)
	[liuyan=123456,wangbaoqiang=123321,fangbian=abcd,miejueshitai=123abc321]
	在ip为127.0.0.1数据库名为stdb,连接数据库的用户名和密码为:admin和123456中有一个userinfo表相关字段为(id,username,password)
	(1)将map中的手机号码取出来打印到控制台上
		* 直接使用map集合的keySet()方法获取所有的key组成的Set集合,并遍历
	(2)判断map中所有的用户名在userinfo表中是否存在存在则输出"该用户已注册",如果不存在将该用户名及对应的密码存入到userinfo表中
    (map中的数据不需要修改)
 */
public class Test1 {
    private static Connection conn;
    private static PreparedStatement p1;
    private static PreparedStatement p2;
    private static ResultSet r;
    private static String url;
    private static String username;
    private static String password;
    private static HashMap<String, String> map;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            url = "jdbc:mysql://localhost:3306";
            username="root";
            password="123";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        // createDatabase();
        // createTable();
        stMap();
        isIn();
    }

    // 判断map中所有的用户名在userinfo表中是否存在
    public static void isIn() throws Exception {
        url = "jdbc:mysql://localhost:3306/stdb";
        conn = DriverManager.getConnection(url, username, password);
        p1 = conn.prepareStatement("SELECT * FROM userinfo WHERE username=?");
        for (String name : map.keySet()) {
            p1.setObject(1, name);
            r = p1.executeQuery();
            if (r.next()) {
                System.out.println(name + " 该用户已注册");
            } else {
                p2 = conn.prepareStatement("INSERT INTO userinfo(username,password) VALUES (?,?)");
                p2.setObject(1, name);
                p2.setObject(2, map.get(name));
                p2.executeUpdate();
                p2.close();
            }
        }
        r.close();
        p1.close();
        conn.close();
    }

    // 创建map
    public static void stMap() {
        map = new HashMap<>();
        map.put("liuyan", "123456");
        map.put("wangbaoqiang", "123321");
        map.put("fangbian", "abcd");
        map.put("miejueshitai", "123abc321");
        for (String key : map.keySet()) {
            System.out.println("key => " + key + '\t' + '\t' + "value => " + map.get(key));
        }
        System.out.println("--------------------------------------------");
    }

    // 创建表
    public static void createTable() throws Exception {
        url = "jdbc:mysql://localhost:3306/stdb";
        conn = DriverManager.getConnection(url, username, password);
        String sql = "CREATE TABLE userinfo(id int(10) PRIMARY KEY AUTO_INCREMENT," +
                "username varchar(200),password varchar(200))";
        p1 = conn.prepareStatement(sql);
        p1.execute();
        p1.close();
        conn.close();
    }

    // 创建数据库
    public static void createDatabase() throws Exception {
        conn = DriverManager.getConnection(url, username, password);
        p1 = conn.prepareStatement("CREATE DATABASE stdb CHARSET utf8");
        p1.execute();
        p1.close();
        conn.close();
    }
}
