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
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfoSummaryRespDTO {


    @ApiModelProperty("首存金额")
    private BigDecimal firstDeposit=BigDecimal.ZERO;


    @ApiModelProperty("现金余额")
    private BigDecimal balance=BigDecimal.ZERO;


    @ApiModelProperty("累计存款金额")
    private BigDecimal totalDeposit=BigDecimal.ZERO;

    @ApiModelProperty("累计存款次数")
    private Integer totalDepositNum=BigDecimal.ZERO.intValue();

    @ApiModelProperty("累计提款金额")
    private BigDecimal totalWithdraw=BigDecimal.ZERO;

    @ApiModelProperty("累计普通提款次数")
    private Integer totalWithdrawNum=BigDecimal.ZERO.intValue();


    @ApiModelProperty("可用额度")
    private BigDecimal creditAvailable=BigDecimal.ZERO;

    @ApiModelProperty("信用额度")
    private BigDecimal creditBalance=BigDecimal.ZERO;

    @ApiModelProperty(value = "信用钱包-应还账款")
    private BigDecimal creditShouldRepayment=BigDecimal.ZERO;
    
}
