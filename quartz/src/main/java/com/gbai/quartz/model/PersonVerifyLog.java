package com.gbai.quartz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "person_verify_log")
public class PersonVerifyLog {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String idno;

    /**
     * 银行卡号
     */
    private String cardno;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 实名状态
     */
    @Column(name = "verify_status")
    private String verifyStatus;

    /**
     * 服务编号
     */
    @Column(name = "service_id")
    private String serviceId;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "create_time")
    private Date createTime;

}