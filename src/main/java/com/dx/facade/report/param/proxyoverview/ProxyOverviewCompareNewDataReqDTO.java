package com.dx.facade.report.param.proxyoverview;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * .
 *
 * @author: Ellon
 * @date: 2023-12-21 13:27
 **/
@Data
public class ProxyOverviewCompareNewDataReqDTO {

    @ApiModelProperty(value = "本期结束时间", required = true, example = "20231206")
    @NotNull(message = "查询时间不能为空")
    private Integer queryDateStart;

    @ApiModelProperty(value = "本期开始时间", required = true, example = "20231209")
    @NotNull(message = "查询时间不能为空")
    private Integer queryDateEnd;

    @ApiModelProperty(value = "数据类型:\n" +
            "4=总存款金额\n" +
            "16=总取款额\n" +
            "6=有效投注\n" +
            "17=总返点\n" +
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
