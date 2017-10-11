package day29.练习;

/*
    一个数据库stdb,用户名为admin 密码为123456 已存在一个表student中有五个学生的信息,姓名,性别,年龄,分数.
	 1                    李少荣                 女                   80
	 2                    邵凯                   男                   75
	 3                    周强                   男                   95
	 4                    王晓婷                 女                   55
	 5                    张秀花                 女                   68
	 6                    顾会                   女                   50
	 7                    赵天一                 男                   32
	(1)查询女性,成绩80以上的学生数量
	(2)将姓张的男同学的的成绩改为100
	(3)查询成绩大于60的女性,显示姓名,性别,成绩
	(4)分别统计所有男同学的平均分，所有女同学的平均分及总平均分
	(5)按照分数从小到大的顺序打印分数大于总平均分的学员信息(id-name-sex-score),并将分数大于总平均分的学员信息(按照分数从小到大的顺序)(id-name-sex-score)写入到studentInfo.txt文件中(写入格式：id-name-sex-score)
	(6)定义查询所有学生的方法public List<Student> getAllStudent(){}
	(7)定义根据id查询学生的方法public Student getStudentById(String id){}
	(8)定义根据id删除学生的方法public int deleteStudentById(String id){}//注意只有数据库中有才能删除，没有无法删除
	(9)定义添加学员的方法public int addStudent(){}//注意只有数据库中没有有才能添加，有无法添加
	(10)定义根据id修改学员的信息public int updateStudentById(String id){}//注意只有数据库中有才能修改，没有无法修改
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test2 {
    private static Connection conn;
    private static PreparedStatement p;
    private static ResultSet r;
    private static String url;
    private static String username;
    private static String password;

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

        url = "jdbc:mysql://localhost:3306/stdb";
        conn = DriverManager.getConnection(url, username, password);
        // createTable(conn, url);
        // insertData(conn, url);
        // f1(conn, url);
        f2(conn, url);
        conn.close();
    }

    // 查询成绩大于60的女性,显示姓名,性别,成绩
    public static void f2(Connection conn, String url) throws Exception {
        p = conn.prepareStatement("SELECT NAME,sex,score FROM student WHERE score>60 AND sex='女'");
        r = p.executeQuery();
        while (r.next()) {
            System.out.println(r.getString("name") + "   " +
                    r.getString("sex") + "   " + r.getInt("score"));
        }
        r.close();
        p.close();
    }

    // 查询女性,成绩80以上的学生数量
    public static void f1(Connection conn, String url) throws Exception {
        p = conn.prepareStatement("SELECT COUNT(*) FROM student WHERE sex='女'");
        r = p.executeQuery();
        while (r.next()) {
            System.out.println(r);
        }
        r.close();
        p.close();
    }

    // 插入数据,只示范一个
    public static void insertData(Connection conn, String url) throws Exception {
        p = conn.prepareStatement("INSERT INTO student(name,sex,age,score) VALUES (?,?,?,?)");
        p.setObject(1, "李少荣");
        p.setObject(2, "女");
        p.setObject(3, 18);
        p.setObject(4, 80);
        p.executeUpdate();
        p.close();
    }

    // 创建表
    public static void createTable(Connection conn, String url) throws Exception {
        String sql = "CREATE TABLE student(id INT(20) PRIMARY KEY AUTO_INCREMENT," +
                "name varchar(20),sex varchar(20),age int(10),score int(10))";
        p = conn.prepareStatement(sql);
        p.execute();
        p.close();
    }

    // 创建数据库
    public static void createDatabase() throws Exception {
        conn = DriverManager.getConnection(url, username, password);
        p = conn.prepareStatement("CREATE DATABASE stdb CHARSET utf8");
        p.execute();
        p.close();
        conn.close();
    }
}
