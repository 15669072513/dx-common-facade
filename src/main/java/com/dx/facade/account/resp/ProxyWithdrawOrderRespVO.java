package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value = "代理后台-会员/代理提款记录详情", description = "会员/代理提款记录详情")
public class ProxyWithdrawOrderRespVO {

    @ApiModelProperty("我方订单号")
    private String eventId;

    @ApiModelProperty("取款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("客户端状态 0.处理中 1.成功 2.失败")
    private Integer clientStatus;

    @ApiModelProperty("取款方式，1.银行卡，2.虚拟币")
    private Integer withdrawType;

    @ApiModelProperty("取款信息")
    private String withdrawInfo;

    @ApiModelProperty("取款账户")
    private String withdrawAccount;

    @ApiModelProperty("用户取款金额CNY")
    private BigDecimal orderAmountCNY;

    @ApiModelProperty("用户取款金额USDT")
    private BigDecimal orderAmountUSDT;

    @ApiModelProperty("CNY手续费")
    private BigDecimal withdrawFeeCNY;

    @ApiModelProperty("USDT手续费")
    private BigDecimal withdrawFeeUSDT;

    @ApiModelProperty("备注")
    private String remark;


}
