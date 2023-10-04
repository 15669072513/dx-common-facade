package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理中心-会员/代理提款记录详情", description = "会员/代理提款记录详情")
public class ClientWithdrawOrderRespVO {

    @ApiModelProperty("我方订单号")
    private String eventId;

    @ApiModelProperty("取款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("取款方式，1.银行卡，2.虚拟币")
    private Integer withdrawType;

    @ApiModelProperty("银行名称")
    private String bankName;

    @ApiModelProperty("用户id(会员或代理id)")
    private Long userId;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("银行卡号")
    private String bankcardNo;

    @ApiModelProperty("usdt提款协议类型，1.omni，2.erc20, 3.trc20")
    private Integer usdtType;

    @ApiModelProperty("usdt提款地址")
    private String usdtAddress;

    @ApiModelProperty("用户提款金额")
    @TableField("order_amount")
    private BigDecimal orderAmount;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("实际到账金额")
    private BigDecimal realAmount;

}
