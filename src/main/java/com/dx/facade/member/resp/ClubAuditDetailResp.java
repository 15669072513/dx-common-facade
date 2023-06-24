package com.dx.facade.member.resp;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 新增俱乐部审核明细
 * </p>
 *
 * @author bicycle
 * @since 2023-06-10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "AddClubAuditPO详情对象返回值", description = "AddClubAuditPO详情对象返回值")
public class ClubAuditDetailResp implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    @ApiModelProperty("ID")
    private Long id;

    /** 商户ID */
    @ApiModelProperty("商户ID")
    private Long merchantId;

    /** 代理Id */
    @ApiModelProperty("代理Id")
    private Long proxyId;

    /** 代理名称 */
    @ApiModelProperty("代理名称")
    private String proxyName;
    
    @ApiModelProperty("代理姓名")
    private String proxyRealName;
    
    @ApiModelProperty("总代名称")
    private String topProxyName;
    
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
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
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

    /** 申请时间 */
    @ApiModelProperty("申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    /** 更新时间 */
    @ApiModelProperty("更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;


}
