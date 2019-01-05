package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "house_rent_expense")
public class HouseRentExpense {
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
     * 子女姓名
     */
    @Column(name = "children_name")
    private String childrenName;

    /**
     * 主要工作省份
     */
    @Column(name = "children_cert_type")
    private String childrenCertType;

    /**
     * 主要工作城市
     */
    @Column(name = "children_cert_code")
    private String childrenCertCode;

    /**
     * 类型
     */
    @Column(name = "children_birth")
    private String childrenBirth;

    /**
     * 出租方姓名(组织名称)
     */
    @Column(name = "children_nationality")
    private String childrenNationality;

    /**
     * 出租方证件类型
     */
    @Column(name = "cur_edu_stage")
    private String curEduStage;

    /**
     * 身份证件号码(统一社会信用代码)
     */
    @Column(name = "cur_edu_start_time")
    private String curEduStartTime;

    /**
     * 住房坐落地址
     */
    @Column(name = "cur_edu_end_time")
    private String curEduEndTime;

    /**
     * 住房租赁合同编号
     */
    @Column(name = "edu_final_time")
    private String eduFinalTime;

    /**
     * 租赁期起
     */
    @Column(name = "cur_study_country")
    private String curStudyCountry;

    /**
     * 租赁期止
     */
    @Column(name = "cur_study_school")
    private String curStudySchool;

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
     * 获取子女姓名
     *
     * @return children_name - 子女姓名
     */
    public String getChildrenName() {
        return childrenName;
    }

    /**
     * 设置子女姓名
     *
     * @param childrenName 子女姓名
     */
    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    /**
     * 获取主要工作省份
     *
     * @return children_cert_type - 主要工作省份
     */
    public String getChildrenCertType() {
        return childrenCertType;
    }

    /**
     * 设置主要工作省份
     *
     * @param childrenCertType 主要工作省份
     */
    public void setChildrenCertType(String childrenCertType) {
        this.childrenCertType = childrenCertType;
    }

    /**
     * 获取主要工作城市
     *
     * @return children_cert_code - 主要工作城市
     */
    public String getChildrenCertCode() {
        return childrenCertCode;
    }

    /**
     * 设置主要工作城市
     *
     * @param childrenCertCode 主要工作城市
     */
    public void setChildrenCertCode(String childrenCertCode) {
        this.childrenCertCode = childrenCertCode;
    }

    /**
     * 获取类型
     *
     * @return children_birth - 类型
     */
    public String getChildrenBirth() {
        return childrenBirth;
    }

    /**
     * 设置类型
     *
     * @param childrenBirth 类型
     */
    public void setChildrenBirth(String childrenBirth) {
        this.childrenBirth = childrenBirth;
    }

    /**
     * 获取出租方姓名(组织名称)
     *
     * @return children_nationality - 出租方姓名(组织名称)
     */
    public String getChildrenNationality() {
        return childrenNationality;
    }

    /**
     * 设置出租方姓名(组织名称)
     *
     * @param childrenNationality 出租方姓名(组织名称)
     */
    public void setChildrenNationality(String childrenNationality) {
        this.childrenNationality = childrenNationality;
    }

    /**
     * 获取出租方证件类型
     *
     * @return cur_edu_stage - 出租方证件类型
     */
    public String getCurEduStage() {
        return curEduStage;
    }

    /**
     * 设置出租方证件类型
     *
     * @param curEduStage 出租方证件类型
     */
    public void setCurEduStage(String curEduStage) {
        this.curEduStage = curEduStage;
    }

    /**
     * 获取身份证件号码(统一社会信用代码)
     *
     * @return cur_edu_start_time - 身份证件号码(统一社会信用代码)
     */
    public String getCurEduStartTime() {
        return curEduStartTime;
    }

    /**
     * 设置身份证件号码(统一社会信用代码)
     *
     * @param curEduStartTime 身份证件号码(统一社会信用代码)
     */
    public void setCurEduStartTime(String curEduStartTime) {
        this.curEduStartTime = curEduStartTime;
    }

    /**
     * 获取住房坐落地址
     *
     * @return cur_edu_end_time - 住房坐落地址
     */
    public String getCurEduEndTime() {
        return curEduEndTime;
    }

    /**
     * 设置住房坐落地址
     *
     * @param curEduEndTime 住房坐落地址
     */
    public void setCurEduEndTime(String curEduEndTime) {
        this.curEduEndTime = curEduEndTime;
    }

    /**
     * 获取住房租赁合同编号
     *
     * @return edu_final_time - 住房租赁合同编号
     */
    public String getEduFinalTime() {
        return eduFinalTime;
    }

    /**
     * 设置住房租赁合同编号
     *
     * @param eduFinalTime 住房租赁合同编号
     */
    public void setEduFinalTime(String eduFinalTime) {
        this.eduFinalTime = eduFinalTime;
    }

    /**
     * 获取租赁期起
     *
     * @return cur_study_country - 租赁期起
     */
    public String getCurStudyCountry() {
        return curStudyCountry;
    }

    /**
     * 设置租赁期起
     *
     * @param curStudyCountry 租赁期起
     */
    public void setCurStudyCountry(String curStudyCountry) {
        this.curStudyCountry = curStudyCountry;
    }

    /**
     * 获取租赁期止
     *
     * @return cur_study_school - 租赁期止
     */
    public String getCurStudySchool() {
        return curStudySchool;
    }

    /**
     * 设置租赁期止
     *
     * @param curStudySchool 租赁期止
     */
    public void setCurStudySchool(String curStudySchool) {
        this.curStudySchool = curStudySchool;
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