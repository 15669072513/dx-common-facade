package com.dx.facade.merchant.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class WindControlLevelIdReqDTO {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户id集合",hidden = true)
    private List<Long> merchantIdIds;

    @ApiModelProperty(value = "风控类型 (0-查询全部 1-风险会员，2-风险代理，3-风险银行卡，4-风险虚拟账号，5-风险IP，6-风险终端号 )", required = true)
    @NotNull(message = "风控类型不能为空")
    @Min(value = 0, message = "风控类型最小只能是0")
    @Max(value = 6, message = "风控类型最最大只能是6")
    private Integer windControlType;

}
