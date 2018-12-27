package com.dianmi.esign.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "menu_info")
public class MenuInfo {
    /**
     * 菜单编号
     */
    @Id
    @Column(name = "MENU_ID")
    private Integer menuId;

    /**
     * 菜单名称
     */
    @Column(name = "MENU_NAME")
    private String menuName;

    /**
     * 菜单排序号
     */
    @Column(name = "SORT_NO")
    private String sortNo;

    /**
     * 所对应角色（字段为空，默认为全权）
     */
    @Column(name = "BELONG_ROLE")
    private String belongRole;

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
     * 获取菜单编号
     *
     * @return MENU_ID - 菜单编号
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * 设置菜单编号
     *
     * @param menuId 菜单编号
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * 获取菜单名称
     *
     * @return MENU_NAME - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取菜单排序号
     *
     * @return SORT_NO - 菜单排序号
     */
    public String getSortNo() {
        return sortNo;
    }

    /**
     * 设置菜单排序号
     *
     * @param sortNo 菜单排序号
     */
    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * 获取所对应角色（字段为空，默认为全权）
     *
     * @return BELONG_ROLE - 所对应角色（字段为空，默认为全权）
     */
    public String getBelongRole() {
        return belongRole;
    }

    /**
     * 设置所对应角色（字段为空，默认为全权）
     *
     * @param belongRole 所对应角色（字段为空，默认为全权）
     */
    public void setBelongRole(String belongRole) {
        this.belongRole = belongRole;
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