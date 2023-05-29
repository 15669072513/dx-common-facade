package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UpdateUserAuditRespDTO {
    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("用户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty("账号类型 （0-会员 1-代理）")
    private Integer userType;

    @ApiModelProperty("会员/代理账号")
    private String userName;

    @ApiModelProperty("代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty("修改前")
    private String beforeModify;

    @ApiModelProperty("修改后")
    private String afterModify;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @ApiModelProperty("锁单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lockDatetime;

    @ApiModelProperty(value ="锁单人id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long lockAccountId;

    @ApiModelProperty("锁单人")
    private String lockName;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("审核操作（0-结单查看 1-审核）")
    private Integer stepCode;

    @ApiModelProperty("审核完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime auditDatetime;

    @ApiModelProperty("审核人")
    private String auditName;

    @ApiModelProperty("审核备注")
    private String auditRemark;

    @ApiModelProperty("单号")
    private String eventId;

    @ApiModelProperty("申请人")
    private String applyName;

    @ApiModelProperty("审核申请类型（1-姓名，2-性别，3-出生日期，4-手机号码，5-邮箱，6-账号状态，7-风控层级，8-会员标签）详见UpdateMemberAuditEnums.ApplyType")
    private Integer applyType;

    @ApiModelProperty("申请备注")
    private String applyRemark;

    @ApiModelProperty("申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

}
