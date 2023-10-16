package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectBankProxyRecordRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "代理账号")
    private String userName;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer accountType;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "银行支行")
    private String bankBranch;

    @ApiModelProperty(value = "银行卡号")
    private String cardNumber;

    @ApiModelProperty(value = "持卡人")
    private String cnName;

    @ApiModelProperty(value = "银行卡开户地址")
    private String bankAddress;

    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）")
    private Integer dataType;

    @ApiModelProperty("取款账号风控层级名称")
    private String accountWindControl;

    @ApiModelProperty(value = "提款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime withdrawalTime;
}
