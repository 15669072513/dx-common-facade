package com.dx.facade.auth.domain;

import java.time.LocalDateTime;

/**
 * 角色公共RPC接口出参
 *
 * @author deft
 */
public class RoleRespDTO {

    /**
     * 角色id
     */
    private Long id;

    /**
     * (角色名)
     */
    private String roleName;

    /**
     * 状态
     */
    private String status;

    /**
     * 描述
     */
    private String remark;

    /**
     * 系统角色类型
     */
    private String systemType;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * (更新时间)
     */
    private LocalDateTime updatedAt;

    /**
     * (编辑人)
     */
    private String updatedBy;

    /**
     * 分页信息
     */
    private PageDTO pageDto;

    /**
     * 商户唯一标识
     */
    private Long merchantId;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public PageDTO getPageDto() {
        return pageDto;
    }

    public void setPageDto(PageDTO pageDto) {
        this.pageDto = pageDto;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }
}
