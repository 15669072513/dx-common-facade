package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ApiModel(value = "com-ob-dto-ProxyAssistCommissionBackParamDTO", description = "佣金转回")
public class ProxyAssistCommissionBackParamDTO {
    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "代理id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long proxyId;

    @NotNull(message = "账户类型(1=中心钱包，6=佣金钱包,7=额度钱包)不能为空")
    @ApiModelProperty(value = "账户类型(1=中心钱包，6=佣金钱包,7=额度钱包)", required = true, example = "7")
    private Integer bizType;

    @NotNull(message = "代存金额不能为空")
    @ApiModelProperty(value = "代存金额", required = true, example = "10")
    @Min(value = 0, message = "代存金额最小为0")
    private BigDecimal amount;

    @NotBlank(message = "支付密码不能为空")
    @ApiModelProperty(value = "支付密码", required = true)
    private String payPassword;
}
