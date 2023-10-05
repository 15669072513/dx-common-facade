package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
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
@ApiModel(value = "会员/代理提款记录详情", description = "会员/代理提款记录详情")
public class WithdrawOrderRespDTO {

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

    /*@ApiModelProperty("提交取款的操作者真实姓名")
    private String currentUserRealName;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("信用等级")
    private Integer creditLevel;

    @ApiModelProperty("提款客户端类型")
    @TableField("app_type")
    private Integer appType;*/
    @ApiModelProperty("信用等级")
    private Integer creditLevel;

    @ApiModelProperty("提款客户端类型")
    @TableField("app_type")
    private Integer appType;

    @ApiModelProperty("我方订单号")
    @TableField("event_id")
    private String eventId;

    @ApiModelProperty("出款账号id")
    @TableField("account_id")
    private Long accountId;

    @ApiModelProperty("调整类型：1会员提现下分")
    private Integer adjustType;

    @ApiModelProperty("第三方订单号")
    @TableField("third_order_no")
    private String thirdOrderNo;

    @ApiModelProperty("提款ip")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("提款IP风控层级名称")
    @TableField("ip_wind_control")
    private String ipWindControl;

    @ApiModelProperty("设备号")
    @TableField("device_no")
    private String deviceNo;

    @ApiModelProperty("设备号风控层级名称")
    @TableField("device_no_wind_control")
    private String deviceNoWindControl;

    @ApiModelProperty("提款类型，1.银行卡，2.虚拟币")
    @TableField("withdraw_type")
    private Integer withdrawType;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("用户提款金额")
    @TableField("order_amount")
    private BigDecimal orderAmount;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("实际到账金额")
    @TableField("real_amount")
    private BigDecimal realAmount;

    @ApiModelProperty("usdt提款协议类型，1.omni，2.erc20, 3.trc20")
    @TableField("usdt_type")
    private Integer usdtType;

    @ApiModelProperty("usdt提款地址")
    @TableField("usdt_address")
    private String usdtAddress;

    @ApiModelProperty("usdt:人民币的汇率")
    @TableField("usdt_rate")
    private BigDecimal usdtRate;

    @ApiModelProperty("真实姓名")
    @TableField("real_name")
    private String realName;

    @ApiModelProperty("银行开户行名称")
    @TableField("bank_name")
    private String bankName;

    @ApiModelProperty("银行卡号")
    @TableField("bankcard_no")
    private String bankcardNo;

    @ApiModelProperty("订单状态")
    @TableField("order_status")
    private Integer orderStatus;

    @ApiModelProperty("客户端状态 0.处理中 1.成功 2.失败")
    @TableField("client_status")
    private Integer clientStatus;

    @ApiModelProperty("申请时间")
    @TableField("event_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("到账时间")
    @TableField("pay_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime payTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("请求三方商户支付的配置id")
    @TableField("config_id")
    private Long configId;

    @ApiModelProperty("提款城市")
    @TableField("withdraw_ip_city")
    private String withdrawIpCity;

    @ApiModelProperty("是否首提,0:不是，1:是")
    @TableField("first_Withdraw_status")
    private Integer firstWithdrawStatus;

    @ApiModelProperty("是否大额,0:不是，1:是")
    @TableField("big_withdraw")
    private Integer bigWithdraw;

    @ApiModelProperty("锁单状态(0=未锁单 1=锁单中)")
    @TableField("lock_status")
    private Integer lockStatus;

    @ApiModelProperty("当前锁单时间")
    @TableField("lock_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lockTime;

    @ApiModelProperty("锁单人")
    @TableField("lock_account")
    private String lockAccount;

    @ApiModelProperty("锁单人id")
    @TableField("lock_account_id")
    private Long lockAccountId;

    @ApiModelProperty("一审审核人")
    @TableField("audit1_operator")
    private String audit1Operator;

    @ApiModelProperty("一审审核结果(1=通过 2=拒绝)")
    @TableField("audit1_result")
    private Integer audit1Result;

    @ApiModelProperty("一审审核时间")
    @TableField("audit1_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit1Time;

    @ApiModelProperty("一审审核备注")
    @TableField("audit1_desc")
    private String audit1Desc;

    @ApiModelProperty("一审客户端备注")
    @TableField("client_audit1_desc")
    private String clientAudit1Desc;

    @ApiModelProperty("一审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit1_cost")
    private Integer audit1Cost;

    @ApiModelProperty("二审审核人")
    @TableField("audit2_operator")
    private String audit2Operator;

    @ApiModelProperty("二审审核结果(1=通过 2=拒绝)")
    @TableField("audit2_result")
    private Integer audit2Result;

    @ApiModelProperty("二审审核时间")
    @TableField("audit2_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit2Time;

    @ApiModelProperty("二审审核备注")
    @TableField("audit2_desc")
    private String audit2Desc;

    @ApiModelProperty("二审客户端备注")
    @TableField("audit2_client_desc")
    private String audit2ClientDesc;

    @ApiModelProperty("二审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit2_cost")
    private Integer audit2Cost;

    @ApiModelProperty("三审审核人")
    @TableField("audit3_operator")
    private String audit3Operator;

    @ApiModelProperty("三审审核结果(1=通过 2=拒绝)")
    @TableField("audit3_result")
    private Integer audit3Result;

    @ApiModelProperty("三审审核时间")
    @TableField("audit3_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime audit3Time;

    @ApiModelProperty("三审审核备注")
    @TableField("audit3_desc")
    private String audit3Desc;

    @ApiModelProperty("三审客户端备注")
    @TableField("audit3_client_desc")
    private String audit3ClientDesc;

    @ApiModelProperty("三审审核时长，秒，锁单到审核完毕的耗时")
    @TableField("audit3_cost")
    private Integer audit3Cost;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty("虚拟币种类")
    private String virtualKind;

    @ApiModelProperty("当前累计存款/取款次数，用于做是否首存和首提")
    private Integer currentSequence;

    @ApiModelProperty("确认/取消出款人")
    private String confirmOperator;

    @ApiModelProperty("确认/取消出款结果(1=确认出款 2=取消出款)")
    private Integer confirmResult;

    @ApiModelProperty("确认/取消出款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime confirmTime;

    @ApiModelProperty("确认/取消出款备注")
    private String confirmDesc;

    @ApiModelProperty("确认/取消出款客户端备注")
    private String confirmClientDesc;

    @ApiModelProperty("银行id")
    private Long bankId;

    @ApiModelProperty(value = "支付厂商")
    private String payMerchantName;

    @ApiModelProperty(value = "提款手续费")
    private BigDecimal withdrawFee;
}
