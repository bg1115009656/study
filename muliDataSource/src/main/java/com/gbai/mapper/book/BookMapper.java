package com.gbai.mapper.book;

import com.gbai.modle.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface BookMapper {

	List<User> selectAllBook();
}
