package com.dx.facade.auth.domain;

/**
 * 角色信息
 *
 * @author deft
 */
public class RoleDTO {

    /**
     * 角色id
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * (角色是否分配用户0未分配,1已分配)
     */
    private String isExist;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getIsExist() {
        return isExist;
    }

    public void setIsExist(String isExist) {
        this.isExist = isExist;
    }

}
