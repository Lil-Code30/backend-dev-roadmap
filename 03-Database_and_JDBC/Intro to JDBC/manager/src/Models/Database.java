package Models;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

public class Database {
    private static HikariDataSource datasource;

    static {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl("jdbc:postgresql://localhost:5432/shop");
        config.setUsername("postgres");
        config.setPassword("azerty237");

        // pool settings
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        config.setMaxLifetime(20000);
        config.setIdleTimeout(30000);

        datasource = new HikariDataSource(config);
    }

    public static DataSource getDataSource() {
        return datasource;
    }
}
