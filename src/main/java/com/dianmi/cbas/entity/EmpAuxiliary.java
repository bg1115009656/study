package com.dianmi.cbas.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工附属信息表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp_auxiliary")
public class EmpAuxiliary extends Model<EmpAuxiliary> {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 员工编号
     */
    @TableField("emp_id")
    private Long empId;
    /**
     * 存档编号
     */
    @TableField("archive_no")
    private Long archiveNo;
    /**
     * 档案柜号
     */
    @TableField("cabinet_no")
    private Long cabinetNo;
    /**
     * 档案类型
     */
    @TableField("file_type")
    private String fileType;
    /**
     * 存档城市
     */
    @TableField("archive_city")
    private String archiveCity;
    /**
     * 存档开始时间
     */
    @TableField("archive_start")
    private String archiveStart;
    /**
     * 存档结束时间
     */
    @TableField("archive_end")
    private String archiveEnd;
    /**
     * 存档单位联系人
     */
    @TableField("archive_contact")
    private String archiveContact;
    /**
     * 存档单位联系电话
     */
    @TableField("archive_mobile")
    private String archiveMobile;
    /**
     * 存档地址
     */
    @TableField("archive_address")
    private String archiveAddress;
    /**
     * 存档单位ID
     */
    @TableField("archive_org_id")
    private String archiveOrgId;
    /**
     * 存档单位
     */
    @TableField("archive_orgname")
    private String archiveOrgname;
    /**
     * 存档机构
     */
    @TableField("org_name")
    private String orgName;
    /**
     * 是否缴纳社保 0是1否
     */
    @TableField("si_whether_payment")
    private Integer siWhetherPayment;
    /**
     * 社保预计缴纳月份
     */
    @TableField("si_anticipated_month")
    private String siAnticipatedMonth;
    /**
     * 社保服务单位
     */
    @TableField("si_company_id")
    private Long siCompanyId;
    /**
     * 社保服务单位
     */
    @TableField("si_company")
    private String siCompany;
    /**
     * 社保福利套编号
     */
    @TableField("si_welfareset_id")
    private Long siWelfaresetId;
    /**
     * 社保福利套
     */
    @TableField("si_welfareset_name")
    private String siWelfaresetName;
    /**
     * 社保缴纳城市编号
     */
    @TableField("si_city_id")
    private Long siCityId;
    /**
     * 社保缴纳城市
     */
    @TableField("si_city_name")
    private String siCityName;
    /**
     * 社保起缴年月
     */
    @TableField("si_start_month")
    private String siStartMonth;
    /**
     * 个人社保卡号
     */
    @TableField("si_per_account")
    private String siPerAccount;
    /**
     * 个人医保卡号
     */
    @TableField("per_medicare_card")
    private String perMedicareCard;
    /**
     * 是否缴纳公积金
     */
    @TableField("hpf_whether_payment")
    private Integer hpfWhetherPayment;
    /**
     * 公积金预计缴纳月份
     */
    @TableField("hpf_anticipated_month")
    private String hpfAnticipatedMonth;
    /**
     * 公积金缴纳城市
     */
    @TableField("hpf_city_id")
    private Long hpfCityId;
    /**
     * 公积金缴纳城市
     */
    @TableField("hpf_city_name")
    private String hpfCityName;
    /**
     * 公积金服务单位
     */
    @TableField("hpf_company_id")
    private Long hpfCompanyId;
    /**
     * 公积金服务单位
     */
    @TableField("hpf_company")
    private String hpfCompany;
    /**
     * 公积金福利套ID
     */
    @TableField("hpf_welfareset_id")
    private Long hpfWelfaresetId;
    /**
     * 公积金福利套
     */
    @TableField("hpf_welfareset_name")
    private String hpfWelfaresetName;
    /**
     * 公积金起缴年月
     */
    @TableField("hpf_start_month")
    private String hpfStartMonth;
    /**
     * 个人公积金卡号
     */
    @TableField("hpf_per_account")
    private String hpfPerAccount;
    /**
     * 工资服务单位
     */
    @TableField("salary_company_id")
    private Long salaryCompanyId;
    /**
     * 工资服务单位
     */
    @TableField("salary_company")
    private String salaryCompany;
    /**
     * 商保城市ID
     */
    @TableField("busigness_city_id")
    private Long busignessCityId;
    /**
     * 商保城市名称
     */
    @TableField("busigness_city_name")
    private String busignessCityName;
    /**
     * 商保方案序号
     */
    @TableField("program_id")
    private Long programId;
    /**
     * 商保方案名称
     */
    @TableField("program_name")
    private String programName;
    /**
     * 商保服务单位
     */
    @TableField("business_company_id")
    private Long businessCompanyId;
    /**
     * 商保服务单位
     */
    @TableField("business_company")
    private String businessCompany;
    /**
     * 起缴年月
     */
    @TableField("business_start_month")
    private String businessStartMonth;
    /**
     * 打包价
     */
    @TableField("package_proce")
    private Double packageProce;
    /**
     * 健康状况
     */
    @TableField("health_status")
    private String healthStatus;
    /**
     * 职业名称
     */
    @TableField("occupational_name")
    private String occupationalName;
    /**
     * 受益人
     */
    private String beneficiary;
    /**
     * 与受益人关系
     */
    @TableField("beneficiary_relationship")
    private String beneficiaryRelationship;
    /**
     * 数据状态（0:有效,1:失效）
     */
    private Integer status;
    @TableField("update_user")
    private String updateUser;
    @TableField("update_time")
    private Date updateTime;
    @TableField("create_user")
    private String createUser;
    @TableField("create_time")
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getArchiveNo() {
        return archiveNo;
    }

    public void setArchiveNo(Long archiveNo) {
        this.archiveNo = archiveNo;
    }

    public Long getCabinetNo() {
        return cabinetNo;
    }

    public void setCabinetNo(Long cabinetNo) {
        this.cabinetNo = cabinetNo;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getArchiveCity() {
        return archiveCity;
    }

    public void setArchiveCity(String archiveCity) {
        this.archiveCity = archiveCity;
    }

    public String getArchiveStart() {
        return archiveStart;
    }

    public void setArchiveStart(String archiveStart) {
        this.archiveStart = archiveStart;
    }

    public String getArchiveEnd() {
        return archiveEnd;
    }

    public void setArchiveEnd(String archiveEnd) {
        this.archiveEnd = archiveEnd;
    }

    public String getArchiveContact() {
        return archiveContact;
    }

    public void setArchiveContact(String archiveContact) {
        this.archiveContact = archiveContact;
    }

    public String getArchiveMobile() {
        return archiveMobile;
    }

    public void setArchiveMobile(String archiveMobile) {
        this.archiveMobile = archiveMobile;
    }

    public String getArchiveAddress() {
        return archiveAddress;
    }

    public void setArchiveAddress(String archiveAddress) {
        this.archiveAddress = archiveAddress;
    }

    public String getArchiveOrgId() {
        return archiveOrgId;
    }

    public void setArchiveOrgId(String archiveOrgId) {
        this.archiveOrgId = archiveOrgId;
    }

    public String getArchiveOrgname() {
        return archiveOrgname;
    }

    public void setArchiveOrgname(String archiveOrgname) {
        this.archiveOrgname = archiveOrgname;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Integer getSiWhetherPayment() {
        return siWhetherPayment;
    }

    public void setSiWhetherPayment(Integer siWhetherPayment) {
        this.siWhetherPayment = siWhetherPayment;
    }

    public String getSiAnticipatedMonth() {
        return siAnticipatedMonth;
    }

    public void setSiAnticipatedMonth(String siAnticipatedMonth) {
        this.siAnticipatedMonth = siAnticipatedMonth;
    }

    public Long getSiCompanyId() {
        return siCompanyId;
    }

    public void setSiCompanyId(Long siCompanyId) {
        this.siCompanyId = siCompanyId;
    }

    public String getSiCompany() {
        return siCompany;
    }

    public void setSiCompany(String siCompany) {
        this.siCompany = siCompany;
    }

    public Long getSiWelfaresetId() {
        return siWelfaresetId;
    }

    public void setSiWelfaresetId(Long siWelfaresetId) {
        this.siWelfaresetId = siWelfaresetId;
    }

    public String getSiWelfaresetName() {
        return siWelfaresetName;
    }

    public void setSiWelfaresetName(String siWelfaresetName) {
        this.siWelfaresetName = siWelfaresetName;
    }

    public Long getSiCityId() {
        return siCityId;
    }

    public void setSiCityId(Long siCityId) {
        this.siCityId = siCityId;
    }

    public String getSiCityName() {
        return siCityName;
    }

    public void setSiCityName(String siCityName) {
        this.siCityName = siCityName;
    }

    public String getSiStartMonth() {
        return siStartMonth;
    }

    public void setSiStartMonth(String siStartMonth) {
        this.siStartMonth = siStartMonth;
    }

    public String getSiPerAccount() {
        return siPerAccount;
    }

    public void setSiPerAccount(String siPerAccount) {
        this.siPerAccount = siPerAccount;
    }

    public String getPerMedicareCard() {
        return perMedicareCard;
    }

    public void setPerMedicareCard(String perMedicareCard) {
        this.perMedicareCard = perMedicareCard;
    }

    public Integer getHpfWhetherPayment() {
        return hpfWhetherPayment;
    }

    public void setHpfWhetherPayment(Integer hpfWhetherPayment) {
        this.hpfWhetherPayment = hpfWhetherPayment;
    }

    public String getHpfAnticipatedMonth() {
        return hpfAnticipatedMonth;
    }

    public void setHpfAnticipatedMonth(String hpfAnticipatedMonth) {
        this.hpfAnticipatedMonth = hpfAnticipatedMonth;
    }

    public Long getHpfCityId() {
        return hpfCityId;
    }

    public void setHpfCityId(Long hpfCityId) {
        this.hpfCityId = hpfCityId;
    }

    public String getHpfCityName() {
        return hpfCityName;
    }

    public void setHpfCityName(String hpfCityName) {
        this.hpfCityName = hpfCityName;
    }

    public Long getHpfCompanyId() {
        return hpfCompanyId;
    }

    public void setHpfCompanyId(Long hpfCompanyId) {
        this.hpfCompanyId = hpfCompanyId;
    }

    public String getHpfCompany() {
        return hpfCompany;
    }

    public void setHpfCompany(String hpfCompany) {
        this.hpfCompany = hpfCompany;
    }

    public Long getHpfWelfaresetId() {
        return hpfWelfaresetId;
    }

    public void setHpfWelfaresetId(Long hpfWelfaresetId) {
        this.hpfWelfaresetId = hpfWelfaresetId;
    }

    public String getHpfWelfaresetName() {
        return hpfWelfaresetName;
    }

    public void setHpfWelfaresetName(String hpfWelfaresetName) {
        this.hpfWelfaresetName = hpfWelfaresetName;
    }

    public String getHpfStartMonth() {
        return hpfStartMonth;
    }

    public void setHpfStartMonth(String hpfStartMonth) {
        this.hpfStartMonth = hpfStartMonth;
    }

    public String getHpfPerAccount() {
        return hpfPerAccount;
    }

    public void setHpfPerAccount(String hpfPerAccount) {
        this.hpfPerAccount = hpfPerAccount;
    }

    public Long getSalaryCompanyId() {
        return salaryCompanyId;
    }

    public void setSalaryCompanyId(Long salaryCompanyId) {
        this.salaryCompanyId = salaryCompanyId;
    }

    public String getSalaryCompany() {
        return salaryCompany;
    }

    public void setSalaryCompany(String salaryCompany) {
        this.salaryCompany = salaryCompany;
    }

    public Long getBusignessCityId() {
        return busignessCityId;
    }

    public void setBusignessCityId(Long busignessCityId) {
        this.busignessCityId = busignessCityId;
    }

    public String getBusignessCityName() {
        return busignessCityName;
    }

    public void setBusignessCityName(String busignessCityName) {
        this.busignessCityName = busignessCityName;
    }

    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Long getBusinessCompanyId() {
        return businessCompanyId;
    }

    public void setBusinessCompanyId(Long businessCompanyId) {
        this.businessCompanyId = businessCompanyId;
    }

    public String getBusinessCompany() {
        return businessCompany;
    }

    public void setBusinessCompany(String businessCompany) {
        this.businessCompany = businessCompany;
    }

    public String getBusinessStartMonth() {
        return businessStartMonth;
    }

    public void setBusinessStartMonth(String businessStartMonth) {
        this.businessStartMonth = businessStartMonth;
    }

    public Double getPackageProce() {
        return packageProce;
    }

    public void setPackageProce(Double packageProce) {
        this.packageProce = packageProce;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getOccupationalName() {
        return occupationalName;
    }

    public void setOccupationalName(String occupationalName) {
        this.occupationalName = occupationalName;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getBeneficiaryRelationship() {
        return beneficiaryRelationship;
    }

    public void setBeneficiaryRelationship(String beneficiaryRelationship) {
        this.beneficiaryRelationship = beneficiaryRelationship;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmpAuxiliary{" +
        ", id=" + id +
        ", empId=" + empId +
        ", archiveNo=" + archiveNo +
        ", cabinetNo=" + cabinetNo +
        ", fileType=" + fileType +
        ", archiveCity=" + archiveCity +
        ", archiveStart=" + archiveStart +
        ", archiveEnd=" + archiveEnd +
        ", archiveContact=" + archiveContact +
        ", archiveMobile=" + archiveMobile +
        ", archiveAddress=" + archiveAddress +
        ", archiveOrgId=" + archiveOrgId +
        ", archiveOrgname=" + archiveOrgname +
        ", orgName=" + orgName +
        ", siWhetherPayment=" + siWhetherPayment +
        ", siAnticipatedMonth=" + siAnticipatedMonth +
        ", siCompanyId=" + siCompanyId +
        ", siCompany=" + siCompany +
        ", siWelfaresetId=" + siWelfaresetId +
        ", siWelfaresetName=" + siWelfaresetName +
        ", siCityId=" + siCityId +
        ", siCityName=" + siCityName +
        ", siStartMonth=" + siStartMonth +
        ", siPerAccount=" + siPerAccount +
        ", perMedicareCard=" + perMedicareCard +
        ", hpfWhetherPayment=" + hpfWhetherPayment +
        ", hpfAnticipatedMonth=" + hpfAnticipatedMonth +
        ", hpfCityId=" + hpfCityId +
        ", hpfCityName=" + hpfCityName +
        ", hpfCompanyId=" + hpfCompanyId +
        ", hpfCompany=" + hpfCompany +
        ", hpfWelfaresetId=" + hpfWelfaresetId +
        ", hpfWelfaresetName=" + hpfWelfaresetName +
        ", hpfStartMonth=" + hpfStartMonth +
        ", hpfPerAccount=" + hpfPerAccount +
        ", salaryCompanyId=" + salaryCompanyId +
        ", salaryCompany=" + salaryCompany +
        ", busignessCityId=" + busignessCityId +
        ", busignessCityName=" + busignessCityName +
        ", programId=" + programId +
        ", programName=" + programName +
        ", businessCompanyId=" + businessCompanyId +
        ", businessCompany=" + businessCompany +
        ", businessStartMonth=" + businessStartMonth +
        ", packageProce=" + packageProce +
        ", healthStatus=" + healthStatus +
        ", occupationalName=" + occupationalName +
        ", beneficiary=" + beneficiary +
        ", beneficiaryRelationship=" + beneficiaryRelationship +
        ", status=" + status +
        ", updateUser=" + updateUser +
        ", updateTime=" + updateTime +
        ", createUser=" + createUser +
        ", createTime=" + createTime +
        "}";
    }
}
