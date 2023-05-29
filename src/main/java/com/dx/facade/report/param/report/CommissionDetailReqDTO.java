package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import com.dx.facade.common.PageRequest;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("佣金报表请求参数")
public class CommissionDetailReqDTO extends PageRequest {

    @ApiModelProperty(value = "统计月份", required = true, example = "202106")
    @NotNull(message = "统计月份参数不能为空")
    private Integer statisticsMonth;

    @ApiModelProperty(value = "排序列: 1-实际返佣", example = "1")
    @Range(min = 1, max = 5, message = "排序列必须 ≥ 1 并且 ≤ 5")
    private Integer orderKey = 1;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "DESC";

    public String getOrderKey(){
        return "commissionAmount";
    }

    public String getOrderType(){
        if("ASC".equalsIgnoreCase(orderType)){
            return "ASC";
        }
        return "DESC";
    }
}
