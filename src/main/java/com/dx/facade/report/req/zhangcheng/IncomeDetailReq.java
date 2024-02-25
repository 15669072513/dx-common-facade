package com.dx.facade.report.req.zhangcheng;

import com.dx.facade.common.PageRequest;
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
public class IncomeDetailReq extends PageRequest implements Serializable  {

    @ApiModelProperty(value = "代理ID", required = true, example = "67632431144")
    private Long proxyId;

    @ApiModelProperty(value = "报表日期", required = false, example = "20240223")
    private Integer reportDate;

    @ApiModelProperty(value = "代理后台使用-场馆收益类型：0-德州-俱乐部团队返点 ，1-德州-保险团队占成，2-其他场馆团队返点，3-其他场馆团队占成", required = true)
    private Integer venueIncomeType;

    @ApiModelProperty(value = "代理后台使用-场馆code")
    private String venueCode;

    @ApiModelProperty(value = "报表起始日期", required = false, example = "20240223")
    private Integer beginDate;

    @ApiModelProperty(value = "报表结束日期", required = false, example = "20240223")
    private Integer endDate;

}
