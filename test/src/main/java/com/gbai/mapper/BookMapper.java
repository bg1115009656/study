package com.gbai.mapper;

import com.gbai.modle.Username;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {

	List<Username> selectAllBook();
}
