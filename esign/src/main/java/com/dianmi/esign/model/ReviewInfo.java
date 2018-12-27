package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "review_info")
public class ReviewInfo {
    /**
     * 平台审核唯一编号
     */
    @Id
    @Column(name = "REVIEW_UUID")
    private String reviewUuid;

    /**
     * 审核编号
     */
    @Column(name = "REVIEW_ID")
    private Integer reviewId;

    /**
     * 应聘企业唯一id
     */
    @Column(name = "APPLY_ENT_UUID")
    private String applyEntUuid;

    /**
     * 角色唯一id
     */
    @Column(name = "UNION_ID")
    private String unionId;

    /**
     * 员工姓名
     */
    @Column(name = "STAFF_NAME")
    private String staffName;

    /**
     * 员工户籍城市
     */
    @Column(name = "STAFF_PLACE")
    private String staffPlace;

    /**
     * 员工手机号
     */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /**
     * 应聘职位
     */
    @Column(name = "APPLY_JOB")
    private String applyJob;

    /**
     * 审核状态
     */
    @Column(name = "REVIEW_STATUS")
    private String reviewStatus;

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
     * 获取平台审核唯一编号
     *
     * @return REVIEW_UUID - 平台审核唯一编号
     */
    public String getReviewUuid() {
        return reviewUuid;
    }

    /**
     * 设置平台审核唯一编号
     *
     * @param reviewUuid 平台审核唯一编号
     */
    public void setReviewUuid(String reviewUuid) {
        this.reviewUuid = reviewUuid;
    }

    /**
     * 获取审核编号
     *
     * @return REVIEW_ID - 审核编号
     */
    public Integer getReviewId() {
        return reviewId;
    }

    /**
     * 设置审核编号
     *
     * @param reviewId 审核编号
     */
    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * 获取应聘企业唯一id
     *
     * @return APPLY_ENT_UUID - 应聘企业唯一id
     */
    public String getApplyEntUuid() {
        return applyEntUuid;
    }

    /**
     * 设置应聘企业唯一id
     *
     * @param applyEntUuid 应聘企业唯一id
     */
    public void setApplyEntUuid(String applyEntUuid) {
        this.applyEntUuid = applyEntUuid;
    }

    /**
     * 获取角色唯一id
     *
     * @return UNION_ID - 角色唯一id
     */
    public String getUnionId() {
        return unionId;
    }

    /**
     * 设置角色唯一id
     *
     * @param unionId 角色唯一id
     */
    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    /**
     * 获取员工姓名
     *
     * @return STAFF_NAME - 员工姓名
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * 设置员工姓名
     *
     * @param staffName 员工姓名
     */
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    /**
     * 获取员工户籍城市
     *
     * @return STAFF_PLACE - 员工户籍城市
     */
    public String getStaffPlace() {
        return staffPlace;
    }

    /**
     * 设置员工户籍城市
     *
     * @param staffPlace 员工户籍城市
     */
    public void setStaffPlace(String staffPlace) {
        this.staffPlace = staffPlace;
    }

    /**
     * 获取员工手机号
     *
     * @return PHONE_NUMBER - 员工手机号
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置员工手机号
     *
     * @param phoneNumber 员工手机号
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取应聘职位
     *
     * @return APPLY_JOB - 应聘职位
     */
    public String getApplyJob() {
        return applyJob;
    }

    /**
     * 设置应聘职位
     *
     * @param applyJob 应聘职位
     */
    public void setApplyJob(String applyJob) {
        this.applyJob = applyJob;
    }

    /**
     * 获取审核状态
     *
     * @return REVIEW_STATUS - 审核状态
     */
    public String getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 设置审核状态
     *
     * @param reviewStatus 审核状态
     */
    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
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