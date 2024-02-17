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
@ApiModel("会员返水数据返回")
public class DwmMemberRebateDataRespDTO {

    @ApiModelProperty("返水周期")
    private Integer staticsDate;
    @ApiModelProperty(value = "会员ID")
    private String memberId;
    @ApiModelProperty(value = "会员账号")
    private String memberName;
    @ApiModelProperty(value = "直属代理账号")
    private String parentProxyName;
    @ApiModelProperty(value = "总代账号")
    private String topProxyName;
    @ApiModelProperty("个人返点")
    private BigDecimal rebateAmount = BigDecimal.ZERO;
    @ApiModelProperty("德州-俱乐部个人返水")
    private BigDecimal rebateAmountDxClub = BigDecimal.ZERO;

    @ApiModelProperty("真人个人返水")
    private BigDecimal rebateAmountZr = BigDecimal.ZERO;

    @ApiModelProperty("体育个人返水")
    private BigDecimal rebateAmountTy = BigDecimal.ZERO;

    @ApiModelProperty("电竞个人返水")
    private BigDecimal rebateAmountDj = BigDecimal.ZERO;

    @ApiModelProperty("棋牌个人返水")
    private BigDecimal rebateAmountQp = BigDecimal.ZERO;

    @ApiModelProperty("彩票个人返水")
    private BigDecimal rebateAmountCp = BigDecimal.ZERO;

}
