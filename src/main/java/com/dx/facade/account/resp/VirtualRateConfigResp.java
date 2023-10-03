package com.dx.facade.account.resp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.annotation.I18nField;
import com.dx.facade.account.enums.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 虚拟币汇率配置表
 * </p>
 *
 * @author Jackma
 * @since 2022-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VirtualRateConfigResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("业务类型，1会员存款，2会员取款，3代理存款，4代理取款")
    private Integer bizType;

    @ApiModelProperty("业务类型名称，1会员存款，2会员取款，3代理存款，4代理取款")
    @I18nField(i18nEnumClass = Payment.VirtualRateBizType.class, i18nEnumMethod = "desc")
    private String bizName;

    @ApiModelProperty("币种类型")
    private String currency;

    @ApiModelProperty("汇率")
    private BigDecimal rate;

    @ApiModelProperty("浮动汇率")
    private BigDecimal floatRate;

    @ApiModelProperty("三方汇率")
    private BigDecimal thirdRate = BigDecimal.ZERO;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("更新时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;


}
