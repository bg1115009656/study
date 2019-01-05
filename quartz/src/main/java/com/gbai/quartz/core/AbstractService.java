package com.gbai.quartz.core;


import org.apache.commons.collections4.CollectionUtils;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> implements Service<T> {

    @Autowired
    protected Mapper<T> mapper;

    public void save(T model) {
        mapper.insertSelective(model);
    }

    public void save(List<T> models) {
        mapper.insertList(models);
    }

    public void deleteById(Integer id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void deleteByIds(String ids) {
        mapper.deleteByIds(ids);
    }

    public void update(T model) {
        mapper.updateByPrimaryKeySelective(model);
    }

    public void updateList(List<T> models) {
        mapper.updateList(models);
    }

    public T findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }
    public T findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public T findOne(T model) throws TooManyResultsException {
        return mapper.selectOne(model);
    }

    public List<T> findByIds(String ids) {
        return mapper.selectByIds(ids);
    }

    public List<T> findByIds(List<Long> ids) {
        return CollectionUtils.isEmpty(ids) ? Collections.emptyList() : mapper.selectByIds(ids.stream().map(Object::toString).collect(Collectors.joining(",")));
    }

    public List<T> findByModel(T model) {
        return mapper.select(model);
    }

    public List<T> findByCondition(Condition condition) {
        return mapper.selectByCondition(condition);
    }

    public List<T> findAll() {
        return mapper.selectAll();
    }
}
