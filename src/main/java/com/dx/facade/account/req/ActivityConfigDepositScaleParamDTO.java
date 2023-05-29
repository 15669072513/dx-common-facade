package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 查询存款优惠配置 参数
 * @author admin
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigDepositScaleParamDTO {

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

}
