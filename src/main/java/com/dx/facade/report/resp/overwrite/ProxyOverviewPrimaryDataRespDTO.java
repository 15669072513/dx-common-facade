//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.dx.facade.report.resp.overwrite;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@ApiModel(
    value = "ProxyOverviewPrimaryDataRespDTO",
    description = "代理预览核心数据"
)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyOverviewPrimaryDataRespDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("总投注")
    private BigDecimal betAmount;
    @ApiModelProperty("总投注环比")
    private BigDecimal betAmountMonthRate;
    @ApiModelProperty("游戏盈亏")
    private BigDecimal netAmount;
    @ApiModelProperty("游戏盈亏环比")
    private BigDecimal netAmountMonthRate;
    @ApiModelProperty("净输赢")
    private BigDecimal netWinAmount;
    @ApiModelProperty("净输赢环比")
    private BigDecimal netWinAmountMonthRate;
    @ApiModelProperty("预期佣金")
    private BigDecimal budgetCommissionAmount;
    @ApiModelProperty("新注册会员人数")
    private Integer newMemberNum;
    @ApiModelProperty("本月活跃")
    private Integer activeNum;
    @ApiModelProperty("有效活跃新增")
    private Integer effectActiveNumNew;

}
