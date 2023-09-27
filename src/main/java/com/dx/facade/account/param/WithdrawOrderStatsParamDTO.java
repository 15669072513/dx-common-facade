package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员/代理提款记录入参", description = "会员/代理提款记录入参")
@ToString
public class WithdrawOrderStatsParamDTO implements Serializable {


    @ApiModelProperty("用户类型（0=会员/1=代理）")
    private Integer userType;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("申请时间开始")
    private LocalDateTime eventTimeStart;
    @ApiModelProperty("账单周期开始试驾")
    private LocalDateTime billStartTime;
}
