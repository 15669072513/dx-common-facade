package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author grayson
 */
@Data
public class ArtificialAccountSubRespDTO {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("注册站点,详见AppIdEnum")
    private Integer appId;

    @ApiModelProperty("登录站点:详见AppIdEnum")
    private Integer loginAppId;

    @ApiModelProperty("订单号")
    private String eventId;

    @ApiModelProperty("申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime eventTime;

    @ApiModelProperty("用户id(会员/代理)")
    private Long userId;

    @ApiModelProperty("用户类型(0=会员 1=代理)")
    private Integer userType;

    @ApiModelProperty("账户类别，1-试玩，2-商务，3-正式，4-测试，5-置换")
    private Integer accountType;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("调整类型(1-人工充值 2-存款优惠 3,其他 详见枚举)")
    private Integer adjustType;

    @ApiModelProperty("币种")
    private String currency;

    @ApiModelProperty("钱包类型")
    private Integer walletType;

    @ApiModelProperty("调整金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty("申请操作人")
    private String operator;

    @ApiModelProperty("申请操作备注")
    private String remark;

    @ApiModelProperty(value = "图片地址")
    private String imageAddress;
}
