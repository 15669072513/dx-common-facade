package com.dx.facade.report.param.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("时间分页查询对象")
public class LocalDatePageRequest implements Serializable {

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 20L;

    @ApiModelProperty(value = "开始时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    protected LocalDate startTime;

    @ApiModelProperty(value = "结束时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    protected LocalDate endTime;
}
