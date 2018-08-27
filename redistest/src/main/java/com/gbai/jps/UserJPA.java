package com.gbai.jps;

import com.gbai.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: redistest
 * @description:
 * @author: gbai
 * @create: 2018-07-19 14:25
 **/
public interface UserJPA extends JpaRepository<UserEntity,Long> {
}
