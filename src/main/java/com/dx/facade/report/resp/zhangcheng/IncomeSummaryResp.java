package com.dx.facade.report.resp.zhangcheng;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 收益管理 统计
 *
 * @author Adu
 * @create 2024/2/23
 */
@Data
@ApiModel(value = "收益管理统计", description = "收益管理统计")
public class IncomeSummaryResp implements Serializable {

    /**
     * 共计
     */
    @ApiModelProperty(value = "共计", example = "1500.00")
    private BigDecimal totalAmount = BigDecimal.ZERO;

    /**
     * 已发放
     */
    @ApiModelProperty(value = "已发放", example = "1500.00")
    private BigDecimal totalPaid = BigDecimal.ZERO;

    /**
     * 已取消
     */
    @ApiModelProperty(value = "已取消", example = "1500.00")
    private BigDecimal totalCanceled = BigDecimal.ZERO;
}
