package spingclouddemo.Config;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Mybatis3    配置类 扫描dao和 mapper所在位置
 */
@Configuration
@MapperScan(basePackages = "spingclouddemo.MybatisFile", sqlSessionFactoryRef = "sqlSessionFactory")
public class MyBatisConfig {


    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier("primaryDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(ArrayUtils.addAll(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml"), new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*Mapper.xml"))

        );
        return bean.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager(@Qualifier("primaryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
