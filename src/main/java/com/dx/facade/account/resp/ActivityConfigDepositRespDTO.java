package com.dx.facade.account.resp;

import com.dx.annotation.I18nField;
import com.dx.facade.account.enums.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityConfigDepositRespDTO {
    
    
    @ApiModelProperty(value = "主键")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "支付商户配置ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long paymentChannelId;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付通道")
    private String paymentChannelName;

    @ApiModelProperty("支付类型")
    @I18nField(i18nEnumClass = Payment.DepositType.class)
    private String payName;

    @ApiModelProperty("优惠比例百分比")
    private BigDecimal discountScale;

    @ApiModelProperty("每日最高优惠(元)")
    private BigDecimal maxQuota;

    @ApiModelProperty("状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty(value = "更新时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;
}
