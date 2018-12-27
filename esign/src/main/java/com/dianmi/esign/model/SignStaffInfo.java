package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sign_staff_info")
public class SignStaffInfo {
    /**
     * 签约员工编号
     */
    @Id
    @Column(name = "STAFF_ID")
    private String staffId;

    /**
     * 签约员工平台编号
     */
    @Column(name = "STAFF_UUID")
    private String staffUuid;

    /**
     * 员工姓名
     */
    @Column(name = "STAFF_NAME")
    private String staffName;

    /**
     * 员工性别
     */
    @Column(name = "STAFF_GENDER")
    private String staffGender;

    /**
     * 员工年龄
     */
    @Column(name = "STAFF_AGE")
    private String staffAge;

    /**
     * 在职状态
     */
    @Column(name = "STAFF_STATUS")
    private String staffStatus;

    /**
     * 手机号
     */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /**
     * 邮箱
     */
    @Column(name = "E_MAIL")
    private String eMail;

    /**
     * 身份证号
     */
    @Column(name = "ID_NUM")
    private String idNum;

    /**
     * 银行卡号
     */
    @Column(name = "BANK_NUM")
    private Integer bankNum;

    /**
     * 居住地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 紧急联系人
     */
    @Column(name = "EME_CONTACT")
    private String emeContact;

    /**
     * 紧急联系电话
     */
    @Column(name = "EME_NUMBER")
    private String emeNumber;

    /**
     * 所属企业编号
     */
    @Column(name = "ENT_ID")
    private Integer entId;

    /**
     * 实名状态
     */
    @Column(name = "SERVICE_ID")
    private String serviceId;

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
     * 获取签约员工编号
     *
     * @return STAFF_ID - 签约员工编号
     */
    public String getStaffId() {
        return staffId;
    }

    /**
     * 设置签约员工编号
     *
     * @param staffId 签约员工编号
     */
    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    /**
     * 获取签约员工平台编号
     *
     * @return STAFF_UUID - 签约员工平台编号
     */
    public String getStaffUuid() {
        return staffUuid;
    }

    /**
     * 设置签约员工平台编号
     *
     * @param staffUuid 签约员工平台编号
     */
    public void setStaffUuid(String staffUuid) {
        this.staffUuid = staffUuid;
    }

    /**
     * 获取员工姓名
     *
     * @return STAFF_NAME - 员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置员工姓名
     *
     * @param staffName 员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取员工性别
     *
     * @return STAFF_GENDER - 员工性别
     */
    public String getStaffGender() {
        return staffGender;
    }

    /**
     * 设置员工性别
     *
     * @param staffGender 员工性别
     */
    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    /**
     * 获取员工年龄
     *
     * @return STAFF_AGE - 员工年龄
     */
    public String getStaffAge() {
        return staffAge;
    }

    /**
     * 设置员工年龄
     *
     * @param staffAge 员工年龄
     */
    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    /**
     * 获取在职状态
     *
     * @return STAFF_STATUS - 在职状态
     */
    public String getStaffStatus() {
        return staffStatus;
    }

    /**
     * 设置在职状态
     *
     * @param staffStatus 在职状态
     */
    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    /**
     * 获取手机号
     *
     * @return PHONE_NUMBER - 手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置手机号
     *
     * @param phoneNumber 手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取邮箱
     *
     * @return E_MAIL - 邮箱
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置邮箱
     *
     * @param eMail 邮箱
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取身份证号
     *
     * @return ID_NUM - 身份证号
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * 设置身份证号
     *
     * @param idNum 身份证号
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * 获取银行卡号
     *
     * @return BANK_NUM - 银行卡号
     */
    public Integer getBankNum() {
        return bankNum;
    }

    /**
     * 设置银行卡号
     *
     * @param bankNum 银行卡号
     */
    public void setBankNum(Integer bankNum) {
        this.bankNum = bankNum;
    }

    /**
     * 获取居住地址
     *
     * @return ADDRESS - 居住地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置居住地址
     *
     * @param address 居住地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取紧急联系人
     *
     * @return EME_CONTACT - 紧急联系人
     */
    public String getEmeContact() {
        return emeContact;
    }

    /**
     * 设置紧急联系人
     *
     * @param emeContact 紧急联系人
     */
    public void setEmeContact(String emeContact) {
        this.emeContact = emeContact;
    }

    /**
     * 获取紧急联系电话
     *
     * @return EME_NUMBER - 紧急联系电话
     */
    public String getEmeNumber() {
        return emeNumber;
    }

    /**
     * 设置紧急联系电话
     *
     * @param emeNumber 紧急联系电话
     */
    public void setEmeNumber(String emeNumber) {
        this.emeNumber = emeNumber;
    }

    /**
     * 获取所属企业编号
     *
     * @return ENT_ID - 所属企业编号
     */
    public Integer getEntId() {
        return entId;
    }

    /**
     * 设置所属企业编号
     *
     * @param entId 所属企业编号
     */
    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    /**
     * 获取实名状态
     *
     * @return SERVICE_ID - 实名状态
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 设置实名状态
     *
     * @param serviceId 实名状态
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
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