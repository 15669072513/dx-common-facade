package com.dx.facade.account.req;

import com.dx.facade.enums.ConstantEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WalletBalanceDetailDTO implements Serializable {

    @ApiModelProperty("唯一ID")
    private Long id;

    @ApiModelProperty("三方唯一请求流水号")
    private Long serialNo;

    @ApiModelProperty("前金额")
    private BigDecimal beforeAmount;

    @ApiModelProperty("发生金额")
    private BigDecimal changeAmount;

    @ApiModelProperty("后金额")
    private BigDecimal afterAmount;

    /**
     * @see com.dx.facade.account.enums.Subject
     */
    @ApiModelProperty("发生科目")
    private String subject;

    @ApiModelProperty("用户id")
    private Long userId;

    /**
     * @see ConstantEnums.UserType
     */
    @ApiModelProperty("用户类型")
    private Integer userType;

    @ApiModelProperty("发生时间")
    private Long createTime;
}
