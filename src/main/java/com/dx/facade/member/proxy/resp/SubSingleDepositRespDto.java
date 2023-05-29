package com.dx.facade.member.proxy.resp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 代理 单笔存款限制
 *
 * @author yinter
 * @version 1.0.0
 * @date 2021/9/1
 */
@Data
@ApiModel("下级单笔存款限制返回对象")
public class SubSingleDepositRespDto extends SingleDepositRespDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当日存款限制金额")
    private BigDecimal dayDepositAmount;


}
