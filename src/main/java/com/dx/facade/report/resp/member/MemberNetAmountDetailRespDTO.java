package com.dx.facade.report.resp.member;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountDetailRespDTO {

    @ApiModelProperty("日期")
    private String staticsDate;
    
    @ApiModelProperty("上级代理Id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long parentProxyId;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("注单量")
    private Long betCount= 0L;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("投注金额")
    private BigDecimal betAmount=BigDecimal.ZERO;

    @ApiModelProperty("有效投注")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("投注盈亏")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("返水金额")
    private BigDecimal rebateAmount=BigDecimal.ZERO;
    @ApiModelProperty("代理发放会员返水")
    private BigDecimal memberRebateAmountByProxy;


    @ApiModelProperty("平台发放会员返水")
    private BigDecimal memberRebateAmountByPlat;
    @ApiModelProperty("优惠金额")
    private BigDecimal discountAmount=BigDecimal.ZERO;

    @ApiModelProperty("调整金额")
    private BigDecimal artificialPatchAmount=BigDecimal.ZERO;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit=BigDecimal.ZERO;

    // 会员盈利率=投注盈亏/投注金额
    @ApiModelProperty(value = "会员盈利率")
    private BigDecimal netRate=BigDecimal.ZERO;

    /**
     * 会员盈利率=投注盈亏/投注金额
     *
     * @return
     */
    @ApiModelProperty("会员盈利率")
    public BigDecimal getNetRate() {
        if(betAmount==null||betAmount.compareTo(BigDecimal.ZERO)==0){
            return BigDecimal.ZERO;
        }
        MathContext mc = new MathContext(2, RoundingMode.HALF_DOWN);
        return  netAmount.divide(betAmount, mc);
    }


}
