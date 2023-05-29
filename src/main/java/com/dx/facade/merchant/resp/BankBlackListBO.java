package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 银行卡黑名单对象
 *
 * @author harry
 * @date 2021/4/21 13:31
 */
@Data
@ApiModel(value = "com-ob-bank-resp-BankBlackBO", description = "银行卡黑名单对象")
public class BankBlackListBO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户编号")
    private Long merchantId;

    @ApiModelProperty(value = "卡号")
    private String cardNo;

}