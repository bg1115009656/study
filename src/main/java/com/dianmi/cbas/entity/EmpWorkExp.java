package com.dianmi.cbas.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工工作经历表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp_work_exp")
public class EmpWorkExp extends Model<EmpWorkExp> {

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
     * 工作单位
     */
    @TableField("work_unit")
    private String workUnit;
    /**
     * 岗位
     */
    private String post;
    /**
     * 工资城市
     */
    @TableField("wage_city")
    private String wageCity;
    /**
     * 职务
     */
    private String duties;
    /**
     * 证明人
     */
    private String witness;
    /**
     * 证明人联系电话
     */
    @TableField("witness_tel")
    private String witnessTel;
    /**
     * 备注
     */
    private String memo;


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

    public String getWorkUnit() {
        return workUnit;
    }

    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWageCity() {
        return wageCity;
    }

    public void setWageCity(String wageCity) {
        this.wageCity = wageCity;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getWitness() {
        return witness;
    }

    public void setWitness(String witness) {
        this.witness = witness;
    }

    public String getWitnessTel() {
        return witnessTel;
    }

    public void setWitnessTel(String witnessTel) {
        this.witnessTel = witnessTel;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "EmpWorkExp{" +
        ", id=" + id +
        ", empId=" + empId +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", workUnit=" + workUnit +
        ", post=" + post +
        ", wageCity=" + wageCity +
        ", duties=" + duties +
        ", witness=" + witness +
        ", witnessTel=" + witnessTel +
        ", memo=" + memo +
        "}";
    }
}
