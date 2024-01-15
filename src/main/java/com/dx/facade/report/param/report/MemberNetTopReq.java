package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "MemberNetTopReq", description = "会员盈亏top请求对象")
public class MemberNetTopReq {

    @ApiModelProperty(value = "报表查询开始日期", example = "20231213")
    @NotNull(message = "查询时间不能为空")
    private Long reportStDate;

    @ApiModelProperty(value = "报表查询结束日期", example = "20231221")
    @NotNull(message = "查询时间不能为空")
    private Long reportEdDate;

    @ApiModelProperty(value = "查询数据数量", example = "3")
    private Integer top;

    @ApiModelProperty(value = "类型: 1=今日盈利最高, 2=今日亏损最高)",required = true, example = "1")
    @NotNull(message = "类型不能为空")
    private Integer netType;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "会员账号")
    private String memberName;

    @ApiModelProperty(value = "总代理id")
    private Long topProxyId;

    @ApiModelProperty(value = "总代理账号")
    private String topProxyName;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "排序类型")
    private String orderType;

    @ApiModelProperty(value = "排序字段")
    private String orderKey;

    @ApiModelProperty(value = "当前页,默认第1页", required = true, example = "1")
    @Min(value = 1, message = "当前页最小值不能小于1")
    protected Long pageNum = 1L;

    @ApiModelProperty(value = "每页条数,默认10条", required = true, example = "10")
    @Range(min = 1, max = 500, message = "每页条数必须 ≥ 1 并且 ≤ 500")
    protected Long pageSize = 10L;
}
