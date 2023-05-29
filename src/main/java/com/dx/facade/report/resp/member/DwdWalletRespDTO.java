package com.dx.facade.report.resp.member;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DwdWalletRespDTO {

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    /**
     * 币种
     */
    @ApiModelProperty(name = "币种")
    private String currency;

    /**
     * 账户余额
     */
    @ApiModelProperty(name = "账户余额")
    private BigDecimal balance;


}
