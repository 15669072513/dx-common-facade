package com.dx.facade.member.proxy.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author agan
 */
@Data
public class SelectVirtualProxyRecordReqDTO extends SelectPagingQueryReqDTO{

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "代理id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "使用时间-开始日期")
    private String beginDate;

    @ApiModelProperty(value = "使用时间-结束日期")
    private String endDate;

    @ApiModelProperty(value = "代理账号")
    private String userName;

    @ApiModelProperty(value = "代理类型")
    private List<String> accountType;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类")
    private String virtualKind;

    @ApiModelProperty(value = "虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty("风控层级")
    private List<String> windControlId;

    @ApiModelProperty(value = "数据类型（1-银行卡 2-虚拟货币）",hidden = true)
    private Integer dataType;

    @ApiModelProperty("排序方式(1)：desc-降序 asc-升序")
    private String orderType;
}
