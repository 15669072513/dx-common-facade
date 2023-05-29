package com.dx.facade.auth.domain;


/**
 * 用户公共RPC接口出参
 *
 * @author deft
 */
public class PermissionAgentRespDTO {


    /**
     * 商户ID
     */
    private String agentId;

    /**
     * 商户编码
     */
    private String agentCode;


    /**
     * 商户名称
     */
    private String agentName;

    /**
     * 权限项ID
     */
    private String permissionId;

    /**
     * 权限项名称
     */
    private String permissionName;


    /**
     * 英文权限项名称
     */
    private String permissionNameEnglish;


    /**
     * 分页信息
     */
    private PageDTO pageDto;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }


    public String getPermissionNameEnglish() {
        return permissionNameEnglish;
    }

    public void setPermissionNameEnglish(String permissionNameEnglish) {
        this.permissionNameEnglish = permissionNameEnglish;
    }

    public PageDTO getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDTO pageDto) {
        this.pageDto = pageDto;
    }
}
