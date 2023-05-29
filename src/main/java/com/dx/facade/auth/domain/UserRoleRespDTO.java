package com.dx.facade.auth.domain;

import java.util.List;

/**
 * 用户相关角色权限出参
 *
 * @author deft
 */
public class UserRoleRespDTO {

    /**
     * 用户可配置的角色列表
     */
    private List<RoleDTO> allowUserRole;

    public List<RoleDTO> getAllowUserRole() {
        return allowUserRole;
    }

    public void setAllowUserRole(List<RoleDTO> allowUserRole) {
        this.allowUserRole = allowUserRole;
    }

}
