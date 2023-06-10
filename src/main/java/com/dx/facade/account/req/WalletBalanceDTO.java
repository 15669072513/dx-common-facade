package com.dx.facade.account.req;

import com.dx.facade.enums.ConstantEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class WalletBalanceDTO<T> implements Serializable {

    @ApiModelProperty("三方唯一请求流水号")
    private Long serialNo;

    @ApiModelProperty("发生金额")
    private BigDecimal amount;

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

    /**
     * 按业务划分，需要记录不同的业务查询字段
     * 类似：hand - 手牌
     *             牌桌
     *             俱乐部
     */
    private T content;
}
