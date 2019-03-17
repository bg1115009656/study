package com.gbai.mapper;

import com.gbai.modle.Username;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsernameMapper {

	List<Username> selectAllUser();

	int insert(@Param("pojo") Username pojo);
}
