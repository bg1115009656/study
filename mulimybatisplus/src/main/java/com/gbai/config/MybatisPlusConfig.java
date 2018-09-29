package com.gbai.config;

import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.plugins.SqlExplainInterceptor;
import com.gbai.injector.MySqlInjector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @program: mybatisplustest
 * @description:
 * @author: gbai
 * @create: 2018-07-26 17:53
 **/
@Configuration
public class MybatisPlusConfig {

    @Autowired
    MySqlInjector mySqlInjector;
    /***
     * plus 的性能优化
     * @return
     */
    @Bean
    @Profile({"dev","test"})
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        /*<!-- SQL 执行性能分析，开发环境使用，线上不推荐。 maxTime 指的是 sql 最大执行时长 -->*/
        performanceInterceptor.setMaxTime(1000);
        /*<!--SQL是否格式化 默认false-->*/
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }



    /**
     * SQL 执行分析拦截器【 目前只支持 MYSQL-5.6.3 以上版本 】，作用是分析 处理 DELETE UPDATE 语句， 防止小白或者恶意 delete update 全表操作！
     * @return
     */
    @Bean
    public SqlExplainInterceptor sqlExplainInterceptor(){
        SqlExplainInterceptor interceptor = new SqlExplainInterceptor();
        interceptor.setStopProceed(false);
        return interceptor;
    }

    /**
     * @Description : druid注入
     * ---------------------------------
     * @Author : Liang.Guangqing
     * @Date : Create in 2018/1/3 17:38
     */
//    @Bean
//    @ConfigurationProperties("spring.datasource.druid." )
//    public DataSource dataSource() {
//        return new DruidDataSource();
//    }


}
