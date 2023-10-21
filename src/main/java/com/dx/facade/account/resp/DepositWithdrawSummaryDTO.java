package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Dealer
 * @description: 充提汇总信息
 * @date 2023/10/7
 * @copyright 
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepositWithdrawSummaryDTO implements Serializable {

    @ApiModelProperty("存款总额")
    private BigDecimal depositTotal;

    @ApiModelProperty("存款次数")
    private Integer depositTimes;

    @ApiModelProperty("最近一笔存款")
    private BigDecimal lastDeposit;

    @ApiModelProperty("大额存款次数")
    private Integer bigDepositTimes;

    @ApiModelProperty("取款总额")
    private BigDecimal withdrawTotal;

    @ApiModelProperty("取款次数")
    private Integer withdrawTimes;

    @ApiModelProperty("最近一笔取款")
    private BigDecimal lastWithdraw;

    @ApiModelProperty("大额取款次数")
    private Integer bigWithdrawTimes;

}
