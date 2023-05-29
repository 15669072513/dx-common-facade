package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MinContractConfigRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long merchantId;
    @ApiModelProperty(value = "排序序号")
    private Integer contractSort;

    @ApiModelProperty(value = "游戏亏损")
    private BigDecimal gameLoss;

    @ApiModelProperty(value = "游戏流水")
    private BigDecimal gameFlow;

    @ApiModelProperty(value = "本月活跃人数")
    private Long monthActiveCount;

    @ApiModelProperty(value = "月有效活跃人数")
    private Long monthEffectiveActiveCount;

    @ApiModelProperty(value = "返佣比例")
    private BigDecimal rebateRatio;

    @ApiModelProperty(value = "契约类型 1:佣金契约 2:反点契约")
    private Integer contractType;

    @ApiModelProperty(value = "本月新增有效活跃人数", required = true)
    private Long monthAddActiveCount;


}
