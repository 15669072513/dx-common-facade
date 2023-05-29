package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

/**
 * @Author: knox
 */
@Data
public class UserBankCardQureyParam {

    @ApiModelProperty(value = "商户id")
    @NotNull(message = "商户ID不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "会员账号")
    @Length(max = 15, message = "会员账号不能超过15个字符")
    private String userName;

    @ApiModelProperty(value = "查询银行卡或者虚拟币,1=银行卡账号, 2=虚拟币账号")
    private Integer type;

//    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）", required = true, example = "1")
//    private Integer dataType;
//
    //@ApiModelProperty(value = "会员id", required = true, example = "595608118717612032")
    //private Long userId;
//
//    @ApiModelProperty(value = "表后缀",hidden = true)
//    private Long tableSuffix;
//
//    @ApiModelProperty(value = "账号类型(0-会员 1-代理)",hidden = true)
//    private Integer accountType;
//
//    @ApiModelProperty(value = "绑定状态(0-待绑定 1-绑定中）")
//    private Integer bindStatus;
//
//    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）")
//    private Integer blacklistStatus;
}
