package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import com.dx.facade.report.param.base.LocalDatePageRequest;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("会员盈亏查询报表")
public class MemberNetAmountReqDTO extends LocalDatePageRequest {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty("所属商户")
    private String merchantId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("总代账号")
    private String topProxyName;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("最小注单量")
    private Long minBetCount;

    @ApiModelProperty("最大注单量")
    private Long maxBetCount;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minBetAmount;

    @ApiModelProperty("最大投注金额")
    private BigDecimal maxBetAmount;

    @ApiModelProperty("最小投注盈亏")
    private BigDecimal minNetAmount;

    @ApiModelProperty("最大投注盈亏")
    private BigDecimal maxNetAmount;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minNetProfit;

    @ApiModelProperty("最大净盈亏")
    private BigDecimal maxNetProfit;
	
    private String orderKey;

    /**
     * orderType
     */
    @ApiModelProperty(value = "排序方式：升序：asc/降序：desc", example = "desc")
    private String orderType = "asc";






}
