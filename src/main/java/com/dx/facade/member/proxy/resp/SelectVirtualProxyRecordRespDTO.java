package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectVirtualProxyRecordRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

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

    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）")
    private Integer dataType;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类")
    private String virtualKind;

    @ApiModelProperty(value = "虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty("风控层级")
    private String windControlLevelName;

    @ApiModelProperty(value = "提款时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String withdrawalTime;

}
