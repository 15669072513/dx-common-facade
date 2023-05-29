package com.dx.facade.report.resp.proxycommission;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 总优惠数据统计
 *
 * @author kygo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SumBaseRebateRespDTO {

    /*
    * 人数
    * */
    @ApiModelProperty(value = "人数")
    private Integer count;

    /*
    * 反水
    * */
    @ApiModelProperty(value = " 总金额")
    private BigDecimal totalAmount;

    /*
     * 名称
     * */
    @ApiModelProperty(value = "名称")
    private String  rebateName;

}
