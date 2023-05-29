package com.dx.facade.payment.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
public class BankCardParmDTO {
 
	/**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    
    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户编号")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "会员ID 不能为空")
    private Long userId;
    
    /**
     * 用户类型
     */
    @ApiModelProperty(value = "用户类型", required = true)
    @NotNull(message = "用户类型 不能为空")
    private Integer userType;

    /**
     * 户主
     */
    @ApiModelProperty(value = "户主")
    private String cnName;
    
    /**
     * 银行名称
     */
    @ApiModelProperty(value = "银行名称")
    private String bankName;
    
    /**
     * 银行编号
     */
    @ApiModelProperty(value = "银行编号")
    private String bankCode;
    
    /**
     * 卡号
     */
    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "真实名称")
    private String realName;

    /**
     * 开户省份
     */
    @ApiModelProperty(value = "开户省份")
    private String province;

    @ApiModelProperty(value = "用户名",required = true)
    @NotNull(message = "用户名不能为空")
    private String userName;

    @ApiModelProperty(value = "开户城市")
    private String city;

    @ApiModelProperty(value = "银行支行地址")
    private String bankAddress;


    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）")
    private Integer blacklistStatus;

    @ApiModelProperty(value = "绑定状态（0-未绑定 1-已绑定）")
    private Integer bindStatus;
    	
    @ApiModelProperty(value = "备注")
    private String remark;
    
    @ApiModelProperty(value = "最后一次提款时间")
    private LocalDateTime lastWithdrawalTime;

}
