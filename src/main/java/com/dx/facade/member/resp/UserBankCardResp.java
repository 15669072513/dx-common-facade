package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserBankCardResp {

    @ApiModelProperty(value="id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value="商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value="会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value="持卡人姓名")
    private String cnName;

    @ApiModelProperty(value = "银行id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long bankId;

    @ApiModelProperty(value="银行名称")
    private String bankName;

    @ApiModelProperty(value="银行编号号")
    private String bankCode;

    @ApiModelProperty(value="卡号")
    private String cardNumber;

    @ApiModelProperty(value="银行卡地址")
    private String bankAddress;


    @ApiModelProperty("虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty("虚拟币种类")
    private String virtualKind;

    @ApiModelProperty("虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty("数据类型（1-银行卡 2-虚拟货币）")
    private Integer dataType;

//    @ApiModelProperty(value="状态")
//    private String status;

    @ApiModelProperty(value="绑定时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String modifyDt;

    @ApiModelProperty("银行卡风控等级")
    private String cardNoWindControlLevelName;

    @ApiModelProperty("虚拟币风控等级")
    private String virturalAddressWindControlLevelName;

    @ApiModelProperty(value = "绑定时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @ApiModelProperty(value = "绑定状态")
    private Integer bindStatus;

}
