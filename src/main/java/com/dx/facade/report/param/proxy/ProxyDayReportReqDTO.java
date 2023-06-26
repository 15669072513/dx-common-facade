package com.dx.facade.report.param.proxy;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.dx.facade.report.param.base.MultiplyMerchantAble;
import com.dx.facade.report.param.base.MultiplyMerchantLocalDateReq;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyDayReportReqDTO implements MultiplyMerchantAble, Serializable {
    @ApiModelProperty(value = "统计开始日期")
    private Long startTime;

    @ApiModelProperty(value = "统计结束日期")
    private Long endTime;

    @ApiModelProperty(value = "商户Id，可为空", required = true, example = "12223")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身")
    private int dataAreaType;

    @ApiModelProperty(value = "详情页proxyId")
    private Long proxyId;

    @ApiModelProperty(value = "查询方式: 1 全量; 2非全量")
    private Integer queryWay;

    @ApiModelProperty(value = "注册开始时间", example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String registerStartTime;

    @ApiModelProperty(value = "注册结束时间", example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String registerEndTime;

    @ApiModelProperty(value = "代理账号", example = "zw9z_string0001")
    private String proxyName;

    @ApiModelProperty(value = "直属上级")
    private String parentProxyName;

    @ApiModelProperty(value = "总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "账号类型  2-商务，3-正式，5-置换", example = "[2,3]", allowableValues = "[2,3,5]")
    private List<Integer> accountTypeList;

    @ApiModelProperty("累计返佣 - 最小")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long rebateMin;

    @ApiModelProperty("累计返佣 - 最大")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long rebateMax;

    @ApiModelProperty("累计返点 - 最小")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long giveBackMin;

    @ApiModelProperty("累计返点 - 最大")
    @Range(min = 0, max = 9999999999L, message = "累计返佣必须 ≥ 0 并且 ≤ 9999999999")
    private Long giveBackMax;

    @ApiModelProperty()
    private String orderKey;

    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "DESC";
}
