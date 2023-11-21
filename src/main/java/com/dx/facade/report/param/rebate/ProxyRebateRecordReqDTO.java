package com.dx.facade.report.param.rebate;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class ProxyRebateRecordReqDTO{

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @NotNull(message = "分页参数不能为空")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认20条", required = true, example = "10")
    @NotNull(message = "分页参数不能为空")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 10L;
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
    //内部字段，不暴露
    private Long proxyId;


}
