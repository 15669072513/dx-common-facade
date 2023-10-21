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
public class SelectVirtualProxyRecordRespDTO {

    /*@ApiModelProperty(value = "id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;*/


    @ApiModelProperty(value = "代理账号", position = 1)
    private String userName;

    /*@ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long parentProxyId;*/

    /*@ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;*/

    @ApiModelProperty(value = "账号类型（1-正式，2-测试，3-合作）", position = 2)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer accountType;
    @ApiModelProperty(value = "商户名称", position = 3)
    private String merchantName;

    /*@ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）")
    private Integer dataType;*/

    @ApiModelProperty(value = "虚拟币账户地址",position = 4)
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类,目前只有USDT", position = 5)
    private String virtualKind;

    @ApiModelProperty(value = "虚拟币协议:1-omni协议，2-trc20，3-erc20",position = 6)
    private Integer virtualProtocol;

    @ApiModelProperty(value = "取款账号风控层级名称",position = 7)
    private String accountWindControl;

    @ApiModelProperty(value = "提款时间",position = 8)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime withdrawalTime;

}
