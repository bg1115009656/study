package com.gbai.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-13 09:35
 **/
public class DynamicRoutingDataSource extends AbstractRoutingDataSource {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    protected Object determineCurrentLookupKey() {

        logger.info("Current DataSource is [{}]", DynamicDataSourceContextHolder.getDataSourceKey());
        return DynamicDataSourceContextHolder.getDataSourceKey();
    }
}
