package com.gbai.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.MybatisConfiguration;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import com.gbai.injector.MySqlInjector;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 17:19
 **/
@Configuration
public class DataSourceConfig {

    @Autowired
    MySqlInjector mySqlInjector;
    /**
     * @Description : mybatis-plus分页插件
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2017/9/19 13:59
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    @Bean(name = "test")
    @ConfigurationProperties(prefix = "spring.datasource.test" )
    public DataSource test () {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "book")
    @ConfigurationProperties(prefix = "spring.datasource.book" )
    public DataSource book () {
        return DruidDataSourceBuilder.create().build();
    }
    /**
     * 动态数据源配置
     * @return
     */
    @Bean
    @Primary
    public DataSource multipleDataSource (@Qualifier("test") DataSource test,
                                          @Qualifier("book") DataSource book ) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map< Object, Object > targetDataSources = new HashMap<>();
        targetDataSources.put(DBTypeEnum.test.getValue(), test );
        targetDataSources.put(DBTypeEnum.book.getValue(), book);
        dynamicDataSource.setTargetDataSources(targetDataSources);
        dynamicDataSource.setDefaultTargetDataSource(test);
        return dynamicDataSource;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(multipleDataSource(test(),book()));
        //sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*/*Mapper.xml"));

        MybatisConfiguration configuration = new MybatisConfiguration();
        //configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        sqlSessionFactory.setConfiguration(configuration);
        sqlSessionFactory.setPlugins(new Interceptor[]{ //PerformanceInterceptor(),OptimisticLockerInterceptor()
                paginationInterceptor() //添加分页功能
        });
        sqlSessionFactory.setGlobalConfig(globalConfiguration());
        return sqlSessionFactory.getObject();
    }


    @Bean
    public GlobalConfiguration globalConfiguration(){
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setSqlInjector(mySqlInjector);
        return globalConfiguration;
    }

}
