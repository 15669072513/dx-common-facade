package com.dx.facade.report.resp.membergrade;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Description 会员等级累计流水和充值金额
 * @Author Carlos
 * @Date 2022/2/7 16:06
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberVipDepositTurnoverRespDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "VIP累积存款")
    private BigDecimal cumulativeDeposit;

    @ApiModelProperty(value = "VIP累积流水")
    private BigDecimal cumulativeTurnover;

    @ApiModelProperty(value = "VIP保级流水")
    private BigDecimal relegationTurnover;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDt;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime modifyDt;
}
