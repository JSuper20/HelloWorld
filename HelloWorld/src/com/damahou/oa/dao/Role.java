package com.damahou.oa.dao;

/**
 * @Program HelloWorld
 * @ClassName Role
 * @Package com.damahou.oa.dao
 * @Description TODO：角色实体
 * @Author DaMaHou
 * @CreateDate 2022-03-24 22:30
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class Role {
    /**
     * 角色名
     */
    private String roleName;
    /**
     * 角色权限
     */
    private String permission;

    public Role() {
    }

    public Role(String roleName, String permission) {
        this.roleName = roleName;
        this.permission = permission;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", permission='" + permission + '\'' +
                '}';
    }
}
