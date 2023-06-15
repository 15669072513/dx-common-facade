package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "VenueProfitDay", description = "场馆盈亏统计天表")
public class VenueProfitDay implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("日期,比如20210531")
    @TableField(value = "statics_date")
    private Integer staticsDate;

    @ApiModelProperty("场馆名称")
    private String venueName;
    @ApiModelProperty("场馆类型")
    private String venueType;

    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("投注人数")
    @TableField(value = "member_count")
    private Long userCount;

    @ApiModelProperty("投注金额")
    @TableField("bet_chip")
    private BigDecimal betChip;

    @ApiModelProperty("有效投注")
    @TableField("pumping_chip")
    private BigDecimal pumpingChip;

    @ApiModelProperty("盈亏金额")
    @TableField("net_chip")
    private BigDecimal netChip;

    @ApiModelProperty("会员盈利率")
    private BigDecimal memberProfitRate;


    @ApiModelProperty("资料创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}