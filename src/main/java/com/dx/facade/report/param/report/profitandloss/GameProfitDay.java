package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "GameProfitDay", description = "游戏盈亏统计天表")
public class GameProfitDay extends VenueProfitDay {

    @ApiModelProperty("游戏名称")
    private String gameName;


}