package com.gbai.jpa;

import com.gbai.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: study
 * @description:
 * @author: gbai
 * @create: 2018-09-11 16:40
 **/
public interface AuthorityJPA extends JpaRepository<Authority, String> {
}
