package com.dx.facade.payment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class WithdrawBankReqDTO {

//    /**
//     * 商户ID
//     */
//    @ApiModelProperty(value = "商户编号 (20)", required = true, hidden = true)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private Long merchantId;
//
//    /**
//     * 会员ID
//     */
//    @ApiModelProperty(value = "会员ID (20)", required = true, hidden = true)
//    @JsonFormat(shape = JsonFormat.Shape.STRING)
//    private Long userId;
//
//    /**
//     * 账号类型
//     */
//    @ApiModelProperty(value="账号类型 （0-会员 1-代理）", required = true, hidden = true)
//    private Integer accountType;

    /**
     * 持卡人姓名
     */
    @ApiModelProperty(value = "持卡人姓名 (20)", required = true)
    @NotBlank(message = "持卡人姓名不能为空")
    @Size(max = 20, message = "持卡人姓名长度不能超过15位！")
    private String cardholderName;

    /**
     * 银行名称
     */
    @ApiModelProperty(value = "银行名称 (64)", required = true)
    @NotBlank(message = "银行名称不能为空")
    @Size(max = 64, message = "银行名称长度不能超过64位！")
    private String bankName;

    /**
     * 银行编号
     */
    @ApiModelProperty(value = "银行编号 (16)", required = true)
    //@NotBlank(message = "银行编号不能为空")
    //@Size(max = 16, message = "银行编号长度不能超过16位！")
    private String bankCode;

    /**
     * 卡号
     */
    @ApiModelProperty(value = "银行卡号 (25)", required = true)
    @NotBlank(message = "银行卡号不能为空")
    @Digits(integer = 100_000_000, fraction = 0, message = "银行卡只能填写数字")
    @Size(max = 25, message = "银行卡号最多25个字符")
    private String cardNumber;

    /**
     * 开户省份
     */
    @ApiModelProperty(value = "开户省份 (50)")
    private String province;

    /**
     * 开户城市
     */
    @ApiModelProperty(value = "开户城市 (50)")
    private String city;


    /**
     * 开户行地址
     */
    @ApiModelProperty(value = "开户行地址 (50)", required = true)
    @NotBlank(message = "开户行地址不能为空")
    @Size(max = 50, message = "开户行地址长度不能超过50位！")
    private String bankAddress;

    @ApiModelProperty(value = "银行id", required = true)
    private Long bankId;


    private static final long serialVersionUID = 1L;

}
