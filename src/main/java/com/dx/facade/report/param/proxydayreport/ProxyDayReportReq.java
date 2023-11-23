package com.dx.facade.report.param.proxydayreport;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "ProxyDayReportReq", description = "代理报表请求对象")
public class ProxyDayReportReq extends PageRequest implements Serializable {


    @ApiModelProperty(value = "统计开始时间",  example = "20210617")
    private String startTime;

    @ApiModelProperty(value = "统计结束时间",  example = "20210617")
    private String endTime;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "代理名称")
    private String proxyName ;

    @ApiModelProperty(value = "类型：1全部 2直属")
    private Integer proxyType;

    @ApiModelProperty(
            value = "排序列名，receiveTime",
            example = "receiveTime"
    )
    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;

}
