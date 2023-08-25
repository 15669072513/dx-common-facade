package com.dx.facade.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author grayson
 */
@Data
public class ProxyRebateRecordDetailReportParam {
    @ApiModelProperty(value = "ID", required = true)
    @NotNull(message = "ID")
    private Long id;

    @ApiModelProperty(value = "返点日期，格式： 20230716", required = true)
    @NotNull(message = "返点日期")
    private Integer reportDate;

    @ApiModelProperty(value = "1 代理团队  2 代理直属会员 3 会员 ", required = true)
    @NotNull(message = "类型")
    private Integer reportType;

}
