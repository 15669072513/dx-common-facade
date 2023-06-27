package com.dx.facade.report.resp;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("游戏盈亏列表返回对象")
public class GameNetAmountRespDTO extends GameNetAmountSummaryRespDTO {

    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty(value = "商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("日期，比如20210531")
    private Integer staticsDate;

    @ApiModelProperty("游戏ID")
    private String gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameTypeName;

    @ApiModelProperty("场馆编号")
    private String gameCode;

    @ApiModelProperty("场馆名称")
    private String venueName;


}
