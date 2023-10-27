package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author grayson
 */
@Data
public class ProxyRebateRecordDetailParam {
    @ApiModelProperty(value = "返点记录id", required = true)
    @NotNull(message = "返点记录ID不能为空")
    private Long id;


    @ApiModelProperty(value = "审核结果(1=返佣增加 2=返佣减少)",  example = "1")
    @Range(min = 1, max = 2, message = "金额调整类型")
    private Integer adjustType;

    @ApiModelProperty(value = "审核结果(1=返佣增加 2=返佣减少)", example = "1")
    private BigDecimal adjustAmount;

    @ApiModelProperty("金额调整备注")
    private String auditDesc;
    @ApiModelProperty("操作人")
    private String operateName;



}
