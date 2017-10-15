package gjp.dao;

import gjp.domain.ZhangWu;
import gjp.tools.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import java.sql.SQLException;
import java.util.List;

public class ZhangWuDao {
    private QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

    public List<ZhangWu> selectAll() {
        try {
            String sql = "SELECT * FROM gjp_zhangwu";
            List<ZhangWu> list = qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class));
            return list;
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("查询所有账务失败");
        }
    }

    public List<ZhangWu> select(String startDate, String endDate) {
        try {
            String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
            Object[] params = {startDate, endDate};
            return qr.query(sql, new BeanListHandler<ZhangWu>(ZhangWu.class), params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("条件查询失败");
        }
    }

    public void addZhangWu(ZhangWu zw) {
        try {
            String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description) VALUES (?,?,?,?,?)";
            Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
            qr.update(sql, params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("账务添加失败");
        }
    }

    public void editZhangWu(ZhangWu zw) {
        try {
            String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
            Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
            qr.update(sql, params);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("编辑账务失败");
        }
    }

    public void deleteZhangWu(int zwid) {
        try {
            String sql = "DELETE FROM gjp_zhangwu WHERE zwid=?";
            qr.update(sql, zwid);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException("删除账务失败");
        }
    }
}
