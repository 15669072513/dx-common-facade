package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.report.basic.UserBasicVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data

//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "MemberGameProfitDay", description = "会员盈亏统计天表")
public class UserGameProfitDay extends UserBasicVo {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("日期,比如20210531")
    @TableField(value = "statics_date")
    private Integer staticsDate;

    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("有效投注")
    @TableField("pumping_chip")
    private BigDecimal pumpingChip;

    // 会员输赢
    @ApiModelProperty("盈亏金额")
    @TableField("net_chip")
    private BigDecimal netChip;

    @ApiModelProperty("净盈亏")
    private BigDecimal readProfit;

    @ApiModelProperty("资料创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

}