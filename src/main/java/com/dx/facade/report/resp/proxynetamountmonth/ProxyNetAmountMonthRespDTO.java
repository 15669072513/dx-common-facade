package com.dx.facade.report.resp.proxynetamountmonth;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.dx.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * ProxyNetAmountMonthRespDTO
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountMonthRespDTO {

    @ApiModelProperty(value = "币种", example = "CNY")
    private String currency;

    /**
     * staticsDate
     */
    @ApiModelProperty(value = "月维度", example = "202109")
    private String staticsDate;

    @ApiModelProperty(value = "月维度", example = "2021-09")
    private String reportDate;

    /**
     * proxyId
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "代理id", example = "10001")
    private Long proxyId;

    /**
     * proxyName
     */
    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    @ApiModelProperty(value = "所属商户")
    private String merchantName;

    @ApiModelProperty(value = "主商户")
    private String topMerchantName;

    /**
     * accountType
     */
    @ApiModelProperty(value = "代理类型（1-正式，2-商务，3-置换）", example = "3")
    private Integer accountType;

    /**
     * parentProxyName
     */
    @ApiModelProperty(value = "上级代理账号", example = "string000")
    private String parentProxyName;

    @ApiModelProperty(value = "总代账号", example = "string000")
    private String topProxyName;

    /**
     * proxyLevel
     */
    @ApiModelProperty(value = "代理层级", example = "1")
    private Integer proxyLevel;

    /**
     * proxyLevelName
     */
    @ApiModelProperty(value = "代理层级", example = "1")
    private String proxyLevelName;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    /**
     * status
     */
    @ApiModelProperty(value = "状态", example = "string000")
    private Integer status;

    /**
     * windControlName
     */
    @ApiModelProperty(value = "风控层级名称", example = "1级")
    private String windControlName;

    /**
     * labelName
     */
    @ApiModelProperty(value = "代理标签", example = "标签1")
    private String labelName;

    /**
     * betAmount
     */
    @ApiModelProperty(value = "总投注", example = "1500.00")
    private BigDecimal betAmount;

    /**
     * validBetAmount
     */
    @ApiModelProperty(value = "总有效投注", example = "1500.00")
    private BigDecimal validBetAmount;
    /**
     * memberCount
     */
    @ApiModelProperty(value = "投注人数", example = "100")
    private Long memberCount;

    /**
     * betCount
     */
    @ApiModelProperty(value = "注单量", example = "200")
    private Long betCount;

    /**
     * netAmount
     */
    @ApiModelProperty(value = "会员总输赢", example = "1500.00")
    private BigDecimal netAmount;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点", example = "1500.00")
    private BigDecimal proxyRebatePoint;

    /**
     * proxyRebatePoint
     */
    @ApiModelProperty(value = "代理返点其他调整", example = "1500.00")
    private BigDecimal proxyArtificialPatchAmount;
    @Deprecated
    /** rebateAmount */
    @ApiModelProperty(value = "会员返水", example = "1500.00")
    private BigDecimal memberRebateAmount;

    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;

    /**
     * artificialPatchAmount
     */
    @ApiModelProperty(value = "会员账户调整", example = "1500.00")
    private BigDecimal memberArtificialPatchAmount;

    @ApiModelProperty(value = "场馆费用", example = "1500.00")
    private BigDecimal venueFee;

    @ApiModelProperty(value = "代理净输赢", example = "1500.00")
    private BigDecimal proxyNetwinAmount;

    @ApiModelProperty(value = "上期结余", example = "1500.00")
    private BigDecimal lastMonthBalance;


    @ApiModelProperty(value = "代理冲正输赢", example = "1500.00")
    private BigDecimal proxyRushNet;


    @ApiModelProperty(value = "直属会员总投注", example = "1500.00")
    private BigDecimal directBetAmount;

    @ApiModelProperty(value = "直属会员有效投注", example = "1500.00")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty(value = "直属会员总输赢/投注盈亏", example = "1500.00")
    private BigDecimal directNetAmount;

    @Deprecated
    @ApiModelProperty("直属返水金额=会员返水")
    private BigDecimal directRebateAmount;

    @ApiModelProperty("直属会员代理发放会员返水")
    private BigDecimal directRebateAmountByProxy;


    @ApiModelProperty("直属会员平台发放会员返水")
    private BigDecimal directRebateAmountByPlat;
    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    private BigDecimal directArtificialPatchAmount;



    @ApiModelProperty("直属会员代理发放会员返水--总控后台")
    private BigDecimal directMemberRebateAmountByProxy;
    @ApiModelProperty("直属会员平台发放会员返水--总控后台")
    private BigDecimal directMemberRebateAmountByPlat;
    @ApiModelProperty("直属会员净盈亏 = 直属会员投注盈亏+  直属会员返水（新的）+直属会员其他调整")
    private BigDecimal directNetwinAmount;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;

}
