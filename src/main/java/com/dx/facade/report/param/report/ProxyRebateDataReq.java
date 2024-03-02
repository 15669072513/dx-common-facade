package com.dx.facade.report.param.report;


import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("代理返点数据请求参数")
public class ProxyRebateDataReq extends LocalDatePageRequest {
    @ApiModelProperty(value = "代理账号--适配团队返点明细", example = "string0001")
    private String proxyName;

    @ApiModelProperty(value = "代理层级", example = "1")
    private Integer proxyLevel;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty("查询团队明细id")
    private Long id;

    private Integer reportDate;


    private String orderKey;

    private String orderType;
}
