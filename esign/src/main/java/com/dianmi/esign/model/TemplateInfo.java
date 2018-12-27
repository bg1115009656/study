package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "template_info")
public class TemplateInfo {
    /**
     * 模板编号
     */
    @Id
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    /**
     * 模板名称
     */
    @Column(name = "TEMPLATE_NAME")
    private String templateName;

    /**
     * 模板路径
     */
    @Column(name = "TEMPLATE_PATH")
    private String templatePath;

    /**
     * 所属企业
     */
    @Column(name = "BELONG_ENT_ID")

    private String belongEntId;
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
     * 获取模板编号
     *
     * @return TEMPLATE_ID - 模板编号
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板编号
     *
     * @param templateId 模板编号
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取模板名称
     *
     * @return TEMPLATE_NAME - 模板名称
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 设置模板名称
     *
     * @param templateName 模板名称
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取模板路径
     *
     * @return TEMPLATE_PATH - 模板路径
     */
    public String getTemplatePath() {
        return templatePath;
    }

    /**
     * 设置模板路径
     *
     * @param templatePath 模板路径
     */
    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getBelongEntId() {
        return belongEntId;
    }

    public void setBelongEntId(String belongEntId) {
        this.belongEntId = belongEntId;
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