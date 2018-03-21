package tian.pusen.mybatisplus.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import tian.pusen.mybatisplus.Constants;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@EnableTransactionManagement
public class MybatisAutoConfiguration implements TransactionManagementConfigurer {
    public static final Logger logger = LoggerFactory.getLogger(MybatisAutoConfiguration.class);
    @Autowired
    DataSource dataSource;

    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        logger.debug("初始化SqlSessionFactory");
        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        // mybatis-sqlconfig.xml 内容加载
        org.apache.ibatis.session.Configuration conf =
                new org.apache.ibatis.session.Configuration();
        conf.setCacheEnabled(true);
        conf.setLazyLoadingEnabled(true);
        conf.setMultipleResultSetsEnabled(true);
        conf.setUseColumnLabel(true);
        conf.setDefaultExecutorType(ExecutorType.REUSE);
        conf.setDefaultStatementTimeout(25000);
        factoryBean.setConfiguration(conf);

        factoryBean.setTypeAliasesPackage(Constants.ENTITY_PACKAGE);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            factoryBean.setMapperLocations(resolver.getResources(Constants.MAPPER_XML_CLASSPATH));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        PaginationInterceptor interceptor = new PaginationInterceptor();
        interceptor.setDialectType("mysql");
        factoryBean.setPlugins(new Interceptor[]{interceptor});
        return factoryBean;
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        logger.debug("初始化DataSourceTransactionManager");
        return new DataSourceTransactionManager(dataSource);
    }
}
