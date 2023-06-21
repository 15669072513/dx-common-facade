package com.dx.facade.report.param.report.profitandloss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "GameNetAmountRespDTO", description = "游戏盈亏统计天表")
public class GameNetAmountRespDTO extends VenueNetAmountDayRespDTO {

    @ApiModelProperty("游戏名称")
    private String gameName;


}