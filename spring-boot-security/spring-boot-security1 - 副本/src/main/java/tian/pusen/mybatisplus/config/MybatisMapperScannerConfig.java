package tian.pusen.mybatisplus.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tian.pusen.mybatisplus.Constants;

@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class MybatisMapperScannerConfig {
    public static final Logger logger = LoggerFactory.getLogger(MybatisMapperScannerConfig.class);

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        logger.info("初始化MapperScannerConfigurer");
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage(Constants.MAPPER_PACKAGE);
        return mapperScannerConfigurer;
    }

}
