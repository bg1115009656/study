package com.gbai.mapper;

import com.gbai.modle.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

	List<User> selectAllUser();

	int insert(@Param("pojo") User pojo);
}
