package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "tax_deduct_protocol")
public class TaxDeductProtocol {
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
     * 扣除年度
     */
    @Column(name = "deduct_year")
    private String deductYear;

    /**
     * 纳税人姓名
     */
    @Column(name = "taxpayer_name")
    private String taxpayerName;

    /**
     * 纳税人身份证件类型
     */
    @Column(name = "taxpayer_cert_type")
    private String taxpayerCertType;

    /**
     * 纳税人身份证件号码
     */
    @Column(name = "taxpayer_cert_code")
    private String taxpayerCertCode;

    /**
     * 纳税人识别号
     */
    @Column(name = "taxpayer_number")
    private String taxpayerNumber;

    /**
     * 联系地址
     */
    @Column(name = "taxpayer_address")
    private String taxpayerAddress;

    /**
     * 电子邮箱
     */
    @Column(name = "taxpayer_email")
    private String taxpayerEmail;

    /**
     * 扣缴义务人名称(支付工资薪金的单位)
     */
    @Column(name = "wh_agent_name")
    private String whAgentName;

    /**
     * 扣缴义务人纳税识别号(统一社会信用代码)
     */
    @Column(name = "wh_agent_number")
    private String whAgentNumber;

    /**
     * 配偶情况
     */
    @Column(name = "spouse_status")
    private String spouseStatus;

    /**
     * 配偶姓名
     */
    @Column(name = "spouse_name")
    private String spouseName;

    /**
     * 配偶身份证件类型
     */
    @Column(name = "spouse_cert_type")
    private String spouseCertType;

    /**
     * 配偶身份证件号码
     */
    @Column(name = "spouse_cert_code")
    private String spouseCertCode;

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
     * 获取扣除年度
     *
     * @return deduct_year - 扣除年度
     */
    public String getDeductYear() {
        return deductYear;
    }

    /**
     * 设置扣除年度
     *
     * @param deductYear 扣除年度
     */
    public void setDeductYear(String deductYear) {
        this.deductYear = deductYear;
    }

    /**
     * 获取纳税人姓名
     *
     * @return taxpayer_name - 纳税人姓名
     */
    public String getTaxpayerName() {
        return taxpayerName;
    }

    /**
     * 设置纳税人姓名
     *
     * @param taxpayerName 纳税人姓名
     */
    public void setTaxpayerName(String taxpayerName) {
        this.taxpayerName = taxpayerName;
    }

    /**
     * 获取纳税人身份证件类型
     *
     * @return taxpayer_cert_type - 纳税人身份证件类型
     */
    public String getTaxpayerCertType() {
        return taxpayerCertType;
    }

    /**
     * 设置纳税人身份证件类型
     *
     * @param taxpayerCertType 纳税人身份证件类型
     */
    public void setTaxpayerCertType(String taxpayerCertType) {
        this.taxpayerCertType = taxpayerCertType;
    }

    /**
     * 获取纳税人身份证件号码
     *
     * @return taxpayer_cert_code - 纳税人身份证件号码
     */
    public String getTaxpayerCertCode() {
        return taxpayerCertCode;
    }

    /**
     * 设置纳税人身份证件号码
     *
     * @param taxpayerCertCode 纳税人身份证件号码
     */
    public void setTaxpayerCertCode(String taxpayerCertCode) {
        this.taxpayerCertCode = taxpayerCertCode;
    }

    /**
     * 获取纳税人识别号
     *
     * @return taxpayer_number - 纳税人识别号
     */
    public String getTaxpayerNumber() {
        return taxpayerNumber;
    }

    /**
     * 设置纳税人识别号
     *
     * @param taxpayerNumber 纳税人识别号
     */
    public void setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    /**
     * 获取联系地址
     *
     * @return taxpayer_address - 联系地址
     */
    public String getTaxpayerAddress() {
        return taxpayerAddress;
    }

    /**
     * 设置联系地址
     *
     * @param taxpayerAddress 联系地址
     */
    public void setTaxpayerAddress(String taxpayerAddress) {
        this.taxpayerAddress = taxpayerAddress;
    }

    /**
     * 获取电子邮箱
     *
     * @return taxpayer_email - 电子邮箱
     */
    public String getTaxpayerEmail() {
        return taxpayerEmail;
    }

    /**
     * 设置电子邮箱
     *
     * @param taxpayerEmail 电子邮箱
     */
    public void setTaxpayerEmail(String taxpayerEmail) {
        this.taxpayerEmail = taxpayerEmail;
    }

    /**
     * 获取扣缴义务人名称(支付工资薪金的单位)
     *
     * @return wh_agent_name - 扣缴义务人名称(支付工资薪金的单位)
     */
    public String getWhAgentName() {
        return whAgentName;
    }

    /**
     * 设置扣缴义务人名称(支付工资薪金的单位)
     *
     * @param whAgentName 扣缴义务人名称(支付工资薪金的单位)
     */
    public void setWhAgentName(String whAgentName) {
        this.whAgentName = whAgentName;
    }

    /**
     * 获取扣缴义务人纳税识别号(统一社会信用代码)
     *
     * @return wh_agent_number - 扣缴义务人纳税识别号(统一社会信用代码)
     */
    public String getWhAgentNumber() {
        return whAgentNumber;
    }

    /**
     * 设置扣缴义务人纳税识别号(统一社会信用代码)
     *
     * @param whAgentNumber 扣缴义务人纳税识别号(统一社会信用代码)
     */
    public void setWhAgentNumber(String whAgentNumber) {
        this.whAgentNumber = whAgentNumber;
    }

    /**
     * 获取配偶情况
     *
     * @return spouse_status - 配偶情况
     */
    public String getSpouseStatus() {
        return spouseStatus;
    }

    /**
     * 设置配偶情况
     *
     * @param spouseStatus 配偶情况
     */
    public void setSpouseStatus(String spouseStatus) {
        this.spouseStatus = spouseStatus;
    }

    /**
     * 获取配偶姓名
     *
     * @return spouse_name - 配偶姓名
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * 设置配偶姓名
     *
     * @param spouseName 配偶姓名
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * 获取配偶身份证件类型
     *
     * @return spouse_cert_type - 配偶身份证件类型
     */
    public String getSpouseCertType() {
        return spouseCertType;
    }

    /**
     * 设置配偶身份证件类型
     *
     * @param spouseCertType 配偶身份证件类型
     */
    public void setSpouseCertType(String spouseCertType) {
        this.spouseCertType = spouseCertType;
    }

    /**
     * 获取配偶身份证件号码
     *
     * @return spouse_cert_code - 配偶身份证件号码
     */
    public String getSpouseCertCode() {
        return spouseCertCode;
    }

    /**
     * 设置配偶身份证件号码
     *
     * @param spouseCertCode 配偶身份证件号码
     */
    public void setSpouseCertCode(String spouseCertCode) {
        this.spouseCertCode = spouseCertCode;
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