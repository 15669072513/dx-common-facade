package com.dx.facade.account.req;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * 人工加额
 * @author grayson
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateArtificialAccountAddParmDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "业务类型(0=会员 1=代理)",required = true, example = "1")
    @NotNull(message = "业务类型不能为空")
    private Integer userType;

    @ApiModelProperty(value = "用户id",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "调整类型 详见CbdEnums.CbdMemberAdjustType",required = true)
    @NotNull(message = "操作类型不能为空")
    private Integer adjustType;

    @ApiModelProperty(value = "钱包类型 详见WalletType",required = true)
    @NotNull(message = "钱包类型不能为空")
    private Integer walletType;

    @ApiModelProperty(value = "福利类型。(1.会员VIP奖励)")
    @Min(value = 1 ,message = "福利类型最小不能小于1")
    @Max(value = 2 ,message = "福利类型最大不能大于2")
    private Integer welfareType;

    @ApiModelProperty(value = "奖励类型。(会员VIP奖励：1.上半月红包 2.下半月红包 3.升级礼金 4.生日礼金 ；好友邀请：5.邀请任务 6.存款任务 7.投注任务")
    @Min(value = 1 ,message = "奖励类型最小不能小于1")
    @Max(value = 32 ,message = "奖励类型最大不能大于7")
    private Integer awardType;

    @ApiModelProperty(value = "活动类型[ 1：首存活动、2、充值送活动、3、VIP晋级优惠。。]")
    private Integer activityType;

    @ApiModelProperty(value = "活动id, 活动配置表的主键id", example = "1254")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long activityId;

    @ApiModelProperty(value = "流水倍数要求", example = "12")
    @Min(value = 0, message = "流水倍数必须大于等于0")
    private BigDecimal validMultiple;

    @ApiModelProperty(value = "操作金额",required = true, example = "10")
    @NotNull(message = "操作金额不能为空")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "操作人",required = true, example = "admin")
    @NotNull(message = "操作人不能为空")
    private String operator;

    @ApiModelProperty(value = "单号",required = true, example = "orderNo")
    @NotNull(message = "单号不能为空")
    private String eventId;

    @ApiModelProperty(value = "备注",required = true, example = "example")
    @NotNull(message = "备注不能为空")
    private String remark;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userType"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(adjustType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("adjustType"));
        Assert.state(Objects.nonNull(adjustAmount) && adjustAmount.compareTo(BigDecimal.ZERO) > 0,
                ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("adjustAmount"));
        Assert.state(Objects.nonNull(validMultiple) && validMultiple.compareTo(BigDecimal.ZERO) >= 0,
                ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("validMultiple"));
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.hasLength(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.hasLength(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
    }
}
