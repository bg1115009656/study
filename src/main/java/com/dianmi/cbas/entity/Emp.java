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
 * 员工表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp")
public class Emp extends Model<Emp> {

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 客户编号
     */
    @TableField("customer_id")
    private Long customerId;
    /**
     * 成本中心
     */
    @TableField("customer_name")
    private String customerName;
    /**
     * 服务城市名称
     */
    @TableField("service_city_name")
    private String serviceCityName;
    /**
     * 成本中心
     */
    @TableField("cost_center")
    private String costCenter;
    /**
     * 员工姓名
     */
    @TableField("emp_name")
    private String empName;
    /**
     * 证件类型
     */
    @TableField("card_type")
    private String cardType;
    /**
     * 证件号码
     */
    @TableField("card_no")
    private String cardNo;
    /**
     * 出生日期
     */
    private String birthday;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 户籍性质
     */
    @TableField("rst_property")
    private String rstProperty;
    /**
     * 在职状态
     */
    @TableField("duty_status")
    private String dutyStatus;
    /**
     * 部门
     */
    @TableField("department_id")
    private Long departmentId;
    /**
     * 员工类型
     */
    @TableField("emp_type")
    private String empType;
    /**
     * 岗位
     */
    @TableField("post_code")
    private Long postCode;
    /**
     * 岗位
     */
    private String post;
    /**
     * 曾用名
     */
    @TableField("used_name")
    private String usedName;
    /**
     * 国籍
     */
    private String nationality;
    /**
     * 籍贯
     */
    @TableField("native_place")
    private String nativePlace;
    /**
     * 民族
     */
    private String nation;
    /**
     * 固定电话
     */
    @TableField("contact_mobile")
    private String contactMobile;
    /**
     * 手机
     */
    @TableField("contact_tel")
    private String contactTel;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 户籍城市
     */
    @TableField("rst_city")
    private String rstCity;
    /**
     * 户籍地址
     */
    @TableField("rst_address")
    private String rstAddress;
    /**
     * 居住地址
     */
    @TableField("live_address")
    private String liveAddress;
    /**
     * 毕业学校
     */
    @TableField("graduated_school")
    private String graduatedSchool;
    /**
     * 专业
     */
    private String profession;
    /**
     * 婚姻状况
     */
    @TableField("marital_status")
    private String maritalStatus;
    /**
     * 政治面貌
     */
    @TableField("political_status")
    private String politicalStatus;
    /**
     * 面试日期
     */
    @TableField("interview_date")
    private String interviewDate;
    /**
     * 入职日期
     */
    @TableField("entry_date")
    private String entryDate;
    /**
     * 离职日期
     */
    @TableField("leave_date")
    private String leaveDate;
    /**
     * 离职原因
     */
    @TableField("leave_reason")
    private String leaveReason;
    /**
     * 面试供应商
     */
    @TableField("supplier_id")
    private String supplierId;
    /**
     * 备注信息
     */
    @TableField("emp_memo")
    private String empMemo;
    /**
     * 工期类型
     */
    @TableField("duration_type")
    private String durationType;
    /**
     * 用工类型
     */
    @TableField("employment_type")
    private String employmentType;
    /**
     * 资源类型
     */
    @TableField("resource_type")
    private String resourceType;
    /**
     * 外送类型
     */
    @TableField("outsize_type")
    private String outsizeType;
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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getServiceCityName() {
        return serviceCityName;
    }

    public void setServiceCityName(String serviceCityName) {
        this.serviceCityName = serviceCityName;
    }

    public String getCostCenter() {
        return costCenter;
    }

    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRstProperty() {
        return rstProperty;
    }

    public void setRstProperty(String rstProperty) {
        this.rstProperty = rstProperty;
    }

    public String getDutyStatus() {
        return dutyStatus;
    }

    public void setDutyStatus(String dutyStatus) {
        this.dutyStatus = dutyStatus;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Long getPostCode() {
        return postCode;
    }

    public void setPostCode(Long postCode) {
        this.postCode = postCode;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRstCity() {
        return rstCity;
    }

    public void setRstCity(String rstCity) {
        this.rstCity = rstCity;
    }

    public String getRstAddress() {
        return rstAddress;
    }

    public void setRstAddress(String rstAddress) {
        this.rstAddress = rstAddress;
    }

    public String getLiveAddress() {
        return liveAddress;
    }

    public void setLiveAddress(String liveAddress) {
        this.liveAddress = liveAddress;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getEmpMemo() {
        return empMemo;
    }

    public void setEmpMemo(String empMemo) {
        this.empMemo = empMemo;
    }

    public String getDurationType() {
        return durationType;
    }

    public void setDurationType(String durationType) {
        this.durationType = durationType;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getOutsizeType() {
        return outsizeType;
    }

    public void setOutsizeType(String outsizeType) {
        this.outsizeType = outsizeType;
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
        return "Emp{" +
        ", id=" + id +
        ", customerId=" + customerId +
        ", customerName=" + customerName +
        ", serviceCityName=" + serviceCityName +
        ", costCenter=" + costCenter +
        ", empName=" + empName +
        ", cardType=" + cardType +
        ", cardNo=" + cardNo +
        ", birthday=" + birthday +
        ", gender=" + gender +
        ", age=" + age +
        ", rstProperty=" + rstProperty +
        ", dutyStatus=" + dutyStatus +
        ", departmentId=" + departmentId +
        ", empType=" + empType +
        ", postCode=" + postCode +
        ", post=" + post +
        ", usedName=" + usedName +
        ", nationality=" + nationality +
        ", nativePlace=" + nativePlace +
        ", nation=" + nation +
        ", contactMobile=" + contactMobile +
        ", contactTel=" + contactTel +
        ", email=" + email +
        ", rstCity=" + rstCity +
        ", rstAddress=" + rstAddress +
        ", liveAddress=" + liveAddress +
        ", graduatedSchool=" + graduatedSchool +
        ", profession=" + profession +
        ", maritalStatus=" + maritalStatus +
        ", politicalStatus=" + politicalStatus +
        ", interviewDate=" + interviewDate +
        ", entryDate=" + entryDate +
        ", leaveDate=" + leaveDate +
        ", leaveReason=" + leaveReason +
        ", supplierId=" + supplierId +
        ", empMemo=" + empMemo +
        ", durationType=" + durationType +
        ", employmentType=" + employmentType +
        ", resourceType=" + resourceType +
        ", outsizeType=" + outsizeType +
        ", status=" + status +
        ", updateUser=" + updateUser +
        ", updateTime=" + updateTime +
        ", createUser=" + createUser +
        ", createTime=" + createTime +
        "}";
    }
}
