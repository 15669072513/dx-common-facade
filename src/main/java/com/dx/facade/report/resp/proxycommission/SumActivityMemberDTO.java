package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 统计活跃人数聚合信息
 *
 * @author laway
 */
@Data
public class SumActivityMemberDTO {

    /**
     * 会员ID
     */
    private Long playerId;

    private Long playerId1;

    private Long playerId2;

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
     * 有效投注
     */
    @ApiModelProperty(value = "有效投注")
    private BigDecimal betAmount;

    /**
     * 投注注单量
     */
    @ApiModelProperty(value = "有效投注")
    private Integer betCount;

}
