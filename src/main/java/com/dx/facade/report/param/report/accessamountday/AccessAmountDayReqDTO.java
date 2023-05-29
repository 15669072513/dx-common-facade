package com.dx.facade.report.param.report.accessamountday;


import com.dx.facade.report.param.base.LocalDateRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessAmountDayReqDTO extends LocalDateRequest {

    @ApiModelProperty("用户类型(0=会员 1=代理) 枚举ConstantEnums.UserType")
    private Integer userType;

    @ApiModelProperty("商户Id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;
}
