package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 人工减额请求参数
 * @author grayson
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateArtificialAccountSubParmDTO implements BaseParmDTO {

    @ApiModelProperty(value = "商户id",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty(value = "用户id",required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "用户类型(0=会员 1=代理)",required = true, example = "0")
    @NotNull(message = "业务类型不能为空")
    private Integer userType;

    @ApiModelProperty(value = "调整类型 详见CbdEnums.CbdMemberAdjustType",required = true, example = "1")
    @NotNull(message = "调整类型不能为空")
    private Integer adjustType;

    @ApiModelProperty("钱包类型")
    private Integer walletType;

    @ApiModelProperty("会员活动id")
    private Long activityId;

    @ApiModelProperty("活动类型，1=首存活动，2=充值送活动，3=VIP晋级优惠")
    private Integer activityType;

    @ApiModelProperty("福利类型，1会员VIP奖励，2好友邀请")
    private Integer welfareType;

    @ApiModelProperty("奖励类型 (会员VIP奖励：1.上半月红包 2.下半月红包 3.升级礼金 4.生日礼金 )")
    private Integer awardType;

    @ApiModelProperty(value = "操作金额",required = true, example = "10")
    @NotNull(message = "操作金额不能为空")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "操作人",required = true, example = "admin")
    @NotNull(message = "操作人不能为空")
    private String operator;

    @ApiModelProperty(value = "单号",required = true, example = "orderNo")
    @NotNull(message = "单号不能为空")
    private String eventId;

    @ApiModelProperty(value = "操作时间", required = true, example = "2021-06-18 19:12:14")
    @NotNull(message = "操作时间")
    private LocalDateTime eventTime;

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
        Assert.hasLength(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.hasLength(eventId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.hasLength(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
    }
}
