package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberBillDetailResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("会员ID")
    private Long memberId;

    @ApiModelProperty("业务事件ID，如果是下注就为注单号")
    private String eventId;

    @ApiModelProperty("业务事件时间")
    private LocalDateTime eventTime;

    @ApiModelProperty("流水类型：如果是下注就为0 + 会员账变类型。会员枚举MemberChangeType")
    private Integer changeType;

    @ApiModelProperty("流水类型描述")
    private String changeTypeDesc;

    @ApiModelProperty("金额")
    private BigDecimal amount;

    @ApiModelProperty("倍数要求")
    private BigDecimal multiple;

    @ApiModelProperty("本次变化金额")
    private BigDecimal changeAmount;

    @ApiModelProperty("开始统计时间")
    private LocalDateTime startTime;

    @ApiModelProperty("流水要求总计")
    private BigDecimal validAmountTotal;

    @ApiModelProperty("已完成流水总计")
    private BigDecimal completeAmountTotal;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;


}
