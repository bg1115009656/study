package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "children_edu_expense")
public class ChildrenEduExpense {
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
     * 子女身份证件类型
     */
    @Column(name = "children_cert_type")
    private String childrenCertType;

    /**
     * 子女身份证件号码
     */
    @Column(name = "children_cert_code")
    private String childrenCertCode;

    /**
     * 出生日期
     */
    @Column(name = "children_birth")
    private String childrenBirth;

    /**
     * 国籍(地区)
     */
    @Column(name = "children_nationality")
    private String childrenNationality;

    /**
     * 当前受教育阶段
     */
    @Column(name = "cur_edu_stage")
    private String curEduStage;

    /**
     * 当前受教育阶段起始时间
     */
    @Column(name = "cur_edu_start_time")
    private String curEduStartTime;

    /**
     * 当前受教育阶段结束时间
     */
    @Column(name = "cur_edu_end_time")
    private String curEduEndTime;

    /**
     * 教育终止时间
     */
    @Column(name = "edu_final_time")
    private String eduFinalTime;

    /**
     * 当前就读国家(地区)
     */
    @Column(name = "cur_study_country")
    private String curStudyCountry;

    /**
     * 当前就读学校
     */
    @Column(name = "cur_study_school")
    private String curStudySchool;

    /**
     * 本人扣除比例
     */
    @Column(name = "deduction_percentage")
    private String deductionPercentage;

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
     * 获取子女身份证件类型
     *
     * @return children_cert_type - 子女身份证件类型
     */
    public String getChildrenCertType() {
        return childrenCertType;
    }

    /**
     * 设置子女身份证件类型
     *
     * @param childrenCertType 子女身份证件类型
     */
    public void setChildrenCertType(String childrenCertType) {
        this.childrenCertType = childrenCertType;
    }

    /**
     * 获取子女身份证件号码
     *
     * @return children_cert_code - 子女身份证件号码
     */
    public String getChildrenCertCode() {
        return childrenCertCode;
    }

    /**
     * 设置子女身份证件号码
     *
     * @param childrenCertCode 子女身份证件号码
     */
    public void setChildrenCertCode(String childrenCertCode) {
        this.childrenCertCode = childrenCertCode;
    }

    /**
     * 获取出生日期
     *
     * @return children_birth - 出生日期
     */
    public String getChildrenBirth() {
        return childrenBirth;
    }

    /**
     * 设置出生日期
     *
     * @param childrenBirth 出生日期
     */
    public void setChildrenBirth(String childrenBirth) {
        this.childrenBirth = childrenBirth;
    }

    /**
     * 获取国籍(地区)
     *
     * @return children_nationality - 国籍(地区)
     */
    public String getChildrenNationality() {
        return childrenNationality;
    }

    /**
     * 设置国籍(地区)
     *
     * @param childrenNationality 国籍(地区)
     */
    public void setChildrenNationality(String childrenNationality) {
        this.childrenNationality = childrenNationality;
    }

    /**
     * 获取当前受教育阶段
     *
     * @return cur_edu_stage - 当前受教育阶段
     */
    public String getCurEduStage() {
        return curEduStage;
    }

    /**
     * 设置当前受教育阶段
     *
     * @param curEduStage 当前受教育阶段
     */
    public void setCurEduStage(String curEduStage) {
        this.curEduStage = curEduStage;
    }

    /**
     * 获取当前受教育阶段起始时间
     *
     * @return cur_edu_start_time - 当前受教育阶段起始时间
     */
    public String getCurEduStartTime() {
        return curEduStartTime;
    }

    /**
     * 设置当前受教育阶段起始时间
     *
     * @param curEduStartTime 当前受教育阶段起始时间
     */
    public void setCurEduStartTime(String curEduStartTime) {
        this.curEduStartTime = curEduStartTime;
    }

    /**
     * 获取当前受教育阶段结束时间
     *
     * @return cur_edu_end_time - 当前受教育阶段结束时间
     */
    public String getCurEduEndTime() {
        return curEduEndTime;
    }

    /**
     * 设置当前受教育阶段结束时间
     *
     * @param curEduEndTime 当前受教育阶段结束时间
     */
    public void setCurEduEndTime(String curEduEndTime) {
        this.curEduEndTime = curEduEndTime;
    }

    /**
     * 获取教育终止时间
     *
     * @return edu_final_time - 教育终止时间
     */
    public String getEduFinalTime() {
        return eduFinalTime;
    }

    /**
     * 设置教育终止时间
     *
     * @param eduFinalTime 教育终止时间
     */
    public void setEduFinalTime(String eduFinalTime) {
        this.eduFinalTime = eduFinalTime;
    }

    /**
     * 获取当前就读国家(地区)
     *
     * @return cur_study_country - 当前就读国家(地区)
     */
    public String getCurStudyCountry() {
        return curStudyCountry;
    }

    /**
     * 设置当前就读国家(地区)
     *
     * @param curStudyCountry 当前就读国家(地区)
     */
    public void setCurStudyCountry(String curStudyCountry) {
        this.curStudyCountry = curStudyCountry;
    }

    /**
     * 获取当前就读学校
     *
     * @return cur_study_school - 当前就读学校
     */
    public String getCurStudySchool() {
        return curStudySchool;
    }

    /**
     * 设置当前就读学校
     *
     * @param curStudySchool 当前就读学校
     */
    public void setCurStudySchool(String curStudySchool) {
        this.curStudySchool = curStudySchool;
    }

    /**
     * 获取本人扣除比例
     *
     * @return deduction_percentage - 本人扣除比例
     */
    public String getDeductionPercentage() {
        return deductionPercentage;
    }

    /**
     * 设置本人扣除比例
     *
     * @param deductionPercentage 本人扣除比例
     */
    public void setDeductionPercentage(String deductionPercentage) {
        this.deductionPercentage = deductionPercentage;
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