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
public class CommissionReqDTO extends PageRequest {

    @ApiModelProperty(value = "开始月份", required = true, example = "202106")
    @NotNull(message = "开始月份参数不能为空")
    private Integer startMonth;

    @ApiModelProperty(value = "结束月份", required = true, example = "202106")
    @NotNull(message = "结束月份参数不能为空")
    private Integer endMonth;

    @ApiModelProperty(value = "总代账号", required = true, example = "daxia001")
    private String topProxyName;

    @ApiModelProperty(value = "商户ID", required = true, example = "251452")
    private String merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    /* 包网因为支持多币种，按需求要求，暂不支持排序
    @ApiModelProperty(value = "排序列: 1-等级福利, 2-返佣金额", example = "1")
    @Range(min = 1, max = 2, message = "排序列必须 ≥ 1 并且 ≤ 2")
    private Integer orderKey = 2;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "DESC";

    public String getOrderKey(){
        if(Integer.valueOf(1).equals(orderKey)){
            return "levelWelfare";
        }
        return "realCommission";
    }

    public String getOrderType(){
        if("ASC".equalsIgnoreCase(orderType)){
            return "ASC";
        }
        return "DESC";
    }
    */
}
