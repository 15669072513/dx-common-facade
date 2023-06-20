package com.dx.facade.windcontrol.resp;

import java.util.Date;

/**
 * <p>
 * 风控层级表
 * </p>
 *
 * @author kygo
 * @since 2022-09-21
 */
public class WindControlLevelResp   {

    private static final long serialVersionUID=1L;

    /**
     * id
     */
    private Long id;

    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 风控类型 (1-风险会员，2-风险代理，3-风险银行卡，4-风险虚拟账号，5-风险IP，6-风险终端号 )
     */
    private Integer windControlType;

    /**
     * 风控层级名称
     */
    private String windControlLevelName;

    /**
     * 风控层级描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 修改时间
     */
    private Date updatedAt;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 是否删除（0-未删除 1-已删除）
     */
    private Integer delFlag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getWindControlType() {
        return windControlType;
    }

    public void setWindControlType(Integer windControlType) {
        this.windControlType = windControlType;
    }

    public String getWindControlLevelName() {
        return windControlLevelName;
    }

    public void setWindControlLevelName(String windControlLevelName) {
        this.windControlLevelName = windControlLevelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }



    @Override
    public String toString() {
        return "WindControlLevel{" +
        "id=" + id +
        ", merchantId=" + merchantId +
        ", windControlType=" + windControlType +
        ", windControlLevelName=" + windControlLevelName +
        ", description=" + description +
        ", createdAt=" + createdAt +
        ", createdBy=" + createdBy +
        ", updatedAt=" + updatedAt +
        ", updatedBy=" + updatedBy +
        ", delFlag=" + delFlag +
        "}";
    }
}
