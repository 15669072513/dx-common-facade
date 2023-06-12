package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

import org.springframework.util.Assert;

@Data
public class AddClubAuditParamDTO implements BaseParmDTO{

	/** 商户ID */
    @ApiModelProperty("商户ID")
    private Long merchantId;

    /** 代理Id */
    @ApiModelProperty("代理Id")
    private Long proxyId;

    /** 代理名称 */
    @ApiModelProperty("代理名称")
    private String proxyName;
    
    /** 俱乐部名称 */
    @ApiModelProperty("俱乐部名称")
    private String clubName;
        
    /** icon地址 */
    @ApiModelProperty("icon地址")
    private String iconUrl;
    
    /** 简介 */
    @ApiModelProperty("简介")
    private String introduction;

    /** 锁单状态（0-未锁定 1-已锁定） */
    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    /** 锁单时间 */
    @ApiModelProperty("锁单时间")
    private LocalDateTime lockDatetime;

    /** 锁单人id */
    @ApiModelProperty("锁单人id")
    private Long lockAccountId;

    /** 锁单人 */
    @ApiModelProperty("锁单人")
    private String lockName;

    /** 审核状态（0-待处理 1-处理中，2-审核拒绝，3-审核通过） */
    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核拒绝，3-审核通过）")
    private Integer auditStatus;

    /** 审核完成时间 */
    @ApiModelProperty("审核完成时间")
    private LocalDateTime auditDatetime;

    /** 审核人 */
    @ApiModelProperty("审核人")
    @TableField("audit_name")
    private String auditName;

    /** 审核备注 */
    @TableField("audit_remark")
    private String auditRemark;

    /** 单号 */
    @ApiModelProperty("单号")
    private String eventId;

    /** 申请人 */
    @ApiModelProperty("申请人")
    private String applyName;

    /** 申请备注 */
    @ApiModelProperty("申请备注")
    private String applyRemark;



    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
        Assert.notNull(proxyName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyName"));
        Assert.notNull(clubName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clubName"));
        Assert.notNull(iconUrl, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("iconUrl"));
        Assert.notNull(introduction, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("introduction"));
        Assert.notNull(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));

    }
}
