package com.dx.facade.merchant.resp;

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
public class ContractDetailRespDTO {

    @ApiModelProperty(value = "id")
    public Long id;

    @ApiModelProperty(value = "等级序号")
    private Integer level;

    @ApiModelProperty(value = "游戏亏损")
    private BigDecimal gameLoss;

    @ApiModelProperty(value = "游戏流水", required = true)
    private BigDecimal gameFlow;

    @ApiModelProperty(value = "本月活跃人数", required = true)
    private Long monthActiveCount;

    @ApiModelProperty(value = "月有效活跃人数", required = true)
    private Long monthEffectiveActiveCount;

    @ApiModelProperty(value = "返佣比例", required = true)
    private BigDecimal rebateRatio;

    @ApiModelProperty(value = "本月新增有效活跃人数", required = true)
    private Long monthAddActiveCount;


}
