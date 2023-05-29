package com.dx.facade.payment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * @Description: 虚拟币提款添加封装参数
 */
@Data
@ApiModel(value = "com-ob-client-dto-params-payment-req-CreateVirtualReqDTO", description = "虚拟币提款")
public class CreateVirtualReqDTO implements Serializable {

    @NotNull(message = "提款金额不能为空")
    @ApiModelProperty(value = "提款金额", required = true)
    private BigDecimal orderAmount;

    /**
     * 别名
     */
    @ApiModelProperty(value = "别名 (8)")
//    @NotBlank(message = "别名不能为空")
//    @Length(max = 8, message = "别名长度不能超过8位！")
    private String realName;
    
    /**
     * 虚拟币账户
     */
    @ApiModelProperty(value = "虚拟币账户 (100)", required = true)
    @NotBlank(message = "虚拟币账户不能为空")
    @Pattern(regexp = "^[A-Za-z0-9]{4,100}$", message = "请输入不超过100位数字+字母的虚拟币账户")
    @Length(min = 4, max = 100, message = "虚拟币账户不能低于4位并且不可超过100位！")
    private String virtualAddress;
    
    /**
     * 虚拟币种类
     */
    @ApiModelProperty(value = "虚拟币种类 (16)", required = true)
    @NotBlank(message = "虚拟币种类不能为空")
    @Length(max = 16, message = "虚拟币种类不能超过16位！")
    private String virtualKind;
    
    /**
     * 虚拟币协议
     */
    @ApiModelProperty(value = "虚拟币协议 (16)", required = true)
    @NotBlank(message = "虚拟币协议不能为空")
    @Length(max = 16, message = "虚拟币协议不能超过16位！")
    private String virtualProtocol;

    private static final long serialVersionUID = 1L;
}