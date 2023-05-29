package com.dx.facade.report.param.proxydayreport;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "com-ob-resp-report-ProxyDayReportDetailDTO", description = "代理报表详情对象")
public class ProxyDayReportDetailDTO implements Serializable {

    @ApiModelProperty(value = "日期，比如20210727")
    private Integer staticsDate;

    @ApiModelProperty(value = "存款总额")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "取款总额")
    private BigDecimal withdrawAmount;

    /** 代存会员总额 */
    @ApiModelProperty(value = "代存会员总额", example = "100.00")
    private BigDecimal insteadPlayerDepositAmount;

    /** 代理转账总额 */
    @ApiModelProperty(value = "代理转账总额", example = "100.00")
    private BigDecimal transferToPlayerAmount;

    /** 转入中心钱包总额 */
    @ApiModelProperty(value = "转入中心钱包总额", example = "100.00")
    private BigDecimal transferCenterWalletAmount;
}
