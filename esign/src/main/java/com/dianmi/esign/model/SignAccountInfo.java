package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sign_account_info")
public class SignAccountInfo {
    /**
     * 账户编号
     */
    @Id
    @Column(name = "ACCOUNT_UUID")
    private String accountUuid;

    /**
     * 用户登录名
     */
    @Column(name = "ACCOUNT_USERNAME")
    private String accountUsername;

    /**
     * 登陆密码
     */
    @Column(name = "ACCOUNT_PASSWORD")
    private String accountPassword;

    /**
     * 账户角色
     */
    @Column(name = "ACCOUNT_ROLE")
    private String accountRole;

    /**
     * 账号所属企业编号
     */
    @Column(name = "BELONG_ENT_ID")
    private Integer belongEntId;

    /**
     * 账户绑定邮箱
     */
    @Column(name = "E-MAIL")
    private String eMail;

    /**
     * 账户绑定手机号
     */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

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
     * 获取账户编号
     *
     * @return ACCOUNT_UUID - 账户编号
     */
    public String getAccountUuid() {
        return accountUuid;
    }

    /**
     * 设置账户编号
     *
     * @param accountUuid 账户编号
     */
    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid;
    }

    /**
     * 获取用户登录名
     *
     * @return ACCOUNT_USERNAME - 用户登录名
     */
    public String getAccountUsername() {
        return accountUsername;
    }

    /**
     * 设置用户登录名
     *
     * @param accountUsername 用户登录名
     */
    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername;
    }

    /**
     * 获取登陆密码
     *
     * @return ACCOUNT_PASSWORD - 登陆密码
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * 设置登陆密码
     *
     * @param accountPassword 登陆密码
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    /**
     * 获取账户角色
     *
     * @return ACCOUNT_ROLE - 账户角色
     */
    public String getAccountRole() {
        return accountRole;
    }

    /**
     * 设置账户角色
     *
     * @param accountRole 账户角色
     */
    public void setAccountRole(String accountRole) {
        this.accountRole = accountRole;
    }

    /**
     * 获取账号所属企业编号
     *
     * @return BELONG_ENT_ID - 账号所属企业编号
     */
    public Integer getBelongEntId() {
        return belongEntId;
    }

    /**
     * 设置账号所属企业编号
     *
     * @param belongEntId 账号所属企业编号
     */
    public void setBelongEntId(Integer belongEntId) {
        this.belongEntId = belongEntId;
    }

    /**
     * 获取账户绑定邮箱
     *
     * @return E-MAIL - 账户绑定邮箱
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置账户绑定邮箱
     *
     * @param eMail 账户绑定邮箱
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取账户绑定手机号
     *
     * @return PHONE_NUMBER - 账户绑定手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置账户绑定手机号
     *
     * @param phoneNumber 账户绑定手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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