package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author rebuy
 */
@Setter
@Getter
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="德信数据日报对象", description="德信日报")
public class DxReportDResp implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("类别：0-官方，1-代理")
    private String dataType;
    @ApiModelProperty(value = "日期,比如20210531")
    private Integer reportDate;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "授信额度(万)")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "新增授信额度(万)")
    private BigDecimal newCreditQuota;

    @ApiModelProperty(value = "提款金额(万)")
    private BigDecimal withdrawAmount;

    @ApiModelProperty(value = "充值金额(万)")
    private BigDecimal depositAmount;

    @ApiModelProperty(value = "总借款额度(万)")
    private BigDecimal loanAmount;

    @ApiModelProperty(value = "新增借款额度(万)")
    private BigDecimal newLoanAmount;

    @ApiModelProperty(value = "应收账款(万)")
    private BigDecimal shouldRepaymentAmount;

    @ApiModelProperty(value = "应付账款(万)")
    private BigDecimal shouldPaymentAmount;

    @ApiModelProperty(value = "新增有效用户数(个)")
    private Integer newEffectiveNum;

    @ApiModelProperty(value = "活跃用户数(个)")
    private Integer activeNum;

    @ApiModelProperty(value = "总有效投注额(万)")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "场馆输赢金额(万)")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "会员返水(万)")
    private BigDecimal memberRebateAmount;

    @ApiModelProperty(value = "代理返点(万)")
    private BigDecimal proxyRebateAmount;

    @ApiModelProperty(value = "平台收入(万)")
    private BigDecimal platformIncomeAmount;

}
