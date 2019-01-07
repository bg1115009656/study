package com.gbai.quartz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "job_entity")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String methodName;

    private String groups;

    private String cron;

    private String parameter;

    private String description;

    @Column(name = "vm_param")
    private String vmParam;

    @Column(name = "jar_path")
    private String jarPath;

    private String status;

}