package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class ProxyRebateAuditIncomeParam {

    @ApiModelProperty(value = "id的 数组", required = true)
    @NotNull(message = "审核单ID不能为空")
    private List<String> ids;

    @ApiModelProperty(value = "审核结果(1=通过 2=拒绝)", required = true, example = "1")
    @NotNull(message = "审核结果不能为空")
    @Range(min = 1, max = 2, message = "审核结果参数不合法")
    private Integer auditStatus;

    @ApiModelProperty(value = "备注", required = true, example = "同意新增...")
    @Size(max = 500, message = "审核备注不允许超过500个字符")
    @NotBlank(message = "备注不能为空")
    private String remark;
}
