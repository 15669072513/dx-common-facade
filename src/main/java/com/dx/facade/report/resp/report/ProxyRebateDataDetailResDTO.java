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
@ApiModel(value = "ProxyRebateDataDetailResDTO", description = "代理返点数据返回参数")
public class ProxyRebateDataDetailResDTO {

    @ApiModelProperty(value = "代理账号", example = "dzhy01")
    private String proxyName;
    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;
    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;
    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;
    @ApiModelProperty(value = "返点明细")
    List<ProxyRebateDataDetailItemDTO> list;
    private Long proxyId;
    private Integer reportDate;


}
