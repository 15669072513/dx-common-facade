package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "账变记录列表统计", description = "账变记录列表统计")
public class WalletDetailBalanceSumDTO implements Serializable {

    @ApiModelProperty(value = "按天统计，key为日期，格式yyyy-MM-dd，value参见字段注释说明")
    private Map<String, WalletDetailTexasSumDTO> daySumMap = new HashMap<>();
    @ApiModelProperty(value = "按天统计，key为日期，格式yyyy-MM-dd，value参见字段注释说明")
    private BigDecimal inTotalAmount = BigDecimal.ZERO;
    @ApiModelProperty(value = "按天统计，key为日期，格式yyyy-MM-dd，value参见字段注释说明")
    private BigDecimal outTotalAmount = BigDecimal.ZERO;
}
