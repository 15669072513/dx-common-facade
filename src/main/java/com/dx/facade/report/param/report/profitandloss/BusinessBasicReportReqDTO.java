package com.dx.facade.report.param.report.profitandloss;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("时间分页查询对象")
public class BusinessBasicReportReqDTO extends LocalDatePageRequest {
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户")
    private String merchantName;
    /**
     * 商户
     */
    @ApiModelProperty(value = "商户Id")
    private Long merchantId;

    /**
     * 代理账号
     */
    @ApiModelProperty(value = "代理账号")
    private Long proxyName;


    @Override
    public String toString() {
        return "BusinessBasicReportReqDTO{" +
                "merchantName=" + merchantName +
                ", proxyName=" + proxyName +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
