package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author grayson
 */
@Data
public class ProxyRebateRecordDetailParam {
    @ApiModelProperty(value = "返点记录id", required = true)
    @NotNull(message = "返点记录ID不能为空")
    private Long id;

}
