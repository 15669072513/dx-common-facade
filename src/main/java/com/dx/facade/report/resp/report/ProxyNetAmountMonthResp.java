package com.dx.facade.report.resp.report;

import com.dx.util.StringUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthResp
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthResp {

    /** staticsDate */
    @ApiModelProperty(value = "月份", example = "202109")
    private String staticsDate;

    public String getStaticsDate() {
        if (StringUtil.isEmpty(staticsDate) || staticsDate.length() < 6) {
            return staticsDate;
        }
        return staticsDate.substring(0, 4) + "-" + staticsDate.substring(4, 6);
    }

    /** proxyId */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "代理id", example = "10001")
    private Long proxyId;

    /** proxyName */
    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    /** accountType */
    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）", example = "3")
    private Integer accountType;

    /** parentProxyName */
    @ApiModelProperty(value = "上级代理账号", example = "string000")
    private String parentProxyName;

    /** proxyLevel */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "代理层级", example = "1")
    private Integer proxyLevel;

    /** proxyLevelName */
    @ApiModelProperty(value = "代理层级", example = "1")
    private String proxyLevelName;

    /** loginLockStatus */
    @ApiModelProperty(value = "登入锁状态", example = "string000")
    private Integer loginLockStatus;

    /** accountLockStatus */
    @ApiModelProperty(value = "账号锁定状态", example = "string000")
    private Integer accountLockStatus;

    /** status */
    @ApiModelProperty(value = "状态", example = "string000")
    private Integer status;

    /** windControlName */
    @ApiModelProperty(value = "风控层级名称", example = "1级")
    private String windControlName;

    /** labelName */
    @ApiModelProperty(value = "代理标签", example = "标签1")
    private String labelName;

    /** betAmount */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /** validBetAmount */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;

    /** flowCorrection */
    @ApiModelProperty(value = "流水纠正", example = "1500.00")
    private BigDecimal flowCorrection;

    /** memberCount */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    /** betCount */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /** netAmount */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;

    /** venueFee */
    @ApiModelProperty(value = "场馆费", example = "1500.00")
    private BigDecimal venueFee;

    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal rebateAmount;

    /** discountAmount */
    @ApiModelProperty(value = "会员优惠", example = "1500.00")
    private BigDecimal discountAmount;

    /** proxyRebatePoint */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /** artificialPatchAmount */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal artificialPatchAmount;

    /** repairBetAmount */
    @ApiModelProperty(value = "补单输赢", example = "1500.00")
    private BigDecimal repairBetAmount;

    /** proxyNet */
    @ApiModelProperty(value = "代理商净输赢", example = "1500.00")
    private BigDecimal proxyNet;

    /** lastMonthBalance */
    @ApiModelProperty(value = "上月结余", example = "1500.00")
    private BigDecimal lastMonthBalance;

    /** rushNet */
    @ApiModelProperty(value = "冲正后输赢", example = "1500.00")
    private BigDecimal rushNet;

    /** directBetAmount */
    @ApiModelProperty(value = "直属会员总投注", example = "1500.00")
    private BigDecimal directBetAmount;

    /** directValidBetAmount */
    @ApiModelProperty(value = "直属会员有效投注", example = "1500.00")
    private BigDecimal directValidBetAmount;

    /** directNetAmount */
    @ApiModelProperty(value = "直属会员总输赢", example = "1500.00")
    private BigDecimal directNetAmount;

    /** directProfitAmount */
    @ApiModelProperty(value = "直属会员净输赢", example = "1500.00")
    private BigDecimal directProfitAmount;
}
