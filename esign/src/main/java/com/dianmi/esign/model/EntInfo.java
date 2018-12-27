package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ent_info")
public class EntInfo {
    /**
     * 平台企业编号
     */
    @Id
    @Column(name = "ENT_UUID")
    private String entUuid;

    /**
     * 企业编号
     */
    @Column(name = "ENT_ID")
    private Integer entId;

    /**
     * 企业名称
     */
    @Column(name = "ENT_NAME")
    private String entName;

    /**
     * 证件类型（组织机构代码，企业社会信用代码）
     */
    @Column(name = "CERT_TYPE")
    private String certType;

    /**
     * 证件号码
     */
    @Column(name = "CERT_CODE")
    private String certCode;

    /**
     * 法人姓名
     */
    @Column(name = "LEGAL_NAME")
    private String legalName;

    /**
     * 法人身份证号
     */
    @Column(name = "LEGAL_IDNO")
    private String legalIdno;

    /**
     * 法人归属地
     */
    @Column(name = "LEGAL_AREA")
    private String legalArea;

    /**
     * 公司地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 经营范围
     */
    @Column(name = "SCOPE")
    private String scope;

    /**
     * 公司对公银行账户名称
     */
    @Column(name = "ENT_ACCOUNT_NAME")
    private String entAccountName;

    /**
     * 公司银行账户
     */
    @Column(name = "ENT_CARDNO")
    private String entCardno;

    /**
     * 企业银行账号开户行支行名称
     */
    @Column(name = "ENT_SUBBRANCH")
    private String entSubbranch;

    /**
     * 企业开户行名称
     */
    @Column(name = "ENT_BANK")
    private String entBank;

    /**
     * 企业银行账号开户行所在省份
     */
    @Column(name = "BANK_PROVICE")
    private String bankProvice;

    /**
     * 企业银行账号开户行所在城市
     */
    @Column(name = "BANK_CITY")
    private String bankCity;

    /**
     * 企业e签宝账户标识
     */
    @Column(name = "ENT_ACCOUNT_ID")
    private String entAccountId;

    /**
     * 实名认证成功服务id
     */
    @Column(name = "SERVICE_ID")
    private String serviceId;

    /**
     * 打款完成接收地址
     */
    @Column(name = "NOTIFY_URL")
    private String notifyUrl;

    /**
     * 企业对公账户所在开户行的大额行号
     */
    @Column(name = "ENT_PRCPTCD")
    private String entPrcptcd;

    /**
     * 调用者业务id
     */
    @Column(name = "PIZID")
    private String pizid;

    /**
     * 打款完成时间
     */
    @Column(name = "PAYED_TIME")
    private String payedTime;

    /**
     * 企业对公打款认证状态
     */
    @Column(name = "APPROV_STATUS")
    private String approvStatus;

    /**
     * 对公打款失败信息
     */
    @Column(name = "APPROV_FAIL_MSG")
    private String approvFailMsg;

    /**
     * 电子印章存储位置
     */
    @Column(name = "ELE_SEAL")
    private String eleSeal;

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

    public String getEleSeal() {
        return eleSeal;
    }

    public void setEleSeal(String eleSeal) {
        this.eleSeal = eleSeal;
    }

    /**
     * 获取平台企业编号
     *
     * @return ENT_UUID - 平台企业编号
     */
    public String getEntUuid() {
        return entUuid;
    }

    /**
     * 设置平台企业编号
     *
     * @param entUuid 平台企业编号
     */
    public void setEntUuid(String entUuid) {
        this.entUuid = entUuid;
    }

    /**
     * 获取企业编号
     *
     * @return ENT_ID - 企业编号
     */
    public Integer getEntId() {
        return entId;
    }

    /**
     * 设置企业编号
     *
     * @param entId 企业编号
     */
    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    /**
     * 获取企业名称
     *
     * @return ENT_NAME - 企业名称
     */
    public String getEntName() {
        return entName;
    }

    /**
     * 设置企业名称
     *
     * @param entName 企业名称
     */
    public void setEntName(String entName) {
        this.entName = entName;
    }

    /**
     * 获取证件类型（组织机构代码，企业社会信用代码）
     *
     * @return CERT_TYPE - 证件类型（组织机构代码，企业社会信用代码）
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 设置证件类型（组织机构代码，企业社会信用代码）
     *
     * @param certType 证件类型（组织机构代码，企业社会信用代码）
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * 获取证件号码
     *
     * @return CERT_CODE - 证件号码
     */
    public String getCertCode() {
        return certCode;
    }

    /**
     * 设置证件号码
     *
     * @param certCode 证件号码
     */
    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }

    /**
     * 获取法人姓名
     *
     * @return LEGAL_NAME - 法人姓名
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * 设置法人姓名
     *
     * @param legalName 法人姓名
     */
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     * 获取法人身份证号
     *
     * @return LEGAL_IDNO - 法人身份证号
     */
    public String getLegalIdno() {
        return legalIdno;
    }

    /**
     * 设置法人身份证号
     *
     * @param legalIdno 法人身份证号
     */
    public void setLegalIdno(String legalIdno) {
        this.legalIdno = legalIdno;
    }

    /**
     * 获取法人归属地
     *
     * @return LEGAL_AREA - 法人归属地
     */
    public String getLegalArea() {
        return legalArea;
    }

    /**
     * 设置法人归属地
     *
     * @param legalArea 法人归属地
     */
    public void setLegalArea(String legalArea) {
        this.legalArea = legalArea;
    }

    /**
     * 获取公司地址
     *
     * @return ADDRESS - 公司地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置公司地址
     *
     * @param address 公司地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取经营范围
     *
     * @return SCOPE - 经营范围
     */
    public String getScope() {
        return scope;
    }

    /**
     * 设置经营范围
     *
     * @param scope 经营范围
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * 获取公司对公银行账户名称
     *
     * @return ENT_ACCOUNT_NAME - 公司对公银行账户名称
     */
    public String getEntAccountName() {
        return entAccountName;
    }

    /**
     * 设置公司对公银行账户名称
     *
     * @param entAccountName 公司对公银行账户名称
     */
    public void setEntAccountName(String entAccountName) {
        this.entAccountName = entAccountName;
    }

    /**
     * 获取公司银行账户
     *
     * @return ENT_CARDNO - 公司银行账户
     */
    public String getEntCardno() {
        return entCardno;
    }

    /**
     * 设置公司银行账户
     *
     * @param entCardno 公司银行账户
     */
    public void setEntCardno(String entCardno) {
        this.entCardno = entCardno;
    }

    /**
     * 获取企业银行账号开户行支行名称
     *
     * @return ENT_SUBBRANCH - 企业银行账号开户行支行名称
     */
    public String getEntSubbranch() {
        return entSubbranch;
    }

    /**
     * 设置企业银行账号开户行支行名称
     *
     * @param entSubbranch 企业银行账号开户行支行名称
     */
    public void setEntSubbranch(String entSubbranch) {
        this.entSubbranch = entSubbranch;
    }

    /**
     * 获取企业开户行名称
     *
     * @return ENT_BANK - 企业开户行名称
     */
    public String getEntBank() {
        return entBank;
    }

    /**
     * 设置企业开户行名称
     *
     * @param entBank 企业开户行名称
     */
    public void setEntBank(String entBank) {
        this.entBank = entBank;
    }

    /**
     * 获取企业银行账号开户行所在省份
     *
     * @return BANK_PROVICE - 企业银行账号开户行所在省份
     */
    public String getBankProvice() {
        return bankProvice;
    }

    /**
     * 设置企业银行账号开户行所在省份
     *
     * @param bankProvice 企业银行账号开户行所在省份
     */
    public void setBankProvice(String bankProvice) {
        this.bankProvice = bankProvice;
    }

    /**
     * 获取企业银行账号开户行所在城市
     *
     * @return BANK_CITY - 企业银行账号开户行所在城市
     */
    public String getBankCity() {
        return bankCity;
    }

    /**
     * 设置企业银行账号开户行所在城市
     *
     * @param bankCity 企业银行账号开户行所在城市
     */
    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    /**
     * 获取企业e签宝账户标识
     *
     * @return ENT_ACCOUNT_ID - 企业e签宝账户标识
     */
    public String getEntAccountId() {
        return entAccountId;
    }

    /**
     * 设置企业e签宝账户标识
     *
     * @param entAccountId 企业e签宝账户标识
     */
    public void setEntAccountId(String entAccountId) {
        this.entAccountId = entAccountId;
    }

    /**
     * 获取实名认证成功服务id
     *
     * @return SERVICE_ID - 实名认证成功服务id
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * 设置实名认证成功服务id
     *
     * @param serviceId 实名认证成功服务id
     */
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * 获取打款完成接收地址
     *
     * @return NOTIFY_URL - 打款完成接收地址
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置打款完成接收地址
     *
     * @param notifyUrl 打款完成接收地址
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * 获取企业对公账户所在开户行的大额行号
     *
     * @return ENT_PRCPTCD - 企业对公账户所在开户行的大额行号
     */
    public String getEntPrcptcd() {
        return entPrcptcd;
    }

    /**
     * 设置企业对公账户所在开户行的大额行号
     *
     * @param entPrcptcd 企业对公账户所在开户行的大额行号
     */
    public void setEntPrcptcd(String entPrcptcd) {
        this.entPrcptcd = entPrcptcd;
    }

    /**
     * 获取调用者业务id
     *
     * @return PIZID - 调用者业务id
     */
    public String getPizid() {
        return pizid;
    }

    /**
     * 设置调用者业务id
     *
     * @param pizid 调用者业务id
     */
    public void setPizid(String pizid) {
        this.pizid = pizid;
    }

    /**
     * 获取打款完成时间
     *
     * @return PAYED_TIME - 打款完成时间
     */
    public String getPayedTime() {
        return payedTime;
    }

    /**
     * 设置打款完成时间
     *
     * @param payedTime 打款完成时间
     */
    public void setPayedTime(String payedTime) {
        this.payedTime = payedTime;
    }

    /**
     * 获取企业对公打款认证状态
     *
     * @return APPROV_STATUS - 企业对公打款认证状态
     */
    public String getApprovStatus() {
        return approvStatus;
    }

    /**
     * 设置企业对公打款认证状态
     *
     * @param approvStatus 企业对公打款认证状态
     */
    public void setApprovStatus(String approvStatus) {
        this.approvStatus = approvStatus;
    }

    /**
     * 获取对公打款失败信息
     *
     * @return APPROV_FAIL_MSG - 对公打款失败信息
     */
    public String getApprovFailMsg() {
        return approvFailMsg;
    }

    /**
     * 设置对公打款失败信息
     *
     * @param approvFailMsg 对公打款失败信息
     */
    public void setApprovFailMsg(String approvFailMsg) {
        this.approvFailMsg = approvFailMsg;
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