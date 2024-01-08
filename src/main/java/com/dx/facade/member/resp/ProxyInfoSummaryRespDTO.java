package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyInfoSummaryRespDTO {


    @ApiModelProperty("累计返佣")
    private BigDecimal accumulatedCommission=BigDecimal.ZERO;

    @ApiModelProperty("累计返点")
    private BigDecimal accumulatedRebate=BigDecimal.ZERO;

    @ApiModelProperty("佣金钱包余额")
    private BigDecimal commissionBalance=BigDecimal.ZERO;

    @ApiModelProperty("额度钱包余额")
    private BigDecimal quotaBalance=BigDecimal.ZERO;

    @ApiModelProperty("下级代理人数")
    private Integer underProxyNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("直属下级代理人数")
    private Integer directlyUnderProxyNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("下级会员人数")
    private Integer underMemberNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("直属下级会员人数")
    private Integer directlyUnderMemberNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("累计存款金额")
    private BigDecimal totalDeposit=BigDecimal.ZERO;

    @ApiModelProperty("累计存款次数")
    private Integer totalDepositNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("累计提款金额")
    private BigDecimal totalWithdraw=BigDecimal.ZERO;

    @ApiModelProperty("累计普通提款次数")
    private Integer totalWithdrawNum=BigDecimal.ZERO.intValue();


    @ApiModelProperty(value = "信用钱包余额")
    private BigDecimal creditWalletBalance=BigDecimal.ZERO;

    @ApiModelProperty(value = "信用额度")
    private BigDecimal creditQuota=BigDecimal.ZERO;

    @ApiModelProperty(value = "现金余额")
    private BigDecimal centerWalletBalance=BigDecimal.ZERO;

    @ApiModelProperty(value = "应收账款")
    private BigDecimal accountsReceivable=BigDecimal.ZERO;

}
