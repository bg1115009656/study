package com.gbai.entity;

import lombok.Data;

import javax.persistence.Table;
import java.util.List;

/**
 * @program: security
 * @description:
 * @author: gbai
 * @create: 2018-07-06 18:15
 **/
@Data
@Table(name = "user")
public class User {
    private String id;
    private String username;
    private String password;
    private List<String> roles;
}
