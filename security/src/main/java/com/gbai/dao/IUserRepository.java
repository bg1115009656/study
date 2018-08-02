package com.gbai.dao;

import com.gbai.entity.User;
import org.springframework.stereotype.Component;

/**
 * @program: security
 * @description:
 * @author: gbai
 * @create: 2018-07-06 18:17
 **/
@Component
public interface IUserRepository {
    User findByUsername(String username);
}
