package spingclouddemo.Config;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;



/***Spring boot 2.0.*   配置多数据源*/


@Slf4j
@ComponentScan
@Configuration
public class DataSourceConfig {

    Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    /**配置第一个数据源*/
    @Primary      //默认的数据源
    @Bean(name = "primaryDataSource")   //注册为一个bean
    @Qualifier("primaryDataSource")      //数据库对象名字
    @ConfigurationProperties(prefix = "spring.primary.datasource") //匹配application.properties 的 spring.datasource的连接值
    public DataSource firstDataSource() {
        logger.info("配置数据源开始-----");
        DataSource build = primaryDataSourceProperties().initializeDataSourceBuilder().build();
        return build;
    }


    @Primary
    @Bean(name = "primaryDataSourceProperties")
    @Qualifier("primaryDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.primary.datasource")
    public DataSourceProperties primaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    /**配置第二个数据源*/

    @Bean(name = "ttmoaDataSourceProperties")
    @Qualifier("ttmoaDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.ttmoa.datasource")
    public DataSourceProperties ttmoaDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "ttmoaDataSource")   //注册为一个bean
    @Qualifier("ttmoaDataSource")      //数据库对象名字
    @ConfigurationProperties(prefix = "spring.ttmoa.datasource") //匹配application.properties 的 spring.datasource的连接值
    public DataSource ttmoaDataSource() {
        logger.info("配置ttmoa的数据源开始-----");
        DataSource build = ttmoaDataSourceProperties().initializeDataSourceBuilder().build();
        return build;
    }






}
