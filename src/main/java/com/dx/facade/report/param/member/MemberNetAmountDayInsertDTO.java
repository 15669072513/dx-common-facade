package com.dx.facade.report.param.member;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员盈亏统计天表
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("dwm_member_net_amount_day")
public class MemberNetAmountDayInsertDTO implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "应用终端")
    private Integer appId;

    @ApiModelProperty(value = "日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty(value = "会员ID")
    private Long memberId;

    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "注单数")
    private Long betCount;

    @ApiModelProperty(value = "投注额")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "输赢金额")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "派彩金额")
    private BigDecimal payAmount;

    @ApiModelProperty(value = "资料创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updatedAt;
}
