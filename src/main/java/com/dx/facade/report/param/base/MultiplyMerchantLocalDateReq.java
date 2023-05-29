package com.dx.facade.report.param.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Objects;

/**
 * 多商户日期分页请求对象
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MultiplyMerchantLocalDateReq extends LocalDateRequest implements MultiplyMerchantAble {
    @ApiModelProperty(value = "商户Id，可为空", required = true, example = "12223")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

}
