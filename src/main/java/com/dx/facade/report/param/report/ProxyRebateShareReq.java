package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProxyRebateShareReq", description = "收益明细请求参数")
public class ProxyRebateShareReq {

    @ApiModelProperty(value = "结算周期开始日期", example = "20231213")
    private String cycleStartDate;

    @ApiModelProperty(value = "结算周期结束日期", example = "20231221")
    private String cycleEndDate;

    @ApiModelProperty(value = "报表日期", example = "20231221")
    private Long reportDate;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "类型：0-全部 1-德州俱乐部返点，2-德州保险占成，3-其他场馆返点，4-其他场馆占成")
    private Integer venueType;
}
