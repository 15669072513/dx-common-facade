package com.dx.facade.auth.domain;

import java.util.List;

public class RolePermissionRespDTO {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 描述
     */
    private String remark;

    /**
     * 角色权限
     */
    private List<PermissionDTO> rolePermission;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<PermissionDTO> getRolePermission() {
        return rolePermission;
    }

    public void setRolePermission(List<PermissionDTO> rolePermission) {
        this.rolePermission = rolePermission;
    }

}
