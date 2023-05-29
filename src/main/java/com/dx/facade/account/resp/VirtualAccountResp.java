package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class VirtualAccountResp {

    @ApiModelProperty(value = "ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类")
    private String virtualKind;

    @ApiModelProperty(value = "虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty(value = "0-禁用，1-可用")
    private Integer status;

    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）")
    private Integer blacklistStatus;

    @ApiModelProperty(value = "绑定状态（0-待绑定 1-绑定中）")
    private Integer bindStatus;

    @ApiModelProperty(value = "绑定账号次数")
    private Integer bindNum;

    @ApiModelProperty(value = "绑定会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "绑定会员账号")
    private String userName;

    @ApiModelProperty(value = "别名")
    private String anotherName;
    
    @ApiModelProperty(value = "绑定会员姓名")
    private String realName;

    @ApiModelProperty(value = "风控层级id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "会员提款成功次数")
    private Integer withdrawalSuccessNum;

    @ApiModelProperty(value = "会员提款被拒次数")
    private Integer withdrawalFailNum;

    @ApiModelProperty(value = "会员提款总金额")
    private BigDecimal withdrawalTotalAmount;

    @ApiModelProperty(value = "最后提款时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastWithdrawalTime;

    @ApiModelProperty(value = "代理提款成功次数")
    private Integer proxyWithdrawalSuccessNum;

    @ApiModelProperty(value = "代理提款被拒次数")
    private Integer proxyWithdrawalFailNum;

    @ApiModelProperty(value = "代理提款总金额")
    private BigDecimal proxyTotalAmount;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "vip等级序号")
    private String vipSerialNum;

}
