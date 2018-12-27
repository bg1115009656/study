package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "opt_log")
public class OptLog {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 请求ip地址
     */
    @Column(name = "ip_address")
    private String ipAddress;

    /**
     * 操作者名称
     */
    private String operator;

    /**
     * 方法名
     */
    @Column(name = "bean_name")
    private String beanName;

    /**
     * 方法名称
     */
    @Column(name = "method_name")
    private String methodName;

    /**
     * 请求路径
     */
    private String uri;

    /**
     * 请求时间
     */
    @Column(name = "request_time")
    private Date requestTime;

    /**
     * 请求所需时间
     */
    @Column(name = "spent_time")
    private Long spentTime;

    /**
     * 请求参数
     */
    private String params;

    /**
     * 请求结果
     */
    private String result;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取请求ip地址
     *
     * @return ip_address - 请求ip地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置请求ip地址
     *
     * @param ipAddress 请求ip地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 获取操作者名称
     *
     * @return operator - 操作者名称
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作者名称
     *
     * @param operator 操作者名称
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取方法名
     *
     * @return bean_name - 方法名
     */
    public String getBeanName() {
        return beanName;
    }

    /**
     * 设置方法名
     *
     * @param beanName 方法名
     */
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    /**
     * 获取方法名称
     *
     * @return method_name - 方法名称
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * 设置方法名称
     *
     * @param methodName 方法名称
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * 获取请求路径
     *
     * @return uri - 请求路径
     */
    public String getUri() {
        return uri;
    }

    /**
     * 设置请求路径
     *
     * @param uri 请求路径
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 获取请求时间
     *
     * @return request_time - 请求时间
     */
    public Date getRequestTime() {
        return requestTime;
    }

    /**
     * 设置请求时间
     *
     * @param requestTime 请求时间
     */
    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    /**
     * 获取请求所需时间
     *
     * @return spent_time - 请求所需时间
     */
    public Long getSpentTime() {
        return spentTime;
    }

    /**
     * 设置请求所需时间
     *
     * @param spentTime 请求所需时间
     */
    public void setSpentTime(Long spentTime) {
        this.spentTime = spentTime;
    }

    /**
     * 获取请求参数
     *
     * @return params - 请求参数
     */
    public String getParams() {
        return params;
    }

    /**
     * 设置请求参数
     *
     * @param params 请求参数
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * 获取请求结果
     *
     * @return result - 请求结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置请求结果
     *
     * @param result 请求结果
     */
    public void setResult(String result) {
        this.result = result;
    }
}