package com.gbai.service.impl;

import com.gbai.entity.User;
import com.gbai.dao.UserMapper;
import com.gbai.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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

}
