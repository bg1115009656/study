package com.gbai.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.gbai.entity.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author codeGenerate
 * @since 2018-07-26
 */
public interface UserService extends IService<User> {


    Page<User> selectUserPage(Page<User> page, Integer state) ;

    Integer deleteAllUser();
}
