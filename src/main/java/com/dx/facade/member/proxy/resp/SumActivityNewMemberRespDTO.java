package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计活跃新增人数聚合信息
 *
 * @author laway
 */
@Data
@Builder
public class SumActivityNewMemberRespDTO {

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    private Long playerId;

    /**
     * 会员名称
     */
    @ApiModelProperty(value = "会员名称")
    private String playerName;
    /**
     * 存款金额（包含人工）
     */
    @ApiModelProperty(value = "存款金额（包含人工）")
    private BigDecimal depositAmount;
    /**
     * 有效投注
     */
    @ApiModelProperty(value = "有效投注")
    private BigDecimal validBetAmount;

    /**
     * 绑定时间
     */
    @ApiModelProperty(value = "绑定时间")
    private String bindDate;

}
