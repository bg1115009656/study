package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sign_config")
public class SignConfig {
    /**
     * 配置编号
     */
    @Id
    @Column(name = "SIGN_CONFIG_ID")
    private Integer signConfigId;

    /**
     * 签约企业编号
     */
    @Column(name = "SIGN_ENT_ID")
    private Integer signEntId;

    /**
     * 可签约账户
     */
    @Column(name = "ACCOUNT_ID")
    private String accountId;

    /**
     * 数据状态（VALID:有效,INVALID:失效）
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "UPDATE_USER")
    private String updateUser;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CREATE_USER")
    private String createUser;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取配置编号
     *
     * @return SIGN_CONFIG_ID - 配置编号
     */
    public Integer getSignConfigId() {
        return signConfigId;
    }

    /**
     * 设置配置编号
     *
     * @param signConfigId 配置编号
     */
    public void setSignConfigId(Integer signConfigId) {
        this.signConfigId = signConfigId;
    }

    /**
     * 获取签约企业编号
     *
     * @return SIGN_ENT_ID - 签约企业编号
     */
    public Integer getSignEntId() {
        return signEntId;
    }

    /**
     * 设置签约企业编号
     *
     * @param signEntId 签约企业编号
     */
    public void setSignEntId(Integer signEntId) {
        this.signEntId = signEntId;
    }

    /**
     * 获取可签约账户
     *
     * @return ACCOUNT_ID - 可签约账户
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * 设置可签约账户
     *
     * @param accountId 可签约账户
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * 获取数据状态（VALID:有效,INVALID:失效）
     *
     * @return STATUS - 数据状态（VALID:有效,INVALID:失效）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置数据状态（VALID:有效,INVALID:失效）
     *
     * @param status 数据状态（VALID:有效,INVALID:失效）
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return UPDATE_USER
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * @param updateUser
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * @return UPDATE_TIME
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
     * @return CREATE_USER
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * @param createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * @return CREATE_TIME
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