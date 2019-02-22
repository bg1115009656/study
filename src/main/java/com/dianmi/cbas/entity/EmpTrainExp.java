package com.dianmi.cbas.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 员工培训经历表
 * </p>
 *
 * @author codeGenerate
 * @since 2018-12-04
 */
@TableName("emp_train_exp")
public class EmpTrainExp extends Model<EmpTrainExp> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 员工编号
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
     * 培训单位
     */
    @TableField("train_unit")
    private String trainUnit;
    /**
     * 培训内容
     */
    @TableField("train_content")
    private String trainContent;
    /**
     * 培训证书
     */
    @TableField("train_certificate")
    private String trainCertificate;
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

    public String getTrainUnit() {
        return trainUnit;
    }

    public void setTrainUnit(String trainUnit) {
        this.trainUnit = trainUnit;
    }

    public String getTrainContent() {
        return trainContent;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent;
    }

    public String getTrainCertificate() {
        return trainCertificate;
    }

    public void setTrainCertificate(String trainCertificate) {
        this.trainCertificate = trainCertificate;
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
        return "EmpTrainExp{" +
        ", id=" + id +
        ", empId=" + empId +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", trainUnit=" + trainUnit +
        ", trainContent=" + trainContent +
        ", trainCertificate=" + trainCertificate +
        ", memo=" + memo +
        "}";
    }
}
