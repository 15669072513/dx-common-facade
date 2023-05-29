package com.dx.facade.account.param;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChangeLockStatusParam {

    @ApiModelProperty("要锁定的订单id")
    private long id;

    @ApiModelProperty("锁定状态，0：解锁，1：锁定")
    private int lockStatus;

    @ApiModelProperty("锁单人账号")
    private String lockAccount;

    @ApiModelProperty("锁单人用户id")
    private long lockAccountId;

}
