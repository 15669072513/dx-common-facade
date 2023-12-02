package com.dx.facade.account.param;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LoanRepayRecordParam implements BaseParmDTO {

    @Getter
    @Setter
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @Getter
    @Setter
    @ApiModelProperty(value = "用户id")
    private Long userId;

    @Getter
    @Setter
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @Getter
    @Setter
    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;


    @Getter
    @Setter
    @ApiModelProperty(value = "用户类型 0会员,1代理")
    private Integer userType;

    @Getter
    @Setter
    @ApiModelProperty(value = "借还款订单号")
    private String recordId;

    @Getter
    @Setter
    @ApiModelProperty(value = "借还类型 1借款记录,2还款记录")
    private Integer recordType;


    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
    }

}
