package com.dx.facade.report.req.zhangcheng;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 收益管理列表 请求入参
 *
 * @author Adu
 * @create 2024/2/22
 */
@Data
@ApiModel(value = "收益管理入参", description = "收益管理入参")
public class IncomeReq implements Serializable {

    /**
     *
     */
    private Long proxyId;

    @ApiModelProperty(value = "开始日期", required = true, example = "20210601")
    @NotNull(message = "开始月份参数不能为空")
    private Integer startDate;

    @ApiModelProperty(value = "结束日期", required = true, example = "20210602")
    @NotNull(message = "结束月份参数不能为空")
    private Integer endDate;

    @ApiModelProperty(value = "收益类型（2我的收益，0全部下级收益，1直属下级收益)", required = true, example = "1")
    private Integer incomeType = 2;

    @ApiModelProperty(value = "特定下级代理id", example = "1")
    private Long subProxyId;

    @ApiModelProperty(value = "特定下级代理账号", example = "adu11")
    private String subProxyName;

    @ApiModelProperty(value = "状态 1:待发放 3：已发放 5：无收益 6：已取消 不传全部", example = "1")
    private Integer status = null;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    @Max(value = 2147483647, message = "当前页最大值不能大于2147483647")
    @NotNull(message = "当前页不能为空")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @Min(value = 1, message = "每页条数最小值不能小于1")
    @Max(value = 10000, message = "每页最大值不能大于10000")
    @NotNull(message = "每页条数不能为空")
    private Integer pageSize = 20;
}
