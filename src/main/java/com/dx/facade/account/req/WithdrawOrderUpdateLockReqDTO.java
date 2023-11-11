package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 提现订单锁单解锁REQ DTO
 * orbit
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawOrderUpdateLockReqDTO implements Serializable {

    private String lockAccount;
    private List<Integer> orderStatusList;
    private Integer userType;
    private Integer withdrawType;
}
