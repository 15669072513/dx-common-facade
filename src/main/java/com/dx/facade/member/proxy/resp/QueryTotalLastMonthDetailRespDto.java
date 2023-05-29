package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Author: gray
 * @Date 2021/7/6
 */
@Data
public class QueryTotalLastMonthDetailRespDto {
    
    /**
     * 记录日期
     */
    @ApiModelProperty(value = "记录日期")
    private Integer reportDate;
    /**
     * 净输赢
     */
    @ApiModelProperty(value = "净输赢")
    private BigDecimal totalPureAmount;
    /**
     * 上月结余
     */
    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;
    
}
