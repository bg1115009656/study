package com.dianmi.esign.core;

import org.apache.ibatis.mapping.MappedStatement;
import tk.mybatis.mapper.mapperhelper.MapperHelper;
import tk.mybatis.mapper.mapperhelper.MapperTemplate;
import tk.mybatis.mapper.mapperhelper.SqlHelper;

/**
 * Created by huyapeng on 2018/5/9.
 */
public class UpdateListProvider extends MapperTemplate {

    public UpdateListProvider(Class<?> mapperClass, MapperHelper mapperHelper) {
        super(mapperClass, mapperHelper);
    }

    public String updateList(MappedStatement ms) {
        Class entityClass = this.getEntityClass(ms);
        StringBuilder sql = new StringBuilder();
        sql.append(" <foreach collection=\"list\" item=\"pojo\" index=\"index\" open=\"\" close=\"\" separator=\";\">");
        sql.append(SqlHelper.updateTable(entityClass, this.tableName(entityClass)));
        sql.append(SqlHelper.updateSetColumns(entityClass, "pojo", false, false));
        sql.append("WHERE id = #{pojo.id}");
        sql.append("</foreach>");

        return sql.toString();
    }


}
