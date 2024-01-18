package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("会员返水数据总计返回")
public class DwmMemberRebateDataTotalRespDTO {

    @ApiModelProperty("个人返点")
    protected BigDecimal rebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("德州-俱乐部个人返水")
    protected BigDecimal rebateAmountDxClub = BigDecimal.ZERO;

    @ApiModelProperty("真人个人返水")
    protected BigDecimal rebateAmountZr = BigDecimal.ZERO;

    @ApiModelProperty("体育个人返水")
    protected BigDecimal rebateAmountTy = BigDecimal.ZERO;

    @ApiModelProperty("电竞个人返水")
    protected BigDecimal rebateAmountDj = BigDecimal.ZERO;

    @ApiModelProperty("棋牌个人返水")
    protected BigDecimal rebateAmountQp = BigDecimal.ZERO;

    @ApiModelProperty("彩票个人返水")
    protected BigDecimal rebateAmountCp = BigDecimal.ZERO;

}
