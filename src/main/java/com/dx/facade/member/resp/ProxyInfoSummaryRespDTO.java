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
    private BigDecimal accumulatedCommission;

    @ApiModelProperty("累计返点")
    private BigDecimal accumulatedRebate;

    @ApiModelProperty("佣金钱包余额")
    private BigDecimal commissionBalance;

    @ApiModelProperty("额度钱包余额")
    private BigDecimal quotaBalance;

    @ApiModelProperty("下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty("直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty("下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty("直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty("累计存款金额")
    private BigDecimal totalDeposit;

    @ApiModelProperty("累计存款次数")
    private Integer totalDepositNum;

    @ApiModelProperty("累计提款金额")
    private BigDecimal totalWithdraw;

    @ApiModelProperty("累计普通提款次数")
    private Integer totalWithdrawNum;


    @ApiModelProperty(value = "信用钱包余额")
    private BigDecimal creditWalletBalance;

    @ApiModelProperty(value = "信用额度")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "现金余额")
    private BigDecimal centerWalletBalance;

    @ApiModelProperty(value = "应收账款")
    private BigDecimal accountsReceivable;

}
