package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Yinter
 */

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankManageDownParamDTO {

    @ApiModelProperty(value = "币种 CNY-人民币 VND-越南盾 THR-泰铢")
    private String currency;

    @ApiModelProperty(value = "商户号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
}
