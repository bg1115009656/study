package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "contract_info")
public class ContractInfo {
    /**
     * 合同编号
     */
    @Id
    @Column(name = "CONTRACT_UUID")
    private String contractUuid;

    /**
     * 合同编号
     */
    @Column(name = "CONTRACT_ID")
    private Integer contractId;

    /**
     * 签约企业
     */
    @Column(name = "SIGN_ENT")
    private Integer signEnt;

    /**
     * 签约企业名称
     */
    @Column(name = "SIGN_ENT_INFO")
    private String signEntInfo;

    /**
     * 签署员工平台唯一id
     */
    @Column(name = "UNION_ID")
    private String unionId;

    /**
     * 签署员工姓名
     */
    @Column(name = "STAFF_NAME")
    private String staffName;

    /**
     * 合同类型
     */
    @Column(name = "CONTRACT_TYPE")
    private String contractType;

    /**
     * 合同开始日期
     */
    @Column(name = "BEGIN_DATE")
    private String beginDate;

    /**
     * 结束日期
     */
    @Column(name = "END_DATE")
    private String endDate;

    /**
     * 签署日期
     */
    @Column(name = "SIGN_DATE")
    private String signDate;

    /**
     * 合同薪资
     */
    @Column(name = "CONTRACT_SAL")
    private String contractSal;

    /**
     * 工作岗位
     */
    @Column(name = "JOB_POST")
    private String jobPost;

    /**
     * 工作城市
     */
    @Column(name = "JOB_CITY")
    private String jobCity;

    /**
     * 审核状态(“待签署/已签署/已过期/已作废”)
     */
    @Column(name = "SIGN_STATUS")
    private String signStatus;

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
     * 获取合同编号
     *
     * @return CONTRACT_UUID - 合同编号
     */
    public String getContractUuid() {
        return contractUuid;
    }

    /**
     * 设置合同编号
     *
     * @param contractUuid 合同编号
     */
    public void setContractUuid(String contractUuid) {
        this.contractUuid = contractUuid;
    }

    /**
     * 获取合同编号
     *
     * @return CONTRACT_ID - 合同编号
     */
    public Integer getContractId() {
        return contractId;
    }

    /**
     * 设置合同编号
     *
     * @param contractId 合同编号
     */
    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    /**
     * 获取签约企业
     *
     * @return SIGN_ENT - 签约企业
     */
    public Integer getSignEnt() {
        return signEnt;
    }

    /**
     * 设置签约企业
     *
     * @param signEnt 签约企业
     */
    public void setSignEnt(Integer signEnt) {
        this.signEnt = signEnt;
    }

    /**
     * 获取签约企业名称
     *
     * @return SIGN_ENT_INFO - 签约企业名称
     */
    public String getSignEntInfo() {
        return signEntInfo;
    }

    /**
     * 设置签约企业名称
     *
     * @param signEntInfo 签约企业名称
     */
    public void setSignEntInfo(String signEntInfo) {
        this.signEntInfo = signEntInfo;
    }

    /**
     * 获取签署员工平台唯一id
     *
     * @return UNION_ID - 签署员工平台唯一id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置签署员工平台唯一id
     *
     * @param unionId 签署员工平台唯一id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取签署员工姓名
     *
     * @return STAFF_NAME - 签署员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置签署员工姓名
     *
     * @param staffName 签署员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取合同类型
     *
     * @return CONTRACT_TYPE - 合同类型
     */
    public String getContractType() {
        return contractType;
    }

    /**
     * 设置合同类型
     *
     * @param contractType 合同类型
     */
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    /**
     * 获取合同开始日期
     *
     * @return BEGIN_DATE - 合同开始日期
     */
    public String getBeginDate() {
        return beginDate;
    }

    /**
     * 设置合同开始日期
     *
     * @param beginDate 合同开始日期
     */
    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    /**
     * 获取结束日期
     *
     * @return END_DATE - 结束日期
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * 设置结束日期
     *
     * @param endDate 结束日期
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取签署日期
     *
     * @return SIGN_DATE - 签署日期
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * 设置签署日期
     *
     * @param signDate 签署日期
     */
    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取合同薪资
     *
     * @return CONTRACT_SAL - 合同薪资
     */
    public String getContractSal() {
        return contractSal;
    }

    /**
     * 设置合同薪资
     *
     * @param contractSal 合同薪资
     */
    public void setContractSal(String contractSal) {
        this.contractSal = contractSal;
    }

    /**
     * 获取工作岗位
     *
     * @return JOB_POST - 工作岗位
     */
    public String getJobPost() {
        return jobPost;
    }

    /**
     * 设置工作岗位
     *
     * @param jobPost 工作岗位
     */
    public void setJobPost(String jobPost) {
        this.jobPost = jobPost;
    }

    /**
     * 获取工作城市
     *
     * @return JOB_CITY - 工作城市
     */
    public String getJobCity() {
        return jobCity;
    }

    /**
     * 设置工作城市
     *
     * @param jobCity 工作城市
     */
    public void setJobCity(String jobCity) {
        this.jobCity = jobCity;
    }

    /**
     * 获取审核状态
     *
     * @return SIGN_STATUS - 审核状态
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * 设置审核状态
     *
     * @param signStatus 审核状态
     */
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
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