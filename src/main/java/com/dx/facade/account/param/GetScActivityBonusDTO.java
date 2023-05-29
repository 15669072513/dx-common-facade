package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.exception.ErrorCode;
import com.dx.facade.account.service.BaseParmDTO;

import java.math.BigDecimal;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetScActivityBonusDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "活动id", required = true)
    private Long activityId;

    @ApiModelProperty(value = "用户id", required = true)
    private Long userId;
    
    @ApiModelProperty(value = "vip等级序号")
    private Integer vipLevel;
    
    @ApiModelProperty(value = "用户参加活动本金")
    private BigDecimal rechargeAmount;
    
    @Override
    public void check() {
            Assert.notNull(merchantId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("merchantId"));
            Assert.notNull(activityId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("activityId"));
            Assert.notNull(userId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("userId"));
            Assert.notNull(vipLevel, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("vipLevel"));
            Assert.notNull(rechargeAmount, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("rechargeAmount"));
    }
}
