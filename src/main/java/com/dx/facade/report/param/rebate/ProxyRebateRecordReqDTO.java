package com.dx.facade.report.param.rebate;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProxyRebateRecordReqDTO extends LocalDatePageRequest{


    /**
     * 数据角度（必传）
     */
    @ApiModelProperty("数据角度（1：下级，2：自己和下级，3：自己）")
    private Integer dataAngle;
    /**
     * 看下级-数据角度
     */
    @ApiModelProperty("看下级-数据角度（1：全部，2：直属下级）")
    private Integer dataAngleSubordinate;

    @ApiModelProperty(value = "返点开始周期(yyyyMMdd)")
    private Integer cycleStartDate;

    @ApiModelProperty(value = "返点结束周期(yyyyMMdd)")
    private Integer cycleEndDate;
    /**
     * 返点状态
     */
    @ApiModelProperty(value = "返点状态(0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

    /**
     * 代理账号
     */
    @ApiModelProperty(value = "代理账号")
    private String proxyName;
    /**
     * 代理id
     */
    @ApiModelProperty(value = "代理id")
    private Long proxyId;


}
