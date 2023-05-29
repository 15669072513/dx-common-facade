package com.dx.facade.member.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Nichols
 */
@Data
@ApiModel("会员转代审核分页响应数据传输对象")
public class ProxyTransferDataRespDTO {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberId;

    @ApiModelProperty("会员账号")
    private String memberName;

    @ApiModelProperty("会员账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer memberAccountType;

    @ApiModelProperty("会员注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime memberRegisterDatetime;

    @ApiModelProperty("会员风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long memberWindControlId;

    @ApiModelProperty("会员风控层级名称")
    private String memberWindControlName;

    @ApiModelProperty("当前上级代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long currentProxyId;

    @ApiModelProperty("当前上级代理账号")
    private String currentProxyName;

    @ApiModelProperty("当前上级代理账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer currentProxyAccountType;

    @ApiModelProperty("当前上级代理注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime currentProxyRegisterDatetime;

    @ApiModelProperty("转入上级代理ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long transferProxyId;

    @ApiModelProperty("转入上级代理账号")
    private String transferProxyName;

    @ApiModelProperty("转入上级代理账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer transferProxyAccountType;

    @ApiModelProperty("转入上级代理注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime transferProxyRegisterDatetime;

    @ApiModelProperty("转入上级代理风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long transferProxyWindControlId;

    @ApiModelProperty("转入上级代理风控层级名称")
    private String transferProxyWindControlName;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockStatus;

    @ApiModelProperty("锁单时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lockDatetime;

    @ApiModelProperty("锁单人id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long lockNameId;

    @ApiModelProperty("锁单人")
    private String lockName;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("审核完成时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime auditDatetime;

    @ApiModelProperty("审核人")
    private String auditName;

    @ApiModelProperty("审核备注")
    private String auditRemark;

    @ApiModelProperty("单号")
    private String eventId;

    @ApiModelProperty("申请人")
    private String applyName;

    @ApiModelProperty("申请备注")
    private String applyRemark;

    @ApiModelProperty("审核环节（0-结单查看 1-一审审核）")
    private Integer auditStep;

    @ApiModelProperty("申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}
