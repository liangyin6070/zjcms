package com.mvk.zjcms;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.mvk.zjcms")
@MapperScan("com.mvk.zjcms.dao")
public class Application {
    //DataSource配置
    @Bean
    //@ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource() {
    	org.apache.tomcat.jdbc.pool.DataSource dataSource = new org.apache.tomcat.jdbc.pool.DataSource();
    	dataSource.setUrl("jdbc:mysql://localhost:3306/zjcms?useUnicode=true&characterEncoding=gbk&zeroDateTimeBehavior=convertToNull");
    	dataSource.setUsername("root");
    	dataSource.setPassword("root");
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
 
    //提供SqlSeesion
    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/com/mvk/zjcms/xml/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }
 
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    /**
     * 主程序启动入口
     * @param args
     */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
