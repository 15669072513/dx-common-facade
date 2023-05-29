package com.dx.facade.report.resp.agent;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class ProxyCommissionListPayDTO {
    @ApiModelProperty(value = "主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户号id",hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "操作人", hidden = true)
    private String operator;

    @ApiModelProperty(value = "操作人ID", hidden = true)
    private Long operatorId;

    @ApiModelProperty(value = "申请信息")
    private String desc;

    @ApiModelProperty(value = "月份",example = "202204")
    private String reportYm;

    @ApiModelProperty(value = "操作类型.1-佣金发放")
    @NotNull(message = "操作类型不能为空")
    private Integer operateType;

    @ApiModelProperty(value = "转出代理")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long transoutProyId;

    @ApiModelProperty(value = "转入代理")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long transinProxyId;

    @ApiModelProperty(value = "转出额度")
    private BigDecimal transAmount;
}
