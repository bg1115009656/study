package com.dianmi.cbas.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工教育经历表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp_education_exp")
public class EmpEducationExp extends Model<EmpEducationExp> {

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
     * 学历
     */
    private String education;
    /**
     * 开始时间
     */
    @TableField("start_date")
    private String startDate;
    /**
     * 结束时间
     */
    @TableField("end_date")
    private String endDate;
    /**
     * 学校
     */
    private String school;
    /**
     * 专业
     */
    private String profession;


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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmpEducationExp{" +
        ", id=" + id +
        ", empId=" + empId +
        ", education=" + education +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", school=" + school +
        ", profession=" + profession +
        "}";
    }
}
