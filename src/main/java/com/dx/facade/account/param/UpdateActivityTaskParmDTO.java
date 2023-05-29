package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.util.Objects;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateActivityTaskParmDTO implements BaseParmDTO {

    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "完成流水状态[0：未完成，1：已完成]")
    private Integer billStatus;

    @ApiModelProperty(value = "完成流水金额")
    private BigDecimal completeBillAmount;

    @ApiModelProperty(value = "流水要求金额,增量")
    private BigDecimal billAmount;

    @ApiModelProperty(value = "近似最后投注时间")
    private Long approxLastBetTime;

    @ApiModelProperty(value = "场馆CODE")
    private String gameCode;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @Override
    public void check() {
        if(Objects.isNull(activityId)){
            Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
            Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
            Assert.notNull(billStatus, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("billStatus"));
        }
    }
}
