package com.gbai.aspect;

import com.gbai.config.DBTypeEnum;
import com.gbai.config.DbContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 17:30
 **/
@Component
@Aspect
@Order(-100) //这是为了保证AOP在事务注解之前生效,Order的值越小,优先级越高
@Slf4j
public class DataSourceSwitchAspect {
    @Pointcut("execution(* com.gbai.dao.test.*.*(..))")
    private void testAspect() {
    }

    @Pointcut("execution(* com.gbai.dao.book.*.*(..))")
    private void bookAspect() {
    }

    @Before( "testAspect()" )
    public void db1() {
        log.info("切换到test 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.test);
    }

    @Before("bookAspect()" )
    public void db2 () {
        log.info("切换到book 数据源...");
        DbContextHolder.setDbType(DBTypeEnum.book);
    }
}
