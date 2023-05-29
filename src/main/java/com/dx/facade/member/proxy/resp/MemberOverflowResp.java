package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberOverflowResp {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("会员id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("当前上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long currentProxyId;

    @ApiModelProperty("当前上级代理账号")
    private String currentProxyName;

    @ApiModelProperty("转入上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long transferProxyId;

    @ApiModelProperty("转入上级代理账号")
    private String transferProxyName;

    @ApiModelProperty("转入上级代理账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer tranferProxyAccountType;

    @ApiModelProperty("推广设备（1-APP 2-WEB 3-H5）")
    private Integer promotionDevice;

    @ApiModelProperty("推广链接")
    private String promotionLink;

    @ApiModelProperty("审核单号")
    private String auditNum;

    @ApiModelProperty("申请人")
    private String applyName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("申请时间")
    private LocalDateTime applyTime;

    @ApiModelProperty("申请信息")
    private String applyInfo;

    @ApiModelProperty("审核状态（0-待处理 1-处理中，2-审核通过，3-审核拒绝）")
    private Integer auditStatus;

    @ApiModelProperty("一审审核人")
    private String auditName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("一审审批时间")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核备注")
    private String auditRemark;

    @ApiModelProperty("锁单状态（0-未锁定 1-已锁定）")
    private Integer lockOrder;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty("创建时间")
    private LocalDateTime createDt;

    @ApiModelProperty("审核环节（0-结单查看 1-一审审核）")
    private Integer auditStep;

}
