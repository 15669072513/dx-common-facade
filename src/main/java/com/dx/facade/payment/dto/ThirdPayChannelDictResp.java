package com.dx.facade.payment.dto;

import com.dx.annotation.I18nField;
import com.dx.facade.payment.enums.Payment;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 字典表
 *
 * @author harry
 * @date 2021/4/30 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThirdPayChannelDictResp {

    /**
     * code
     */
    @ApiModelProperty(value = "code")
    private String code;

    /**
     * 描述
     */
    @ApiModelProperty(value = "描述")
    @I18nField(i18nEnumClass = Payment.ThirdPayChannelEnum.class, i18nEnumMethod = "desc")
    private String description;
}
