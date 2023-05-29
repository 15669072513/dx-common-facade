package com.dx.facade.report.param.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RebateReportRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "场馆ID -1 代表返水人工调整")
    private String venueId;

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "返水人数")
    private Long memberCount;

    @ApiModelProperty(value = "返水金额")
    private BigDecimal amount;

}
