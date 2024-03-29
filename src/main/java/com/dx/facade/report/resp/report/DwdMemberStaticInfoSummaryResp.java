package com.dx.facade.report.resp.report;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 会员列表》会员统计》全量统计
 */
@ApiModel(description = "会员统计全量统计小计/汇总对象")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DwdMemberStaticInfoSummaryResp {

    @ApiModelProperty("首存金额")
    protected BigDecimal firstDepositAmount= BigDecimal.ZERO;
    @ApiModelProperty("首存时间")
    protected String firstDepositTime;
    @ApiModelProperty("总存款")
    protected BigDecimal depositAmount= BigDecimal.ZERO;
    @ApiModelProperty("存款次数")
    protected Integer depositTimes;
    @ApiModelProperty("总取款")
    protected BigDecimal withdrawAmount= BigDecimal.ZERO;
    @ApiModelProperty("取款次数")
    protected Integer withdrawTimes;
    @ApiModelProperty("存取差")
    protected BigDecimal depositWithdrawDifferAmount= BigDecimal.ZERO;
    @ApiModelProperty("注单量")
    protected Long betCount = 0L;
    @ApiModelProperty("投注金额")
    protected BigDecimal betAmount= BigDecimal.ZERO;
    @ApiModelProperty("有效投注")
    protected BigDecimal validBetAmount= BigDecimal.ZERO;
    @ApiModelProperty("投注盈亏")
    protected BigDecimal netAmount= BigDecimal.ZERO;
    @ApiModelProperty("返水金额")
    protected BigDecimal returnWaterAmount= BigDecimal.ZERO;
    @ApiModelProperty("优惠总额")
    protected BigDecimal discountAmount= BigDecimal.ZERO;
    @ApiModelProperty("其他调整")
    protected BigDecimal otherAdjustAmount= BigDecimal.ZERO;
    @ApiModelProperty("净盈亏")
    protected BigDecimal netProfit= BigDecimal.ZERO;
    @ApiModelProperty("上级转入")
    protected BigDecimal proxyAssistDepositAmount= BigDecimal.ZERO;
    @ApiModelProperty("转入次数")
    protected Long proxyAssistDepositTimes= 0L;
    @ApiModelProperty("佣金转回")
    protected BigDecimal proxyTransferInnerAmount= BigDecimal.ZERO;
    @ApiModelProperty("转回次数")
    protected Long proxyTransferInnerTimes= 0L;
    @ApiModelProperty("转代次数")
    protected Long switchProxyCount= 0L;

    @ApiModelProperty("代理上分金额")
    protected BigDecimal proxyUpAmount= BigDecimal.ZERO;
    @ApiModelProperty("代理上分次数")
    protected Long proxyUpTimes= 0L;
    @ApiModelProperty("代理下分金额")
    protected BigDecimal proxyDownAmount= BigDecimal.ZERO;
    @ApiModelProperty("代理下分次数")
    protected Long proxyDownTimes= 0L;



    @ApiModelProperty("代理授信上分金额")
    protected BigDecimal proxyCreditUpAmount = BigDecimal.ZERO;
    @ApiModelProperty("代理授信上分次数")
    protected Long proxyCreditUpTimes = 0L;
    @ApiModelProperty("代理授信下分金额")
    protected BigDecimal proxyCreditDownDmount = BigDecimal.ZERO;
    @ApiModelProperty("代理授信下分次数")
    protected Long proxyCreditDownTimes = 0L;
    @ApiModelProperty("授信差")
    private BigDecimal proxyCreditDifferAmount;
    @ApiModelProperty("返点金额")
    protected BigDecimal rebateAmount = BigDecimal.ZERO;

    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy= BigDecimal.ZERO;
    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat= BigDecimal.ZERO;
    @ApiModelProperty("代理充值上分金额")
    protected BigDecimal proxyCashUpAmount = BigDecimal.ZERO;
    @ApiModelProperty("代理充值上分次数")
    protected Long proxyCashUpTimes = 0L;
    @ApiModelProperty("代理提现下分金额")
    protected BigDecimal proxyCashDownAmount = BigDecimal.ZERO;
    @ApiModelProperty("代理提现下分金额")
    protected Long proxyCashDownTimes = 0L;

    // 代还
    @ApiModelProperty("代理帮信用还款总额")
    protected BigDecimal proxyHelpCreditRepayAmount = BigDecimal.ZERO;
    @ApiModelProperty("代理帮信用还款次数")
    protected Long proxyHelpCreditRepayTimes = 0L;


    /**
     * 净盈亏 = 投注盈亏+反水盈亏+优惠金额+其他金额
     *
     * @return
     */
//    public BigDecimal getNetProfit() {
//        if (Objects.isNull(netAmount)
//                || Objects.isNull(returnWaterAmount)
//                || Objects.isNull(discountAmount)
//                || Objects.isNull(otherAdjustAmount)) {
//            return null;
//        }
//        return netAmount.add(returnWaterAmount).add(discountAmount).add(otherAdjustAmount);
//    }

    @ApiModelProperty("冲提差")
    private BigDecimal proxyCashDifferAmount;
    @ApiModelProperty("注册数")
    private Integer registerCount;
    @ApiModelProperty("活跃数")
    private Integer activeCount;
    @ApiModelProperty("有效新增人数")
    private Integer validUserCount;
    @ApiModelProperty("投注人数")
    private Integer betUserCount;
}
