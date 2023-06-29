package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("时间分页查询对象")
public class MonthPageRequest implements Serializable {

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    private Long pageSize = 20L;

    @ApiModelProperty(value = "开始月份", required = true, example = "202106")
    @NotNull(message = "开始月份参数不能为空")
    private Integer startMonth;

    @ApiModelProperty(value = "结束月份", required = true, example = "202106")
    @NotNull(message = "结束月份参数不能为空")
    private Integer endMonth;
}
