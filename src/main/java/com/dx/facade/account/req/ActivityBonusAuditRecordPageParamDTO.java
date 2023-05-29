package com.dx.facade.account.req;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import org.springframework.util.Assert;

import com.dx.facade.enums.ActivityEnums;
import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityBonusAuditRecordPageParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIdList;

    @ApiModelProperty(value = "账号", example = "abc123456")
    private String userName;

    @ApiModelProperty(value="红利金额-最小值",example = "10")
    private BigDecimal bounsAmountMin;

    @ApiModelProperty(value="红利金额-最大值",example = "1000")
    private BigDecimal bounsAmountMax;

    @ApiModelProperty(value = "订单号", example = "4544654647")
    private String eventId;

    @ApiModelProperty(value = "申请时间-开始", required = true, example = "2021-06-16 00:00:00")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty(value = "申请时间-截止", required = true, example = "2021-06-16 23:59:59")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty(value = "订单状态：5-一审拒绝，6-二审拒绝，7-审核通过", example = "1")
    private Integer orderStatus;

    @Override
    public void check() {
        Assert.notNull(merchantIdList, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantIdList"));
        Assert.notNull(eventTimeStart, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventTimeStart"));
        Assert.notNull(eventTimeEnd, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventTimeEnd"));
        if(Objects.nonNull(orderStatus)
                && !orderStatus.equals(ActivityEnums.ActivityBonusAuditStatus.一审拒绝.code())
                && !orderStatus.equals(ActivityEnums.ActivityBonusAuditStatus.二审拒绝.code())
                && !orderStatus.equals(ActivityEnums.ActivityBonusAuditStatus.审核通过.code())
        ){
            throw new IllegalArgumentException("orderStatus参数不正确");
        }
    }
}
