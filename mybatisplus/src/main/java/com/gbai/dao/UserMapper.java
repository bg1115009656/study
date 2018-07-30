package com.gbai.dao;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.gbai.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author codeGenerate
 * @since 2018-07-26
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * </p>
     *
     * @param page
     *            翻页对象，可以作为 xml 参数直接使用，传递参数 Page 即自动分页
     * @param state
     *            状态
     * @return
     */
    List<User> selectUserList(Pagination page, Integer state);
    /**
     * 自定义注入方法
     */
    int deleteAll();
}
