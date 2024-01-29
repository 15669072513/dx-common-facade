package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("会员个人返水明细返回")
public class DwmMemberRebatePersonDataReqDTO {
    /**
     * 报表日期
     */
    @ApiModelProperty(value = "报表日期")
    private String reportDate;

    /**
     * 个人返点
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "派发状态 (0-待发放 1-已发放 2-无返水 3-已取消)")
    private Integer rebateType;

    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号")
    private String memberName;

    @ApiModelProperty(value = "返水类型结果集")
    private List<DwmMemberRebatePersonDataV2RespDTO> platformFlagRebate;
}
