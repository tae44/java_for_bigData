package gjp.tools;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;

public class JDBCUtils {
    private static BasicDataSource dataSource = new BasicDataSource();

    static {
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/gjp");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(2);
        dataSource.setInitialSize(10);
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
