package com.gbai.mapper.test;

import com.gbai.modle.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

	List<User> selectAllUser();

	int insert(@Param("pojo") User pojo);
}
