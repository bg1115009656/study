package com.dianmi.esign.model;

import javax.persistence.*;

@Table(name = "job_entity")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String group;

    private String cron;

    private String parameter;

    private String description;

    @Column(name = "vm_param")
    private String vmParam;

    @Column(name = "jar_path")
    private String jarPath;

    private String status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return cron
     */
    public String getCron() {
        return cron;
    }

    /**
     * @param cron
     */
    public void setCron(String cron) {
        this.cron = cron;
    }

    /**
     * @return parameter
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * @param parameter
     */
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return vm_param
     */
    public String getVmParam() {
        return vmParam;
    }

    /**
     * @param vmParam
     */
    public void setVmParam(String vmParam) {
        this.vmParam = vmParam;
    }

    /**
     * @return jar_path
     */
    public String getJarPath() {
        return jarPath;
    }

    /**
     * @param jarPath
     */
    public void setJarPath(String jarPath) {
        this.jarPath = jarPath;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
}