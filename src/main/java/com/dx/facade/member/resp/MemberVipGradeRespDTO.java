package com.dx.facade.member.resp;

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
public class MemberVipGradeRespDTO {

    /**
     * id
     */
    @ApiModelProperty(value = "主键id")
    private Long id;

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户号id")
    private Long merchantId;

    /**
     * 序号（VIP等级）
     */
    @ApiModelProperty(value = "序号（VIP等级）")
    private String vipSerialNum;

    /**
     * VIP等级名称
     */
    @ApiModelProperty(value = "VIP等级名称")
    private String vipGradeName;

    /**
     * 升级条件累计存款(包含代充)
     */
    @ApiModelProperty(value = "升级条件累计存款(包含代充)")
    private BigDecimal totalDeposit;

    /**
     * 升级条件累计有效流水
     */
    @ApiModelProperty(value = "升级条件累计有效流水")
    private BigDecimal tatalValidWater;

    /**
     * 保级流水
     */
    @ApiModelProperty(value = "保级流水")
    private BigDecimal relegationWater;

    /**
     * 保级有效期（天）
     */
    @ApiModelProperty(value = "保级有效期（天）")
    private Integer relegationValidPeriod;

}
