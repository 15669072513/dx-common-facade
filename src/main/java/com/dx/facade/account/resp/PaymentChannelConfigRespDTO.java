package com.dx.facade.account.resp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.annotation.I18nField;
import com.dx.facade.account.enums.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentChannelConfigRespDTO {
    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付通道名称")
    private String paymentChannelName;

    @ApiModelProperty("支付通道配置id")
    private Long paymentMerchantId;

    @ApiModelProperty("支付通道配置id")
    private Long paymentChannelId;

    @ApiModelProperty("支付类型名称")
    @I18nField(i18nEnumClass = Payment.DepositType.class, i18nEnumMethod = "desc")
    private String payName;

    @ApiModelProperty("使用状态/开关，0=隐藏/停用，1=展示/启用")
    private Integer status;

    @ApiModelProperty("对应信用等级")
    private String creditLevel;

    @ApiModelProperty("最后操作人")
    private String operator;

    @ApiModelProperty("最后操作时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty("权重")
    private Integer scale;

    @ApiModelProperty("综合权重")
    private BigDecimal weight;

    private String ext1;

    @ApiModelProperty("通道支持的银行卡")
    private String bankInfo;

    @ApiModelProperty("通道支持的虚拟币协议种类")
    private String virtualProtocol;

    @ApiModelProperty("用户类型 （0-会员 1-代理）")
    private Integer userType;

    @ApiModelProperty("支付商类型，1：充值商户，2：提款商户")
    private Integer paymentMerchantType;
}
