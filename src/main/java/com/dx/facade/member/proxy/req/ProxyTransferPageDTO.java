package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author agan
 */
@Data
public class ProxyTransferPageDTO {

    @ApiModelProperty(value = "商户号")
    private List<Long> merchantIds;

    @ApiModelProperty(value = "申请开始时间")
    private String applyStartTime;

    @ApiModelProperty(value = "申请结束时间")
    private String applyEndTime;

    @ApiModelProperty(value = "一审完成开始时间")
    private String auditStartTime;

    @ApiModelProperty(value = "一审完成结束时间")
    private String auditEndTime;

    @ApiModelProperty(value = "审核状态")
    private List<Integer> auditStatus;

    @ApiModelProperty(value = "申请人")
    private String applyName;

    @ApiModelProperty(value = "一审人")
    private String auditName;

    @ApiModelProperty(value = "转代会员账号")
    private String memberName;

    @ApiModelProperty(value = "转入上级代理账号")
    private String currentProxyName;

    @ApiModelProperty(value = "审核单号")
    private String eventId;

    @ApiModelProperty(value = "锁单状态")
    private Integer lockOrder;

    @ApiModelProperty(value = "审核操作")
    private Integer auditStep;

    @ApiModelProperty(value = "排序列：1申请时间2一审完成时间")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式：asc/desc")
    private String orderType;
}
