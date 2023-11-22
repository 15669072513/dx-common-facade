package com.dx.facade.report.resp.proxynetamountday;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyVenueNetAmountDayRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyVenueNetAmountDayRespDTO {

    /** staticsDate */
    @ApiModelProperty(value = "日期", example = "20210901")
    private Integer staticsDate;

    /** betAmount */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /** betCount */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /** netAmount */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;


    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;


    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

}
