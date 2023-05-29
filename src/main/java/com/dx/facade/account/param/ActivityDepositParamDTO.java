package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @Description: 会员活动上分专属通道
 */
@Data
public class ActivityDepositParamDTO implements BaseParmDTO {

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("会员ID")
    private Long userId;

    @ApiModelProperty("金额，精确到2位小数点，大于0")
    private BigDecimal amount;

    @ApiModelProperty("场馆代码")
    private String gameCode;

    @ApiModelProperty("活动ID")
    private Long activityId;

    @ApiModelProperty("活动类型：1=首存活动，2=vip晋级优惠")
    private Integer activityType;

   @ApiModelProperty("vip等级序号(vip晋级优惠活动id)")
    private Integer vipLevel;

    @ApiModelProperty(value = "申请设备号")
    private String deviceNo;

    @ApiModelProperty("终端[0:IOS_H5,1:IOS_APP,2:PC,3:Android_H5,5:Android_APP]")
    private Integer clientType;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.hasLength(merchantName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantName"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(gameCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("gameCode"));
        Assert.notNull(activityType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityType"));
        Assert.notNull(amount, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("amount"));
        if(Objects.equals(1, activityType)){
            Assert.notNull(activityId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityId"));
            Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        }else{
            Assert.notNull(vipLevel, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("vipLevel"));
        }
    }
}
