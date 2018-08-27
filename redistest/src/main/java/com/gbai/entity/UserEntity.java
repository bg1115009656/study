package com.gbai.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: redistest
 * @description:
 * @author: gbai
 * @create: 2018-07-19 14:15
 **/
@Entity
@Table(name = "user")
public class UserEntity implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "t_id")
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private int age;

    @Column(name = "t_address")
    private String address;

    @Column(name = "t_pwd")
    private String password;
}
