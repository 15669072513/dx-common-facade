package com.dx.facade.auth.domain;


import java.util.List;


/**
 * 用户公共RPC接口入参
 *
 * @author deft
 */
public class PermissionAgentReqDTO {

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商户唯一标识
     */
    private String agentCode;

    /**
     * 商户唯一标识
     */
    private List<String> agentCodeList;

    /**
     * 权限id
     */
    private String permissionId;


    /**
     * 是否分页
     */
    private boolean isPage;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public List<String> getAgentCodeList() {
        return agentCodeList;
    }

    public void setAgentCodeList(List<String> agentCodeList) {
        this.agentCodeList = agentCodeList;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean page) {
        isPage = page;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }


    public String getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    public boolean getIsPage() {
        return isPage;
    }

    public void setIsPage(boolean isPage) {
        this.isPage = isPage;
    }

    public PageDTO getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDTO pageDto) {
        this.pageDto = pageDto;
    }


}
