package com.dx.facade.game.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *  异常注单记录
 */
@Data
public class GameExceptionRecordDto {

    @ApiModelProperty(value = "异常注单主键id")
    private String id;
    @ApiModelProperty(value = "注单id")
    private String recordId;
    @ApiModelProperty(value = "三方注单ID")
    private String thirdOrderId;
    @ApiModelProperty(value = "平台名称")
    private String venueName;
    @ApiModelProperty(value = "游戏名称")
    private String gameName;
    @ApiModelProperty(value = "赛事id/局号")
    private String matchId;
    @ApiModelProperty(value = "异常类型 1 重算单 2 更改单 3 延迟单")
    private Integer exceptionType;
    @ApiModelProperty(value = "重算状态 1未重算 2重算中 3已重算 4不处理")
    private Integer dealStatus;
    @ApiModelProperty(value = "返水结果  1应用成功 2应用失败")
    private Integer rebateResult;
    @ApiModelProperty(value = "返水备注 ")
    private String rebateRemark;
    @ApiModelProperty(value = "返点结果  1应用成功 2应用失败")
    private Integer rebateRateResult;
    @ApiModelProperty(value = "返点结果备注")
    private String rebateRateRemark;
    @ApiModelProperty(value = "佣金结果  1应用成功 2应用失败")
    private Integer commissionResult;
    @ApiModelProperty(value = "佣金结果备注")
    private String commissionRemark;
    @ApiModelProperty(value = "会员账号")
    private String memberName;
    @ApiModelProperty(value = "账号类型 ")
    private Integer accountType;
    @ApiModelProperty(value = "vip等级")
    private Integer vipSerialNum;
    @ApiModelProperty(value = "上级代理")
    private String parentProxyName;
    @ApiModelProperty(value = "游戏账号")
    private String playerName;
    @ApiModelProperty(value = "注单状态 0 未结算 1 已结算 2 取消  3 已中奖  4 未中奖  13 待确定  14 投注失败 15 撤消 24 挂起 -1 错误")
    private Integer betStatus;
    @ApiModelProperty(value = "注单金额")
    private BigDecimal betAmount;
    @ApiModelProperty(value = "有效注单金额")
    private BigDecimal validBetAmount;
    @ApiModelProperty(value = "会员输赢")
    private BigDecimal payAmount;
    @ApiModelProperty(value = "投注时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createAt;
    @ApiModelProperty(value = "结算时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime settleAt;
    @ApiModelProperty(value = "变更次数")
    private Integer reSettleCount;
    @ApiModelProperty(value = "最近变更时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "游戏类型(viv需要新增这个字段)")
    private String gameCode;
}
