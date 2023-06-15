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
@ApiModel(value = "ProfitDay", description = "场馆盈亏统计天表")
public class ProfitDay implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("日期,比如20210531")
    @TableField(value = "statics_date")
    private Integer staticsDate;

    @ApiModelProperty("投注人数")
    @TableField(value = "member_count")
    private Long memberCount;

    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("投注金额")
    @TableField("bet_amount")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    @TableField("valid_bet_amount")
    private BigDecimal validBetAmount;

    @ApiModelProperty("投注盈亏")
    @TableField("net_amount")
    private BigDecimal netAmount;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;


    @ApiModelProperty("资料创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}