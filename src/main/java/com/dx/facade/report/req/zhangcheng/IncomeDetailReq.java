package com.dx.facade.report.req.zhangcheng;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 收益管理-代理收益明细
 *
 * @author Adu
 * @create 2024/2/23
 */
@Data
@ApiModel(value = "收益管理-代理收益明细入参", description = "收益管理-代理收益明细入参")
public class IncomeDetailReq implements Serializable {

    @ApiModelProperty(value = "代理ID", required = true, example = "67632431144")
    private Long proxyId;

    @ApiModelProperty(value = "报表日期", required = true, example = "20240223")
    private Integer reportDate;

}
