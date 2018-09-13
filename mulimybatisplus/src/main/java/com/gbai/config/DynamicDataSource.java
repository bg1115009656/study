package com.gbai.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 17:27
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
     * 取得当前使用哪个数据源
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        return DbContextHolder.getDbType();
    }
}
