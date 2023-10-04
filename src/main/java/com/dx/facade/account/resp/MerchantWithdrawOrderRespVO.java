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
@ApiModel(value = "中控后台-会员/代理提款记录详情", description = "会员/代理提款记录详情")
public class MerchantWithdrawOrderRespVO {

    @ApiModelProperty("我方订单号")
    private String eventId;

    @ApiModelProperty("取款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("代理账号名称")
    private String agentUserName;

    @ApiModelProperty("代理账号")
    private Long agentUserId;

    @ApiModelProperty("账号类型")
    private Integer accountType;

    @ApiModelProperty("所属商户")
    private String headerMerchantName;

    @ApiModelProperty("银行卡号")
    private String bankCardNo;

    @ApiModelProperty("银行名称+银行支行")
    private String bankName;

    @ApiModelProperty("银行开户地址")
    private String bankAddress;

    @ApiModelProperty("持卡人")
    private String cnName;

    @ApiModelProperty("提款IP风控层级名称")
    private Long windControlId;

    @ApiModelProperty("虚拟币种类")
    private String virtualKind;

    @ApiModelProperty("虚拟币账号地址")
    private String usdtAddress;

    @ApiModelProperty("usdt提款协议类型，1.omni，2.erc20, 3.trc20")
    private Integer usdtType;
}
