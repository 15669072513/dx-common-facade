package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDiscountRecordDTO {

    @ApiModelProperty("主键ID")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty("商户id")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    @TableField("merchant_name")
    private String merchantName;

    @ApiModelProperty("用户类型(0=会员 1=代理)")
    @TableField("user_type")
    private Integer userType;

    @ApiModelProperty("用户id(会员或代理id)")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("vip等级")
    @TableField("vip_level")
    private Integer vipLevel;

    @ApiModelProperty("订单号")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("发放时间")
    @TableField("event_time")
    private LocalDateTime eventTime;

    @ApiModelProperty("领取方式")
    @TableField("receive_type")
    private Integer receiveType;

    @ApiModelProperty("领取状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("活动类型")
    @TableField("activity_type")
    private Integer activityType;

    @ApiModelProperty("活动id")
    @TableField("activity_id")
    private Long activityId;

    @ApiModelProperty("优惠金额")
    @TableField("amount")
    private BigDecimal amount;

    @ApiModelProperty("币种")
    @TableField("currency")
    private String currency;

    @ApiModelProperty("领取时间")
    @TableField("receive_time")
    private LocalDateTime receiveTime;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

}
