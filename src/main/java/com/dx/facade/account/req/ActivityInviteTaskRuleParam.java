package com.dx.facade.account.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@ApiModel(value="ActivityInviteTaskRuleParam对象", description="好友邀请活动配置入参")
public class ActivityInviteTaskRuleParam {

    @ApiModelProperty("存款金额(首存或累计）")
    @DecimalMin(value = "0", message = "存款金额不能为负数")
    @Digits(integer = 9,fraction = 2, message = "存款金额最大9个字符，保留小数点后两位")
    @NotNull(message = "存款金额(首存或累计）不能为空")
    private BigDecimal depositAmount;

    @ApiModelProperty("邀请人数")
    @DecimalMin(value = "0", message = "邀请人数不能为负数")
    @Digits(integer = 9,fraction = 0, message = "邀请人数最大9个字符")
    private Integer inviteNum;

    @ApiModelProperty("邀请人奖励礼金或比例")
    @DecimalMin(value = "0", message = "邀请人奖励礼金或比例不能为负数")
    @Digits(integer = 9,fraction = 2, message = "邀请人奖励礼金或比例最大9个字符，保留小数点后两位")
    @NotNull(message = "邀请人奖励礼金或比例不能为空")
    private BigDecimal inviteRewardAmount;

    @ApiModelProperty("被邀请人奖励礼金或比例")
    @DecimalMin(value = "0", message = "被邀请人奖励礼金或比例不能为负数")
    @Digits(integer = 9,fraction = 2, message = "被邀请人奖励礼金或比例最大9个字符，保留小数点后两位")
    private BigDecimal inviteesRewardAmount;

    @ApiModelProperty("流水（倍）")
    @Min(value = 0, message = "流水（倍）不能为负数")
    @NotNull(message = "流水（倍）不能为空")
    private Integer validMultiple;

}
