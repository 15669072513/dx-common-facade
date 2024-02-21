package com.dx.facade.report.param.report.profitandloss;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 运营状况-德州数据 请求
 *
 * @author Adu
 * @date 2024/2/14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProfitPlatformDzReqDTO", description = "运营状况-德州数据请求对象")
public class ProfitPlatformDzReqDTO implements Serializable {

    @ApiModelProperty(value = "查询范围 0:全量数据 1:统计日期", example = "1")
    private Integer dataAreaType;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    private Long pageSize = 20L;

    @ApiModelProperty(value = "开始日期", required = true, example = "20210617")
    protected Integer startDate;

    @ApiModelProperty(value = "结束时间", required = true, example = "20210617")
    private Integer endDate;

}
