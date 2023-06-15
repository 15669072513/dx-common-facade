package com.dx.facade.account.req;

import java.io.Serializable;
import java.math.BigDecimal;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class WalletBalanceDTO<T> implements Serializable {

	private static final long serialVersionUID = -2464195843194814131L;


	@ApiModelProperty("三方唯一请求流水号")
    private String serialNo;

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
