package com.dx.facade.account.req;

import com.dx.facade.account.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 邀请活动 query对象
 *
 * @author mading
 * @date 2022-03-22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInviteTaskQueryParam implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("邀请人账号")
    private String inviteUserName;

    @ApiModelProperty("被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty(value="存款金额-最小值",example = "10")
    private BigDecimal totalDepositAmountMin;

    @ApiModelProperty(value="存款金额-最大值",example = "1000")
    private BigDecimal totalDepositAmountMax;

    @ApiModelProperty("邀请人派奖状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期")
    private Integer inviteRewardStatus;

    @ApiModelProperty("被邀请人派奖状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期")
    private Integer inviteesRewardStatus;

    @ApiModelProperty("排序列：1-注册时间 2-首存时间 3-首存金额 4-累计存款金额 5-邀请人派奖时间 6-邀请人派奖状态 7-被邀请人派奖时间")
    private Integer orderKey;

    @ApiModelProperty("排序方式：desc-降序 asc-升序")
    private String orderType;

    @ApiModelProperty("查询状态： 1.注册时间 2.首存时间 3.被邀请人派奖时间 4.邀请人派奖时间")
    private Integer queryType;

    @ApiModelProperty(value = "查询时间-开始", example = "2021-06-01 00:00:00")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "查询时间-截止", example = "2021-06-16 23:59:59")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        if (Objects.nonNull(startTime) && Objects.isNull(endTime) || Objects.isNull(startTime) && Objects.nonNull(endTime)) {
            throw new IllegalArgumentException("开始时间或结束时间不能为空");
        }
        if (Objects.nonNull(startTime)) {
            if (startTime.isAfter(endTime)) {
                throw new IllegalArgumentException("开始日期不能在结束日期后");
            }
        }
    }
}
