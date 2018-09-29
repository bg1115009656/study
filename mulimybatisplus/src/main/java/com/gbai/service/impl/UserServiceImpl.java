package com.gbai.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.gbai.entity.User;
import com.gbai.dao.test.UserMapper;
import com.gbai.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author codeGenerate
 * @since 2018-07-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public Page<User> selectUserPage(Page<User> page, Integer state) {
        // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题
        // page.setOptimizeCountSql(false);
        // 不查询总记录数
        // page.setSearchCount(false);
        // 注意！！ 分页 total 是经过插件自动 回写 到传入 page 对象
        return page.setRecords(userMapper.selectUserList(page, state));
    }

    @Override
    public Integer deleteAllUser() {
        int i = userMapper.deleteAll();
        return i;
    }
}
