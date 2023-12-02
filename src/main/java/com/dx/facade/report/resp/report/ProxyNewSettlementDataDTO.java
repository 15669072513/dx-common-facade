package com.dx.facade.report.resp.report;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @description 代理返佣账单周期列表数据
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理返佣账单周期名称列表数据", description = "代理返佣账单周期名称列表数据")
public class ProxyNewSettlementDataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 周期名称 - 结算期数
     */
    @ApiModelProperty("周期名称 - 结算期数")
    private String cycleName;

    /**
     * 周期起始日期
     */
    @ApiModelProperty("周期起始日期")
    private Integer cycleStartDate;

    /**
     * 周期结束日期
     */
    @ApiModelProperty("周期结束日期")
    private Integer cycleEndDate;
}