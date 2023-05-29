package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author agan
 */
@Data
public class WithdrawOrderDTO {


    @ApiModelProperty(value="取款次数")
    private Integer withdrawNum;

    @ApiModelProperty(value="取款总金额")
    private BigDecimal withdrawSum;

}
