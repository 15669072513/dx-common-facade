package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 下级成员详情信息
 *
 * @author laway
 */
@Data
@Builder
public class ProxyMemberDetailRespDTO {

    @ApiModelProperty(value = "存款金额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "提款金额")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "红利")
    private BigDecimal rewardAmount;

    @ApiModelProperty(value = "反水")
    private BigDecimal returnWaterAmount;

    @ApiModelProperty(value = "有效投注")
    private BigDecimal validAmount;

    @ApiModelProperty(value = "总投注额")
    private BigDecimal totalAmount;

    @ApiModelProperty(value = "今日总输赢")
    private BigDecimal todayWinAmount;

    @ApiModelProperty(value = "总输赢")
    private BigDecimal winAmount;

    @ApiModelProperty(value = "账户调整")
    private BigDecimal otherAmount;

}
