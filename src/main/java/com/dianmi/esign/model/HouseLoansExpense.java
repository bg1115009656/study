package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "house_loans_expense")
public class HouseLoansExpense {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 员工编号
     */
    @Column(name = "emp_id")
    private Long empId;

    /**
     * 房屋坐落位置
     */
    @Column(name = "children_name")
    private String childrenName;

    /**
     * 本人是否借款人
     */
    @Column(name = "children_cert_type")
    private String childrenCertType;

    /**
     * 房屋证书类型
     */
    @Column(name = "children_cert_code")
    private String childrenCertCode;

    /**
     * 房屋证书号码
     */
    @Column(name = "children_birth")
    private String childrenBirth;

    /**
     * 是否婚前各自首套贷款,且婚后分别扣除50%
     */
    @Column(name = "children_nationality")
    private String childrenNationality;

    /**
     * 贷款类型
     */
    @Column(name = "cur_edu_stage")
    private String curEduStage;

    /**
     * 贷款银行
     */
    @Column(name = "cur_edu_start_time")
    private String curEduStartTime;

    /**
     * 贷款合同编号
     */
    @Column(name = "cur_edu_end_time")
    private String curEduEndTime;

    /**
     * 首次还款日期
     */
    @Column(name = "edu_final_time")
    private String eduFinalTime;

    /**
     * 贷款期限(月数)
     */
    @Column(name = "cur_study_country")
    private String curStudyCountry;

    /**
     * 数据状态（0:有效,1:失效）
     */
    private Integer status;

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
     * 获取员工编号
     *
     * @return emp_id - 员工编号
     */
    public Long getEmpId() {
        return empId;
    }

    /**
     * 设置员工编号
     *
     * @param empId 员工编号
     */
    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    /**
     * 获取房屋坐落位置
     *
     * @return children_name - 房屋坐落位置
     */
    public String getChildrenName() {
        return childrenName;
    }

    /**
     * 设置房屋坐落位置
     *
     * @param childrenName 房屋坐落位置
     */
    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    /**
     * 获取本人是否借款人
     *
     * @return children_cert_type - 本人是否借款人
     */
    public String getChildrenCertType() {
        return childrenCertType;
    }

    /**
     * 设置本人是否借款人
     *
     * @param childrenCertType 本人是否借款人
     */
    public void setChildrenCertType(String childrenCertType) {
        this.childrenCertType = childrenCertType;
    }

    /**
     * 获取房屋证书类型
     *
     * @return children_cert_code - 房屋证书类型
     */
    public String getChildrenCertCode() {
        return childrenCertCode;
    }

    /**
     * 设置房屋证书类型
     *
     * @param childrenCertCode 房屋证书类型
     */
    public void setChildrenCertCode(String childrenCertCode) {
        this.childrenCertCode = childrenCertCode;
    }

    /**
     * 获取房屋证书号码
     *
     * @return children_birth - 房屋证书号码
     */
    public String getChildrenBirth() {
        return childrenBirth;
    }

    /**
     * 设置房屋证书号码
     *
     * @param childrenBirth 房屋证书号码
     */
    public void setChildrenBirth(String childrenBirth) {
        this.childrenBirth = childrenBirth;
    }

    /**
     * 获取是否婚前各自首套贷款,且婚后分别扣除50%
     *
     * @return children_nationality - 是否婚前各自首套贷款,且婚后分别扣除50%
     */
    public String getChildrenNationality() {
        return childrenNationality;
    }

    /**
     * 设置是否婚前各自首套贷款,且婚后分别扣除50%
     *
     * @param childrenNationality 是否婚前各自首套贷款,且婚后分别扣除50%
     */
    public void setChildrenNationality(String childrenNationality) {
        this.childrenNationality = childrenNationality;
    }

    /**
     * 获取贷款类型
     *
     * @return cur_edu_stage - 贷款类型
     */
    public String getCurEduStage() {
        return curEduStage;
    }

    /**
     * 设置贷款类型
     *
     * @param curEduStage 贷款类型
     */
    public void setCurEduStage(String curEduStage) {
        this.curEduStage = curEduStage;
    }

    /**
     * 获取贷款银行
     *
     * @return cur_edu_start_time - 贷款银行
     */
    public String getCurEduStartTime() {
        return curEduStartTime;
    }

    /**
     * 设置贷款银行
     *
     * @param curEduStartTime 贷款银行
     */
    public void setCurEduStartTime(String curEduStartTime) {
        this.curEduStartTime = curEduStartTime;
    }

    /**
     * 获取贷款合同编号
     *
     * @return cur_edu_end_time - 贷款合同编号
     */
    public String getCurEduEndTime() {
        return curEduEndTime;
    }

    /**
     * 设置贷款合同编号
     *
     * @param curEduEndTime 贷款合同编号
     */
    public void setCurEduEndTime(String curEduEndTime) {
        this.curEduEndTime = curEduEndTime;
    }

    /**
     * 获取首次还款日期
     *
     * @return edu_final_time - 首次还款日期
     */
    public String getEduFinalTime() {
        return eduFinalTime;
    }

    /**
     * 设置首次还款日期
     *
     * @param eduFinalTime 首次还款日期
     */
    public void setEduFinalTime(String eduFinalTime) {
        this.eduFinalTime = eduFinalTime;
    }

    /**
     * 获取贷款期限(月数)
     *
     * @return cur_study_country - 贷款期限(月数)
     */
    public String getCurStudyCountry() {
        return curStudyCountry;
    }

    /**
     * 设置贷款期限(月数)
     *
     * @param curStudyCountry 贷款期限(月数)
     */
    public void setCurStudyCountry(String curStudyCountry) {
        this.curStudyCountry = curStudyCountry;
    }

    /**
     * 获取数据状态（0:有效,1:失效）
     *
     * @return status - 数据状态（0:有效,1:失效）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置数据状态（0:有效,1:失效）
     *
     * @param status 数据状态（0:有效,1:失效）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}