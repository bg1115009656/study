package com.dianmi.esign.model;

import java.math.BigDecimal;
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
     * 当月收入额
     */
    @Column(name = "month_income")
    private BigDecimal monthIncome;

    /**
     * 累计收入额
     */
    @Column(name = "total_income")
    private BigDecimal totalIncome;

    /**
     * 当月三险一金减除额
     */
    @Column(name = "month_deduct_amount")
    private BigDecimal monthDeductAmount;

    /**
     * 累计三险一金减除额
     */
    @Column(name = "total_deduct_amount")
    private BigDecimal totalDeductAmount;

    /**
     * 当月专项扣除额
     */
    @Column(name = "special_month_deduct")
    private BigDecimal specialMonthDeduct;

    /**
     * 累计专项扣除额
     */
    @Column(name = "special_total_deduct")
    private BigDecimal specialTotalDeduct;

    /**
     * 子女教育起始月份
     */
    @Column(name = "child_start_month")
    private Integer childStartMonth;

    /**
     * 子女教育结束月份
     */
    @Column(name = "child_end_month")
    private Integer childEndMonth;

    /**
     * 当月子女教育
     */
    @Column(name = "month_child_edu")
    private BigDecimal monthChildEdu;

    /**
     * 累计子女教育
     */
    @Column(name = "total_child_edu")
    private BigDecimal totalChildEdu;

    /**
     * 赡养老人起始月份
     */
    @Column(name = "old_start_month")
    private Integer oldStartMonth;

    /**
     * 赡养老人结束月份
     */
    @Column(name = "old_end_month")
    private Integer oldEndMonth;

    /**
     * 当月赡养老人
     */
    @Column(name = "month_support_old")
    private BigDecimal monthSupportOld;

    /**
     * 累计赡养老人
     */
    @Column(name = "total_support_old")
    private BigDecimal totalSupportOld;

    /**
     * 住房贷款起始月份
     */
    @Column(name = "loans_start_month")
    private Integer loansStartMonth;

    /**
     * 住房贷款结束月份
     */
    @Column(name = "loans_end_month")
    private Integer loansEndMonth;

    /**
     * 当月住房贷款
     */
    @Column(name = "month_house_loans")
    private BigDecimal monthHouseLoans;

    /**
     * 累计住房贷款
     */
    @Column(name = "total_house_loans")
    private BigDecimal totalHouseLoans;

    /**
     * 住房租金起始月份
     */
    @Column(name = "rent_start_month")
    private Integer rentStartMonth;

    /**
     * 住房租金结束月份
     */
    @Column(name = "rent_end_month")
    private Integer rentEndMonth;

    /**
     * 当月住房租金
     */
    @Column(name = "month_house_rent")
    private BigDecimal monthHouseRent;

    /**
     * 累计住房租金
     */
    @Column(name = "total_house_rent")
    private BigDecimal totalHouseRent;

    /**
     * 继续教育起始月份
     */
    @Column(name = "continue_start_month")
    private Integer continueStartMonth;

    /**
     * 继续教育结束月份
     */
    @Column(name = "continue_end_month")
    private Integer continueEndMonth;

    /**
     * 当月继续教育
     */
    @Column(name = "month_continue_edu")
    private BigDecimal monthContinueEdu;

    /**
     * 累计继续教育
     */
    @Column(name = "total_continue_edu")
    private BigDecimal totalContinueEdu;

    /**
     * 继续教育起始月份
     */
    @Column(name = "eligibility_start_month")
    private Integer eligibilityStartMonth;

    /**
     * 继续教育结束月份
     */
    @Column(name = "eligibility_end_month")
    private Integer eligibilityEndMonth;

    /**
     * 当月继续教育
     */
    @Column(name = "month_eligibility_edu")
    private BigDecimal monthEligibilityEdu;

    /**
     * 累计继续教育
     */
    @Column(name = "total_eligibility_edu")
    private BigDecimal totalEligibilityEdu;

    /**
     * 当月其他扣除
     */
    @Column(name = "month_other_deduct")
    private BigDecimal monthOtherDeduct;

    /**
     * 累计其他扣除
     */
    @Column(name = "total_other_deduct")
    private BigDecimal totalOtherDeduct;

    /**
     * 当月个税
     */
    @Column(name = "month_tax")
    private BigDecimal monthTax;

    /**
     * 累计个税
     */
    @Column(name = "total_tax")
    private BigDecimal totalTax;

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
     * 获取当月收入额
     *
     * @return month_income - 当月收入额
     */
    public BigDecimal getMonthIncome() {
        return monthIncome;
    }

    /**
     * 设置当月收入额
     *
     * @param monthIncome 当月收入额
     */
    public void setMonthIncome(BigDecimal monthIncome) {
        this.monthIncome = monthIncome;
    }

    /**
     * 获取累计收入额
     *
     * @return total_income - 累计收入额
     */
    public BigDecimal getTotalIncome() {
        return totalIncome;
    }

    /**
     * 设置累计收入额
     *
     * @param totalIncome 累计收入额
     */
    public void setTotalIncome(BigDecimal totalIncome) {
        this.totalIncome = totalIncome;
    }

    /**
     * 获取当月三险一金减除额
     *
     * @return month_deduct_amount - 当月三险一金减除额
     */
    public BigDecimal getMonthDeductAmount() {
        return monthDeductAmount;
    }

    /**
     * 设置当月三险一金减除额
     *
     * @param monthDeductAmount 当月三险一金减除额
     */
    public void setMonthDeductAmount(BigDecimal monthDeductAmount) {
        this.monthDeductAmount = monthDeductAmount;
    }

    /**
     * 获取累计三险一金减除额
     *
     * @return total_deduct_amount - 累计三险一金减除额
     */
    public BigDecimal getTotalDeductAmount() {
        return totalDeductAmount;
    }

    /**
     * 设置累计三险一金减除额
     *
     * @param totalDeductAmount 累计三险一金减除额
     */
    public void setTotalDeductAmount(BigDecimal totalDeductAmount) {
        this.totalDeductAmount = totalDeductAmount;
    }

    /**
     * 获取当月专项扣除额
     *
     * @return special_month_deduct - 当月专项扣除额
     */
    public BigDecimal getSpecialMonthDeduct() {
        return specialMonthDeduct;
    }

    /**
     * 设置当月专项扣除额
     *
     * @param specialMonthDeduct 当月专项扣除额
     */
    public void setSpecialMonthDeduct(BigDecimal specialMonthDeduct) {
        this.specialMonthDeduct = specialMonthDeduct;
    }

    /**
     * 获取累计专项扣除额
     *
     * @return special_total_deduct - 累计专项扣除额
     */
    public BigDecimal getSpecialTotalDeduct() {
        return specialTotalDeduct;
    }

    /**
     * 设置累计专项扣除额
     *
     * @param specialTotalDeduct 累计专项扣除额
     */
    public void setSpecialTotalDeduct(BigDecimal specialTotalDeduct) {
        this.specialTotalDeduct = specialTotalDeduct;
    }

    /**
     * 获取子女教育起始月份
     *
     * @return child_start_month - 子女教育起始月份
     */
    public Integer getChildStartMonth() {
        return childStartMonth;
    }

    /**
     * 设置子女教育起始月份
     *
     * @param childStartMonth 子女教育起始月份
     */
    public void setChildStartMonth(Integer childStartMonth) {
        this.childStartMonth = childStartMonth;
    }

    /**
     * 获取子女教育结束月份
     *
     * @return child_end_month - 子女教育结束月份
     */
    public Integer getChildEndMonth() {
        return childEndMonth;
    }

    /**
     * 设置子女教育结束月份
     *
     * @param childEndMonth 子女教育结束月份
     */
    public void setChildEndMonth(Integer childEndMonth) {
        this.childEndMonth = childEndMonth;
    }

    /**
     * 获取当月子女教育
     *
     * @return month_child_edu - 当月子女教育
     */
    public BigDecimal getMonthChildEdu() {
        return monthChildEdu;
    }

    /**
     * 设置当月子女教育
     *
     * @param monthChildEdu 当月子女教育
     */
    public void setMonthChildEdu(BigDecimal monthChildEdu) {
        this.monthChildEdu = monthChildEdu;
    }

    /**
     * 获取累计子女教育
     *
     * @return total_child_edu - 累计子女教育
     */
    public BigDecimal getTotalChildEdu() {
        return totalChildEdu;
    }

    /**
     * 设置累计子女教育
     *
     * @param totalChildEdu 累计子女教育
     */
    public void setTotalChildEdu(BigDecimal totalChildEdu) {
        this.totalChildEdu = totalChildEdu;
    }

    /**
     * 获取赡养老人起始月份
     *
     * @return old_start_month - 赡养老人起始月份
     */
    public Integer getOldStartMonth() {
        return oldStartMonth;
    }

    /**
     * 设置赡养老人起始月份
     *
     * @param oldStartMonth 赡养老人起始月份
     */
    public void setOldStartMonth(Integer oldStartMonth) {
        this.oldStartMonth = oldStartMonth;
    }

    /**
     * 获取赡养老人结束月份
     *
     * @return old_end_month - 赡养老人结束月份
     */
    public Integer getOldEndMonth() {
        return oldEndMonth;
    }

    /**
     * 设置赡养老人结束月份
     *
     * @param oldEndMonth 赡养老人结束月份
     */
    public void setOldEndMonth(Integer oldEndMonth) {
        this.oldEndMonth = oldEndMonth;
    }

    /**
     * 获取当月赡养老人
     *
     * @return month_support_old - 当月赡养老人
     */
    public BigDecimal getMonthSupportOld() {
        return monthSupportOld;
    }

    /**
     * 设置当月赡养老人
     *
     * @param monthSupportOld 当月赡养老人
     */
    public void setMonthSupportOld(BigDecimal monthSupportOld) {
        this.monthSupportOld = monthSupportOld;
    }

    /**
     * 获取累计赡养老人
     *
     * @return total_support_old - 累计赡养老人
     */
    public BigDecimal getTotalSupportOld() {
        return totalSupportOld;
    }

    /**
     * 设置累计赡养老人
     *
     * @param totalSupportOld 累计赡养老人
     */
    public void setTotalSupportOld(BigDecimal totalSupportOld) {
        this.totalSupportOld = totalSupportOld;
    }

    /**
     * 获取住房贷款起始月份
     *
     * @return loans_start_month - 住房贷款起始月份
     */
    public Integer getLoansStartMonth() {
        return loansStartMonth;
    }

    /**
     * 设置住房贷款起始月份
     *
     * @param loansStartMonth 住房贷款起始月份
     */
    public void setLoansStartMonth(Integer loansStartMonth) {
        this.loansStartMonth = loansStartMonth;
    }

    /**
     * 获取住房贷款结束月份
     *
     * @return loans_end_month - 住房贷款结束月份
     */
    public Integer getLoansEndMonth() {
        return loansEndMonth;
    }

    /**
     * 设置住房贷款结束月份
     *
     * @param loansEndMonth 住房贷款结束月份
     */
    public void setLoansEndMonth(Integer loansEndMonth) {
        this.loansEndMonth = loansEndMonth;
    }

    /**
     * 获取当月住房贷款
     *
     * @return month_house_loans - 当月住房贷款
     */
    public BigDecimal getMonthHouseLoans() {
        return monthHouseLoans;
    }

    /**
     * 设置当月住房贷款
     *
     * @param monthHouseLoans 当月住房贷款
     */
    public void setMonthHouseLoans(BigDecimal monthHouseLoans) {
        this.monthHouseLoans = monthHouseLoans;
    }

    /**
     * 获取累计住房贷款
     *
     * @return total_house_loans - 累计住房贷款
     */
    public BigDecimal getTotalHouseLoans() {
        return totalHouseLoans;
    }

    /**
     * 设置累计住房贷款
     *
     * @param totalHouseLoans 累计住房贷款
     */
    public void setTotalHouseLoans(BigDecimal totalHouseLoans) {
        this.totalHouseLoans = totalHouseLoans;
    }

    /**
     * 获取住房租金起始月份
     *
     * @return rent_start_month - 住房租金起始月份
     */
    public Integer getRentStartMonth() {
        return rentStartMonth;
    }

    /**
     * 设置住房租金起始月份
     *
     * @param rentStartMonth 住房租金起始月份
     */
    public void setRentStartMonth(Integer rentStartMonth) {
        this.rentStartMonth = rentStartMonth;
    }

    /**
     * 获取住房租金结束月份
     *
     * @return rent_end_month - 住房租金结束月份
     */
    public Integer getRentEndMonth() {
        return rentEndMonth;
    }

    /**
     * 设置住房租金结束月份
     *
     * @param rentEndMonth 住房租金结束月份
     */
    public void setRentEndMonth(Integer rentEndMonth) {
        this.rentEndMonth = rentEndMonth;
    }

    /**
     * 获取当月住房租金
     *
     * @return month_house_rent - 当月住房租金
     */
    public BigDecimal getMonthHouseRent() {
        return monthHouseRent;
    }

    /**
     * 设置当月住房租金
     *
     * @param monthHouseRent 当月住房租金
     */
    public void setMonthHouseRent(BigDecimal monthHouseRent) {
        this.monthHouseRent = monthHouseRent;
    }

    /**
     * 获取累计住房租金
     *
     * @return total_house_rent - 累计住房租金
     */
    public BigDecimal getTotalHouseRent() {
        return totalHouseRent;
    }

    /**
     * 设置累计住房租金
     *
     * @param totalHouseRent 累计住房租金
     */
    public void setTotalHouseRent(BigDecimal totalHouseRent) {
        this.totalHouseRent = totalHouseRent;
    }

    /**
     * 获取继续教育起始月份
     *
     * @return continue_start_month - 继续教育起始月份
     */
    public Integer getContinueStartMonth() {
        return continueStartMonth;
    }

    /**
     * 设置继续教育起始月份
     *
     * @param continueStartMonth 继续教育起始月份
     */
    public void setContinueStartMonth(Integer continueStartMonth) {
        this.continueStartMonth = continueStartMonth;
    }

    /**
     * 获取继续教育结束月份
     *
     * @return continue_end_month - 继续教育结束月份
     */
    public Integer getContinueEndMonth() {
        return continueEndMonth;
    }

    /**
     * 设置继续教育结束月份
     *
     * @param continueEndMonth 继续教育结束月份
     */
    public void setContinueEndMonth(Integer continueEndMonth) {
        this.continueEndMonth = continueEndMonth;
    }

    /**
     * 获取当月继续教育
     *
     * @return month_continue_edu - 当月继续教育
     */
    public BigDecimal getMonthContinueEdu() {
        return monthContinueEdu;
    }

    /**
     * 设置当月继续教育
     *
     * @param monthContinueEdu 当月继续教育
     */
    public void setMonthContinueEdu(BigDecimal monthContinueEdu) {
        this.monthContinueEdu = monthContinueEdu;
    }

    /**
     * 获取累计继续教育
     *
     * @return total_continue_edu - 累计继续教育
     */
    public BigDecimal getTotalContinueEdu() {
        return totalContinueEdu;
    }

    /**
     * 设置累计继续教育
     *
     * @param totalContinueEdu 累计继续教育
     */
    public void setTotalContinueEdu(BigDecimal totalContinueEdu) {
        this.totalContinueEdu = totalContinueEdu;
    }

    /**
     * 获取继续教育起始月份
     *
     * @return eligibility_start_month - 继续教育起始月份
     */
    public Integer getEligibilityStartMonth() {
        return eligibilityStartMonth;
    }

    /**
     * 设置继续教育起始月份
     *
     * @param eligibilityStartMonth 继续教育起始月份
     */
    public void setEligibilityStartMonth(Integer eligibilityStartMonth) {
        this.eligibilityStartMonth = eligibilityStartMonth;
    }

    /**
     * 获取继续教育结束月份
     *
     * @return eligibility_end_month - 继续教育结束月份
     */
    public Integer getEligibilityEndMonth() {
        return eligibilityEndMonth;
    }

    /**
     * 设置继续教育结束月份
     *
     * @param eligibilityEndMonth 继续教育结束月份
     */
    public void setEligibilityEndMonth(Integer eligibilityEndMonth) {
        this.eligibilityEndMonth = eligibilityEndMonth;
    }

    /**
     * 获取当月继续教育
     *
     * @return month_eligibility_edu - 当月继续教育
     */
    public BigDecimal getMonthEligibilityEdu() {
        return monthEligibilityEdu;
    }

    /**
     * 设置当月继续教育
     *
     * @param monthEligibilityEdu 当月继续教育
     */
    public void setMonthEligibilityEdu(BigDecimal monthEligibilityEdu) {
        this.monthEligibilityEdu = monthEligibilityEdu;
    }

    /**
     * 获取累计继续教育
     *
     * @return total_eligibility_edu - 累计继续教育
     */
    public BigDecimal getTotalEligibilityEdu() {
        return totalEligibilityEdu;
    }

    /**
     * 设置累计继续教育
     *
     * @param totalEligibilityEdu 累计继续教育
     */
    public void setTotalEligibilityEdu(BigDecimal totalEligibilityEdu) {
        this.totalEligibilityEdu = totalEligibilityEdu;
    }

    /**
     * 获取当月其他扣除
     *
     * @return month_other_deduct - 当月其他扣除
     */
    public BigDecimal getMonthOtherDeduct() {
        return monthOtherDeduct;
    }

    /**
     * 设置当月其他扣除
     *
     * @param monthOtherDeduct 当月其他扣除
     */
    public void setMonthOtherDeduct(BigDecimal monthOtherDeduct) {
        this.monthOtherDeduct = monthOtherDeduct;
    }

    /**
     * 获取累计其他扣除
     *
     * @return total_other_deduct - 累计其他扣除
     */
    public BigDecimal getTotalOtherDeduct() {
        return totalOtherDeduct;
    }

    /**
     * 设置累计其他扣除
     *
     * @param totalOtherDeduct 累计其他扣除
     */
    public void setTotalOtherDeduct(BigDecimal totalOtherDeduct) {
        this.totalOtherDeduct = totalOtherDeduct;
    }

    /**
     * 获取当月个税
     *
     * @return month_tax - 当月个税
     */
    public BigDecimal getMonthTax() {
        return monthTax;
    }

    /**
     * 设置当月个税
     *
     * @param monthTax 当月个税
     */
    public void setMonthTax(BigDecimal monthTax) {
        this.monthTax = monthTax;
    }

    /**
     * 获取累计个税
     *
     * @return total_tax - 累计个税
     */
    public BigDecimal getTotalTax() {
        return totalTax;
    }

    /**
     * 设置累计个税
     *
     * @param totalTax 累计个税
     */
    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
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