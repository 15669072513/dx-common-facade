package com.dx.facade.report.resp.report.proxy;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "FundsAuditInfoDetailResp", description = "收益审核详情")
public class FundsAuditInfoDetailResp {
    @ApiModelProperty(value = "一审人")
    private String audit1Operator;
    @ApiModelProperty(value = "一审时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit1Time;
    @ApiModelProperty(value = "一审备注")
    private String audit1Desc;
    @ApiModelProperty(value = "一审状态")
    private String audit1Result;

    @ApiModelProperty(value = "二审人")
    private String audit2Operator;
    @ApiModelProperty(value = "二审时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit2Time;
    @ApiModelProperty(value = "二审备注")
    private String audit2Desc;
    @ApiModelProperty(value = "二审状态")
    private String audit2Result;
    List<FundsAuditDetailResp> fundsAuditDetailRespList;

}
