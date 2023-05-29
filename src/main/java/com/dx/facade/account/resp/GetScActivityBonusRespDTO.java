package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetScActivityBonusRespDTO {
    
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "活动红利金额")
    private BigDecimal bonusAmount;
    
    @ApiModelProperty(value = "红利比例")
    private BigDecimal validPresent;
    
    @ApiModelProperty(value = "流水倍数")
    private Integer validMultiple;
    
    @ApiModelProperty(value = "流水金额 (本金 + bonusAmount红利) * 流水倍数")
    private BigDecimal billAmount;

    @ApiModelProperty(value = "活动名称")
    private String name;

    @ApiModelProperty(value = "活动主标题")
    private String title;

    @ApiModelProperty(value = "活动页签ID")
    private Long tagId;

    @ApiModelProperty(value = "活动页签名称")
    private String tagName;

    @ApiModelProperty(value = "活动模板 1-首存活动 3-纯展示页活动")
    private Integer activityType;
}
