package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderListByIpOrDeviceNoParamDTO {

    @ApiModelProperty(value = "商户id",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIdList;

    @ApiModelProperty(value = "用户类型(0=会员 1=代理)",hidden = true)
    private Integer userType;

    @ApiModelProperty(value = "提款IP",example = "0.0.0.0")
    private String customerIp;

    @ApiModelProperty(value = "提款设备号")
    private String deviceNo;

}
