package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SelectProxyGradeRespDTO {

    @ApiModelProperty(value = "主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;
    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    @ApiModelProperty(value = "展示顺序")
    private Integer displayOrder;
    @ApiModelProperty(value = "代理等级名称")
    private String proxyGradeName;

    @ApiModelProperty(value = "本月活跃人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long monthActiveNum;
    @ApiModelProperty(value = "本月新增活跃人数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long monthNewNum;

    @ApiModelProperty(value = "额外赠佣比例%")
    private BigDecimal additionalCommission;
    @ApiModelProperty(value = "赠佣上限")
    private BigDecimal additionalCommissionLimit;
    @ApiModelProperty(value = "赠送彩金")
    private BigDecimal giveJackpot;

    @ApiModelProperty(value = "创建人")
    private String createdBy;
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdAt;
    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updatedAt;
    @ApiModelProperty(value = "修改人")
    private String updatedBy;

}
