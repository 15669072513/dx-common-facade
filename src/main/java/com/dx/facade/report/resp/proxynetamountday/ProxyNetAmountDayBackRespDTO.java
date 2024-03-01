package com.dx.facade.report.resp.proxynetamountday;

import com.alibaba.excel.annotation.ExcelProperty;
import com.dx.util.StringUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;

/**
 * ProxyNetAmountDayBackRespDTO
 * 中控后台-代理盈亏日-报表
 *
 * @author focus
 * @version 1.0.0
 * @since 2021年9月17日 下午3:34:58
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyNetAmountDayBackRespDTO {

    @ApiModelProperty(value = "币种", example = "CNY")
    private String currency;

    /**
     * staticsDate
     */
    @ApiModelProperty(value = "日维度", example = "20210921")
    private Integer staticsDate;

    @ApiModelProperty(value = "日维度", example = "2021-09-21")
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

    /**
     * loginLockStatus
     */
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

    @ApiModelProperty("会员净输赢金额")
    private BigDecimal memberNetwinAmount;
    @Deprecated
    @ApiModelProperty("会员返水金额,调整为代理发放返水及平台发放返水字段")
    private BigDecimal memberRebateAmount;


    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;
    @ApiModelProperty("会员其他调整金额")
    private BigDecimal memberArtificialPatchAmount;


    @ApiModelProperty("直属投注人数")
    //@TableField("direct_member_count")
    private Long directMemberCount;

    @ApiModelProperty("直属注单数")
    //@TableField("direct_bet_count")
    private Long directBetCount;

    @ApiModelProperty("直属投注额")
    //@TableField("direct_bet_amount")
    private BigDecimal directBetAmount;

    @ApiModelProperty("直属有效投注额")
    //@TableField("direct_valid_bet_amount")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty("直属输赢金额")
    //@TableField("direct_net_amount")
    private BigDecimal directNetAmount;

    @Deprecated
    @ApiModelProperty("直属返水金额=会员返水，调整为直属会员代理发放返水，直属会员平台发放返水")
    //@TableField("direct_rebate_amount")
    private BigDecimal directRebateAmount;


    @ApiModelProperty("直属会员代理发放会员返水")
    private BigDecimal directMemberRebateAmountByProxy;


    @ApiModelProperty("直属会员平台发放会员返水")
    private BigDecimal directMemberRebateAmountByPlat;

    @ApiModelProperty("直属其他调整=人工加减额中的其他调整额")
    //@TableField("direct_artificial_patch_amount")
    private BigDecimal directArtificialPatchAmount;

    @ApiModelProperty("直属会员净输赢")
    private BigDecimal directNetwinAmount;

    @ApiModelProperty("服务费-局抽")
    private BigDecimal serviceChargeRound;
}
