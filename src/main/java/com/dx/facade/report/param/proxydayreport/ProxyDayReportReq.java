package com.dx.facade.report.param.proxydayreport;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ApiModel(value = "com-ob-resp-report-ProxyDayReportDTO", description = "代理报表对象")
public class ProxyDayReportReq extends PageRequest {


    @ApiModelProperty(value = "统计开始时间", required = true, example = "20210617")
    @DateTimeFormat(pattern = "yyyyMMdd")
    private Integer startTime;

    @ApiModelProperty(value = "统计结束时间", required = true, example = "20210617")
    @DateTimeFormat(pattern="yyyyMMdd")
    private Integer endTime;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "代理名称")
    private String proxyName ;

    @ApiModelProperty(value = "类型：1全部 2直属")
    private Integer proxyType;

}
