package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员/代理充值订单表AndroidAPP
 * </p>
 *
 * @author libai
 * @since 2022-09-25
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "充值订单详情", description = "充值订单详情")
public class DepositOrderRespDTO implements Serializable {

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

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty("充值客户端类型")
    @TableField("app_type")
    private Integer appType;

    @ApiModelProperty("存款ip")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("存款IP风控层级名称")
    @TableField("ip_wind_control")
    private String ipWindControl;

    @ApiModelProperty("设备号")
    @TableField("device_no")
    private String deviceNo;

    @ApiModelProperty("设备号风控层级名称")
    @TableField("device_no_wind_control")
    private String deviceNoWindControl;

    @ApiModelProperty("信用等级")
    @TableField("credit_level")
    private Integer creditLevel;

    @ApiModelProperty("订单号")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("第三方订单编号")
    @TableField("third_order_no")
    private String thirdOrderNo;

    @ApiModelProperty("支付的大类型(Payment.DepositType),1=银行卡,2=信用卡,3=虚拟币,4=支付宝,5=微信,6=其他")
    @TableField("pay_type")
    private Integer payType;

    @ApiModelProperty("子支付方式枚举，ThirdPaymentChannelEnum")
    @TableField("sub_pay_type")
    private Integer subPayType;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("充值类型,1:会员充值，17: 代理中心钱包")
    @TableField("biz_type")
    private Integer bizType;

    @ApiModelProperty("订单金额")
    @TableField("order_amount")
    private BigDecimal orderAmount;

    @ApiModelProperty("实付金额")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("币种")
    @TableField("currency")
    private String currency;

    @ApiModelProperty("订单状态,DepositOrderStatus")
    @TableField("order_status")
    private Integer orderStatus;

    @ApiModelProperty("申请时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("到账时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    @ApiModelProperty("请求三方商户支付的配置id")
    @TableField("config_id")
    private Long configId;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty("银行id")
    private Long bankId;

    @ApiModelProperty("银行名称")
    private String bankName;

    @ApiModelProperty("虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty("厂商名称")
    private String payMerchantName;

    @ApiModelProperty("USDT人民币汇率")
    private BigDecimal usdtRate;

    @ApiModelProperty("usdt协议类型，1.omni，2.erc20, 3.trc20")
    @TableField("receive_usdt_type")
    private Integer receiveUsdtType;

    @ApiModelProperty("收款方usdt地址")
    @TableField("receive_usdt_address")
    private String receiveUsdtAddress;

    @ApiModelProperty("收款方银行名称")
    @TableField("receive_bank_name")
    private String receiveBankName;

    @ApiModelProperty("收款方真实姓名")
    @TableField("receive_real_name")
    private String receiveRealName;

    @ApiModelProperty("收款方银行账号")
    @TableField("receive_bankcard_no")
    private String receiveBankcardNo;

    @ApiModelProperty(value = "收款方银行支行地址")
    @TableField("receive_bank_address")
    private String receiveBankAddress;

    @ApiModelProperty(value = "通道id")
    private Long channelId;
}
