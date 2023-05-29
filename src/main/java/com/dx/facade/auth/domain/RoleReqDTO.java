package com.dx.facade.auth.domain;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 角色公共RPC接口入参
 *
 * @author deft
 */
public class RoleReqDTO {

    /**
     * 角色id
     */
    public Long id;

    /**
     * 用户id
     */
    public Long execId;

    /**
     * 商户唯一标识
     */
    public String agentCode;

    /**
     * 角色名称
     */
    public String roleName;

    /**
     * 描述
     */
    public String remark;

    /**
     * 后台系统类型
     */
    public String type;

    /**
     * 角色系统类型
     */
    public String systemType;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 创建人
     */
    private String updatedBy;

    /**
     * 权限列表
     */
    private List<Long> permissionIds;

    /**
     * 是否分页
     */
    private boolean isPage;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    /**
     * 商户唯一标识
     */
    private Long merchantId;

    /**
     * 商户id列表，查询用
     */
    private List<Long> merchantIdList;

    public List<Long> getMerchantIdList() {
        return merchantIdList;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExecId() {
        return execId;
    }

    public void setExecId(Long execId) {
        this.execId = execId;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public boolean isPage() {
        return isPage;
    }

    public void setPage(boolean isPage) {
        this.isPage = isPage;
    }

    public PageDTO getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDTO pageDto) {
        this.pageDto = pageDto;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }
}
