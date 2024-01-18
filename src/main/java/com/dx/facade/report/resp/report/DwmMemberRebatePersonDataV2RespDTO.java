package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class DwmMemberRebatePersonDataV2RespDTO {

    /**
     * 返水类型
     */
    @ApiModelProperty(value = "返水类型（1：代理，2平台）")
    private String platformFlag;

    @ApiModelProperty(value = "项目")
    private String venueName;

    /**
     * 个人返点
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount;

    /**
     * 发放返水比例
     */
    @ApiModelProperty(value = "发放返水比例")
    private BigDecimal rebateRatio;

    /**
     * 个人有效投注
     */
    @ApiModelProperty(value = "个人有效投注")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "个人抽水贡献")
    private BigDecimal totalPumpContribution;
}
