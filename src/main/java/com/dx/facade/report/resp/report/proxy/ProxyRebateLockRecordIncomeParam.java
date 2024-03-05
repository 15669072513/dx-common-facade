package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class ProxyRebateLockRecordIncomeParam {

    @ApiModelProperty(value="记录ID的数组")
    @NotNull
    private List<String> idList;

    @ApiModelProperty(value="锁单状态(0=解锁 1=锁单)")
    @NotNull
    @Min(value = 0, message = "锁单状态参数不合法,最小值0")
    @Max(value = 1, message = "锁单状态参数不合法,最大值1")
    private Integer lockStatus;

    @ApiModelProperty(value="锁单方式(1=单个锁单 2=批量锁单)")
    @NotNull
    @Min(value = 1, message = "单个锁单")
    @Max(value = 2, message = "批量锁单")
    private Integer lockType;
}
