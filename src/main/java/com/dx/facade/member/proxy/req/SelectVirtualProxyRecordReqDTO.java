package com.dx.facade.member.proxy.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author agan
 */
@Data
public class SelectVirtualProxyRecordReqDTO extends SelectPagingQueryReqDTO{

    @ApiModelProperty(value = "商户id", position = 0)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
/*
    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;*/

    @ApiModelProperty(value = "使用时间-开始日期", position = 1)
    private LocalDateTime beginDate;

    @ApiModelProperty(value = "使用时间-结束日期", position = 2)
    private LocalDateTime endDate;

    @ApiModelProperty(value = "虚拟币账户地址",position = 3)
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类，目前只有USDT,传入大写USDT即可", position = 4)
    private String virtualKind;

    @ApiModelProperty(value = "代理账号", position = 5)
    private String userName;

    @ApiModelProperty(value = "上级代理账号", position = 6)
    private String parentProxyUserName;

    @ApiModelProperty(value = "操作人", position = 7)
    private String operator;

    @ApiModelProperty(value = "虚拟币协议:1-omni协议，2-trc20，3-erc20", position = 8)
    private Integer virtualProtocol;

    @ApiModelProperty(value = "代理类型：1-正式", position = 9)
    private Integer accountType;

    @ApiModelProperty(value = "取款账号风控层级名称", position = 10)
    private String accountWindControl;

    /*@ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）",hidden = true)
    private Integer dataType;*/

    /*@ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;*/
}
