package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * <p>
 * 代理盈亏统计月表
 * </p>
 *
 * @author Candice
 * @since 2022-10-03
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("dwm_proxy_net_amount_month")
@ApiModel(value = "DwmProxyNetAmountMonthPO对象", description = "代理盈亏统计月表")
public class DwmProxyNetAmountMonthPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableField(value = "id")
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    @TableField("merchant_name")
    private String merchantName;

    @ApiModelProperty("商户路径")
    @TableField("merchant_path")
    private String merchantPath;


    @ApiModelProperty("顶级商户ID")
    @TableField("top_merchant_id")
    private Long topMerchantId;

    @ApiModelProperty("顶级商户名称")
    @TableField("top_merchant_name")
    private String topMerchantName;

    @ApiModelProperty("日期年月，比如202105")
    @TableField(value = "statics_date")
    private Integer staticsDate;

    @ApiModelProperty("代理id")
    @TableField("proxy_id")
    private Long proxyId;

    @ApiModelProperty("代理等级")
    @TableField("proxy_level")
    private Long proxyLevel;

    @ApiModelProperty("代理等级")
    @TableField("proxy_tag")
    private Long proxyTag;

    @ApiModelProperty("代理账号")
    @TableField("proxy_name")
    private String proxyName;

    @ApiModelProperty("代理层级路径（代理账号）")
    @TableField("proxy_path_username")
    private String proxyPathUsername;

    @ApiModelProperty("上级代理id")
    @TableField("parent_proxy_id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理账号")
    @TableField("parent_proxy_name")
    private String parentProxyName;

    @ApiModelProperty("上级代理路径")
    @TableField("parent_proxy_path")
    private String parentProxyPath;

    @ApiModelProperty("顶级代理id")
    @TableField("top_proxy_id")
    private Long topProxyId;

    @ApiModelProperty("顶级代理账号")
    @TableField("top_proxy_name")
    private String topProxyName;

    @ApiModelProperty("币种")
    @TableField("currency")
    private String currency;

    @ApiModelProperty("投注人数")
    @TableField("member_count")
    private Long memberCount;

    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("总投注")
    @TableField("bet_amount")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注额")
    @TableField("valid_bet_amount")
    private BigDecimal validBetAmount;

    @ApiModelProperty("会员总输赢金额")
    @TableField("net_amount")
    private BigDecimal netAmount;



    @ApiModelProperty("其他调整=人工加减额中的其他调整额")
    @TableField("artificial_patch_amount")
    private BigDecimal artificialPatchAmount;


    @ApiModelProperty("代理返点")
    @TableField("proxy_rebate_point")
    private BigDecimal proxyRebatePoint;

    @ApiModelProperty("直属投注人数")
    @TableField("direct_member_count")
    private Long directMemberCount;

    @ApiModelProperty("直属注单数")
    @TableField("direct_bet_count")
    private Long directBetCount;

    @ApiModelProperty("直属投注额")
    @TableField("direct_bet_amount")
    private BigDecimal directBetAmount;

    @ApiModelProperty("直属有效投注额")
    @TableField("direct_valid_bet_amount")
    private BigDecimal directValidBetAmount;

    @ApiModelProperty("直属输赢金额")
    @TableField("direct_net_amount")
    private BigDecimal directNetAmount;

    @ApiModelProperty("直属投注盈亏")
    @TableField("direct_real_amount")
    private BigDecimal directRealAmount;


    @ApiModelProperty("资料创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
