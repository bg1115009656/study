package com.dianmi.esign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.*;

@Table(name = "template_fields")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TemplateFields {
    /**
     * 字段编号
     */
    @Id
    @Column(name = "FIELD_ID")
    private Integer fieldId;

    /**
     * 字段名称
     */
    @Column(name = "FIELD_NAME")
    private String fieldName;

    /**
     * 文本域对应模板字段
     */
    @Column(name = "FIELD_TO_TPL")
    private String fieldToTpl;
    /**
     * 文本域填充方式
     */
    @Column(name = "FILL_TYPE")
    private String fillType;
    /**
     * 文本域数据来源
     */
    @Column(name = "FIELD_SOURCE")
    private String fieldSource;
    /**
     * 文本域对应表字段
     */
    @Column(name = "FIELD_PROPER")
    private String fieldProper;

    /**
     * 模板编号
     */
    @Column(name = "TEMPLATE_ID")
    private String templateId;

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
     * 获取字段编号
     *
     * @return FIELD_ID - 字段编号
     */
    public Integer getFieldId() {
        return fieldId;
    }

    /**
     * 设置字段编号
     *
     * @param fieldId 字段编号
     */
    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * 获取字段名称
     *
     * @return FIELD_NAME - 字段名称
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * 设置字段名称
     *
     * @param fieldName 字段名称
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取文本域对应模板字段
     *
     * @return FIELD_TO_TPL - 文本域对应模板字段
     */
    public String getFieldToTpl() {
        return fieldToTpl;
    }

    /**
     * 设置文本域对应模板字段
     *
     * @param fieldToTpl 文本域对应模板字段
     */
    public void setFieldToTpl(String fieldToTpl) {
        this.fieldToTpl = fieldToTpl;
    }

    /**
     * 获取模板编号
     *
     * @return TEMPLATE_ID - 模板编号
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板编号
     *
     * @param templateId 模板编号
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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