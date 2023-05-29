package com.dx.facade.es.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MetaInfo {
    @ApiModelProperty("笔数")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long count = 0L;

    @ApiModelProperty("场馆名称")
    private String venueName;

    @ApiModelProperty("场馆编码")
    private String venueCode;

    @ApiModelProperty("场馆图标(app)")
    private String venueIconUrlApp;

    @ApiModelProperty("场馆图标(pc)")
    private String venueIconUrlPc;

    @ApiModelProperty("投注额")
    private BigDecimal betAmount = BigDecimal.ZERO;

    @ApiModelProperty("输赢金额")
    private BigDecimal netAmount = BigDecimal.ZERO;
}