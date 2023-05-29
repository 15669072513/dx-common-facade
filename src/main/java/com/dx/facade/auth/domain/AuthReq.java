package com.dx.facade.auth.domain;

import java.util.List;

public class AuthReq {

    /**
     * (用户访问路径)
     */
    private String uri;

    /**
     * (用户id)
     */
    private Long id;

    private List<String> roleIds;

    /**
     * (后台系统(0,B2B后台;1,小游戏后台;2,信用贷后台))
     */
    private String type;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<String> roleIds) {
        this.roleIds = roleIds;
    }

    @Override
    public String toString() {
        return "AuthReq{" +
                "uri='" + uri + '\'' +
                ", id=" + id +
                ", roleIds=" + roleIds +
                ", type='" + type + '\'' +
                '}';
    }
}
