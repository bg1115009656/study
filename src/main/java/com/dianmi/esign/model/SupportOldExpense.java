package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "support_old_expense")
public class SupportOldExpense {
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
     * 是否独生子女,0否1是
     */
    @Column(name = "is_only_child")
    private Integer isOnlyChild;

    /**
     * 分摊方式
     */
    @Column(name = "share_type")
    private String shareType;

    /**
     * 本年度月扣除金额
     */
    @Column(name = "cur_month_amount_deducted")
    private String curMonthAmountDeducted;

    /**
     * 赡养类型(独自,分摊)
     */
    @Column(name = "support_type")
    private String supportType;

    /**
     * 被赡养人姓名
     */
    @Column(name = "dependent_name")
    private String dependentName;

    /**
     * 被赡养人身份证件类型
     */
    @Column(name = "dependent_cert_type")
    private String dependentCertType;

    /**
     * 被赡养人身份证件号码
     */
    @Column(name = "dependent_cert_code")
    private String dependentCertCode;

    /**
     * 被赡养人国籍(地区)
     */
    @Column(name = "dependent_nationality")
    private String dependentNationality;

    /**
     * 与被赡养人关系
     */
    @Column(name = "dependent_relationship")
    private String dependentRelationship;

    /**
     * 出生日期
     */
    @Column(name = "dependent_birth")
    private String dependentBirth;

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
     * 获取是否独生子女,0否1是
     *
     * @return is_only_child - 是否独生子女,0否1是
     */
    public Integer getIsOnlyChild() {
        return isOnlyChild;
    }

    /**
     * 设置是否独生子女,0否1是
     *
     * @param isOnlyChild 是否独生子女,0否1是
     */
    public void setIsOnlyChild(Integer isOnlyChild) {
        this.isOnlyChild = isOnlyChild;
    }

    /**
     * 获取分摊方式
     *
     * @return share_type - 分摊方式
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * 设置分摊方式
     *
     * @param shareType 分摊方式
     */
    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    /**
     * 获取本年度月扣除金额
     *
     * @return cur_month_amount_deducted - 本年度月扣除金额
     */
    public String getCurMonthAmountDeducted() {
        return curMonthAmountDeducted;
    }

    /**
     * 设置本年度月扣除金额
     *
     * @param curMonthAmountDeducted 本年度月扣除金额
     */
    public void setCurMonthAmountDeducted(String curMonthAmountDeducted) {
        this.curMonthAmountDeducted = curMonthAmountDeducted;
    }

    /**
     * 获取赡养类型(独自,分摊)
     *
     * @return support_type - 赡养类型(独自,分摊)
     */
    public String getSupportType() {
        return supportType;
    }

    /**
     * 设置赡养类型(独自,分摊)
     *
     * @param supportType 赡养类型(独自,分摊)
     */
    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    /**
     * 获取被赡养人姓名
     *
     * @return dependent_name - 被赡养人姓名
     */
    public String getDependentName() {
        return dependentName;
    }

    /**
     * 设置被赡养人姓名
     *
     * @param dependentName 被赡养人姓名
     */
    public void setDependentName(String dependentName) {
        this.dependentName = dependentName;
    }

    /**
     * 获取被赡养人身份证件类型
     *
     * @return dependent_cert_type - 被赡养人身份证件类型
     */
    public String getDependentCertType() {
        return dependentCertType;
    }

    /**
     * 设置被赡养人身份证件类型
     *
     * @param dependentCertType 被赡养人身份证件类型
     */
    public void setDependentCertType(String dependentCertType) {
        this.dependentCertType = dependentCertType;
    }

    /**
     * 获取被赡养人身份证件号码
     *
     * @return dependent_cert_code - 被赡养人身份证件号码
     */
    public String getDependentCertCode() {
        return dependentCertCode;
    }

    /**
     * 设置被赡养人身份证件号码
     *
     * @param dependentCertCode 被赡养人身份证件号码
     */
    public void setDependentCertCode(String dependentCertCode) {
        this.dependentCertCode = dependentCertCode;
    }

    /**
     * 获取被赡养人国籍(地区)
     *
     * @return dependent_nationality - 被赡养人国籍(地区)
     */
    public String getDependentNationality() {
        return dependentNationality;
    }

    /**
     * 设置被赡养人国籍(地区)
     *
     * @param dependentNationality 被赡养人国籍(地区)
     */
    public void setDependentNationality(String dependentNationality) {
        this.dependentNationality = dependentNationality;
    }

    /**
     * 获取与被赡养人关系
     *
     * @return dependent_relationship - 与被赡养人关系
     */
    public String getDependentRelationship() {
        return dependentRelationship;
    }

    /**
     * 设置与被赡养人关系
     *
     * @param dependentRelationship 与被赡养人关系
     */
    public void setDependentRelationship(String dependentRelationship) {
        this.dependentRelationship = dependentRelationship;
    }

    /**
     * 获取出生日期
     *
     * @return dependent_birth - 出生日期
     */
    public String getDependentBirth() {
        return dependentBirth;
    }

    /**
     * 设置出生日期
     *
     * @param dependentBirth 出生日期
     */
    public void setDependentBirth(String dependentBirth) {
        this.dependentBirth = dependentBirth;
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