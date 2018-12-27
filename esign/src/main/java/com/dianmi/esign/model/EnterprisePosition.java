package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "enterprise_position")
public class EnterprisePosition {
    /**
     * 编号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 企业编号
     */
    @Column(name = "ENT_NO")
    private String entNo;

    /**
     * 企业名称
     */
    @Column(name = "ENT_NAME")
    private String entName;

    /**
     * 发布类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 职位
     */
    @Column(name = "POSITION")
    private String position;

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
     * 获取编号
     *
     * @return ID - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业编号
     *
     * @return ENT_NO - 企业编号
     */
    public String getEntNo() {
        return entNo;
    }

    /**
     * 设置企业编号
     *
     * @param entNo 企业编号
     */
    public void setEntNo(String entNo) {
        this.entNo = entNo;
    }

    /**
     * 获取企业名称
     *
     * @return ENT_NAME - 企业名称
     */
    public String getEntName() {
        return entName;
    }

    /**
     * 设置企业名称
     *
     * @param entName 企业名称
     */
    public void setEntName(String entName) {
        this.entName = entName;
    }

    /**
     * 获取发布类型
     *
     * @return TYPE - 发布类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置发布类型
     *
     * @param type 发布类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取职位
     *
     * @return POSITION - 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职位
     *
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position;
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