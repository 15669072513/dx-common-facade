package com.dx.facade.member.proxy.resp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 代理 佣金提款限制
 *
 * @author yinter
 * @version 1.0.0
 * @date 2021/9/1
 */
@Data
@ApiModel("佣金提款限制返回对象")
public class WithdrawalRestrictionsRespDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "提款金额最小金额")
    private BigDecimal minWithdrawalRestrictions;

    @ApiModelProperty(value = "提款金额最小金额")
    private BigDecimal maxWithdrawalRestrictions;

    @ApiModelProperty(value = "当日提款限制金额")
    private BigDecimal dayWithdrawalRestrictions;


}
