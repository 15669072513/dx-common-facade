package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 每日盈亏统计天表
 * </p>
 *
 * @author Candice
 * @since 2022-09-21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dwm_net_amount_day")
@ApiModel(value = "DwmNetAmountDayPO对象", description = "每日盈亏统计天表")
public class DwmNetAmountDayPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableField(value = "id")
    private Long id;

    @ApiModelProperty("日期,比如20210531")
    @TableField("statics_date")
    private Integer staticsDate;

    @ApiModelProperty("商户id")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("投注人数")
    @TableField("member_count")
    private Long memberCount;

    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("投注额")
    @TableField("bet_amount")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注额")
    @TableField("valid_bet_amount")
    private BigDecimal validBetAmount;

    @ApiModelProperty("输赢金额")
    @TableField("net_amount")
    private BigDecimal netAmount;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
