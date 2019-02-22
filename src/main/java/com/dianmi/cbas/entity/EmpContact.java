package com.dianmi.cbas.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工紧急联系人表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp_contact")
public class EmpContact extends Model<EmpContact> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 员工id
     */
    @TableField("emp_id")
    private Long empId;
    /**
     * 联系人
     */
    @TableField("emergency_contact")
    private String emergencyContact;
    /**
     * 联系人电话
     */
    @TableField("emergency_contact_tel")
    private String emergencyContactTel;
    /**
     * 关系
     */
    private String relationship;


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

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactTel() {
        return emergencyContactTel;
    }

    public void setEmergencyContactTel(String emergencyContactTel) {
        this.emergencyContactTel = emergencyContactTel;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmpContact{" +
        ", id=" + id +
        ", empId=" + empId +
        ", emergencyContact=" + emergencyContact +
        ", emergencyContactTel=" + emergencyContactTel +
        ", relationship=" + relationship +
        "}";
    }
}
