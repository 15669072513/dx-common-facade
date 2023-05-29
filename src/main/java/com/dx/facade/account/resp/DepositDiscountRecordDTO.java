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
public class DepositDiscountRecordDTO {

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

    @ApiModelProperty("支付类型")
    @TableField("pay_type")
    private Integer payType;

    @ApiModelProperty("支付类型名称")
    @TableField("pay_type_name")
    private String payTypeName;

    @ApiModelProperty(value = "支付厂商")
    private String payMerchantName;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("优惠比例")
    @TableField("discount_rate")
    private BigDecimal discountRate;

    @ApiModelProperty("红利金额")
    @TableField("bonus_amount")
    private BigDecimal bonusAmount;

    @ApiModelProperty("币种")
    @TableField("currency")
    private String currency;

    @ApiModelProperty("订单号")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("发放时间")
    @TableField("event_time")
    private LocalDateTime eventTime;

    @ApiModelProperty("领取状态")
    @TableField("status")
    private Integer status;

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
