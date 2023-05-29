package com.dx.facade.report.param.proxyoverview;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProxyOverviewCompareDataReqDTO {

    @ApiModelProperty(value = "查询月份", required = true, example = "202201")
    @NotNull(message = "查询月份不能为空")
    private Integer queryDate;

    @ApiModelProperty(value = "数据类型:\n" +
            "1=新注册存款金额\n" +
            "2=老用户存款金额\n" +
            "3=首存金额\n" +
            "4=总存款金额\n" +
            "5=投注金额\n" +
            "6=有效投注\n" +
            "7=游戏盈亏\n" +
            "8=新注册人数\n" +
            "9=老用户存款人数\n" +
            "10=首存人数\n" +
            "11=存款人数\n" +
            "12=取款人数\n" +
            "13=投注人数",
            required = true, example = "1")
    @NotNull(message = "数据类型不为空")
    private Integer dataType;
}
