package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubmitPayRespDTO {

//    @ApiModelProperty("标识是否使用webview这样的浏览器内核加载，0:不使用，1:使用")
//    private Integer frontLoadFlag;

    @ApiModelProperty(value = "状态码")
    private Integer code;

    @ApiModelProperty(value = "API处理结果说明")
    private String msg;

    @ApiModelProperty("标识是否使用webview这样的浏览器内核加载，  1=内容是html内容，0=http链接跳转")
    private Integer frontLoadFlag;

    @ApiModelProperty("第三方支付返回的结果")
    private String response;
    @ApiModelProperty("订单编号")
    private String eventId;
    @ApiModelProperty("三方商户号")
    private String thirdPayId;

}
