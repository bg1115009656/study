package com.gbai.jpa;

import com.gbai.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-11 16:39
 **/
public interface UserJPA extends JpaRepository<User, String> {

    @Query("SELECT u FROM User u WHERE LOWER(u.username) = LOWER(:username)")
    User findByUsernameCaseInsensitive(@Param("username") String username);

}