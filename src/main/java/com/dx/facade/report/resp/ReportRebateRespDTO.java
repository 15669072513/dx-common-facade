package com.dx.facade.report.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author gollum
 * @version 1.0.0
 * @title 返点报表查询接口响应数据传输对象
 * @desc
 * @dbType mysql
 * @dbTable ob_player.ob_proxy_rebate_d
 * ob_proxy_rebate_record
 * @since 2021年9月18日 上午00:34:35
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("返点报表查询接口响应数据传输对象")
public class ReportRebateRespDTO  {
    @ApiModelProperty(value = "代理id")
    private String proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理层级name")
    private String proxyLevel;

    @ApiModelProperty(value = "账号类型")
    private Integer accountType;


    @ApiModelProperty(value = "账号类型名称")
    private String accountTypeName;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyName;

    @ApiModelProperty(value = "顶级代理")
    private String topProxyName;

    @ApiModelProperty(value = "所属商户名称")
    private String merchantName;

    @ApiModelProperty(value = "顶级商户名称")
    private String topMerchantName;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "当前币种")
    private String currency;

    /**
     * 周期起始日期
     */
    @ApiModelProperty(value = "周期起始日期", example = "2021-09-06")
    private String cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty(value = "周期结束日期", example = "2021-09-12")
    private String cycleEndDate;

    /**
     * 返点人数
     * person_rebate_amount
     */
    @ApiModelProperty(value = "返点人数", example = "1100.00")
    private Integer rebateNumber;

    /**
     * 实际返点
     * person_rebate_amount
     */
    @ApiModelProperty(value = "返点金额", example = "1100.00")
    private BigDecimal personRebateAmount;

    /**
     * 返点发放，表中无对应字段，需计算，依据payout_status
     */
    @ApiModelProperty(value = "返点发放", example = "100.00")
    private BigDecimal distributeOfRebate;

    /**
     * 返点调整，表中无对应字段，需计算
     */
    @ApiModelProperty(value = "返点调整", example = "500")
    private BigDecimal adjustOfRebate;
}
