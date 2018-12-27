package com.dianmi.esign.core;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * Created by huyapeng on 2018/5/9.
 */
public interface UpdateListMapper<T> {
    @UpdateProvider(type = UpdateListProvider.class,
            method = "dynamicSQL")
    @Options(useCache = false,
            useGeneratedKeys = false)
    int updateList(List<T> var1);
}
