package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

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

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取身份证号
     *
     * @return idno - 身份证号
     */
    public String getIdno() {
        return idno;
    }

    /**
     * 设置身份证号
     *
     * @param idno 身份证号
     */
    public void setIdno(String idno) {
        this.idno = idno;
    }

    /**
     * 获取银行卡号
     *
     * @return cardno - 银行卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置银行卡号
     *
     * @param cardno 银行卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取实名状态
     *
     * @return verify_status - 实名状态
     */
    public String getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 设置实名状态
     *
     * @param verifyStatus 实名状态
     */
    public void setVerifyStatus(String verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 获取服务编号
     *
     * @return service_id - 服务编号
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 设置服务编号
     *
     * @param serviceId 服务编号
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}