package tian.pusen.mybatisplus.config;


import com.alibaba.druid.pool.DruidDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@Primary
@EnableConfigurationProperties(DSProperties.class)
public class DruidDataSourceConfiguration {
    public static final Logger logger = LoggerFactory.getLogger(DruidDataSourceConfiguration.class);
    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Autowired
    private DSProperties dsProperties;

    @Bean
    public DataSource druidDataSource() {
        logger.debug("初始化 druidDataSource");
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        druidDataSource.setUrl(dataSourceProperties.getUrl());
        druidDataSource.setUsername(dataSourceProperties.getUsername());
        druidDataSource.setPassword(dataSourceProperties.getPassword());

        druidDataSource.setMaxActive(dsProperties.getMaxActive());
        druidDataSource.setInitialSize(dsProperties.getInitialSize());
        druidDataSource.setMinIdle(dsProperties.getMinIdle());
        druidDataSource.setTestOnBorrow(dsProperties.isTestOnBorrow());
        druidDataSource.setTestOnReturn(dsProperties.isTestOnReturn());
        druidDataSource.setTestWhileIdle(dsProperties.isTestWhileIdle());
        druidDataSource.setTimeBetweenEvictionRunsMillis(dsProperties.getTimeBetweenEvictionRunsMillis());
        druidDataSource.setMinEvictableIdleTimeMillis(dsProperties.getMinEvictableIdleTimeMillis());
        druidDataSource.setPoolPreparedStatements(dsProperties.isPoolPreparedStatements());
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(dsProperties.getMaxPoolPreparedStatementPerConnectionSize());
        druidDataSource.setMaxOpenPreparedStatements(dsProperties.getMaxOpenPreparedStatements());
        druidDataSource.setValidationQuery(dsProperties.getValidationQuery());
        try {
            druidDataSource.setFilters(dsProperties.getFilters());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druidDataSource;
    }
}
