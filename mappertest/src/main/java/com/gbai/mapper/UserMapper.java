package com.gbai.mapper;

import com.gbai.bean.User;
import com.gbai.util.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<User> selectAllList();

    int saveOrUpdate(@Param("pojo") User user);
}
