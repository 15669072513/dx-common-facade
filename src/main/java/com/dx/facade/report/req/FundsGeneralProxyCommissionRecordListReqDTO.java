package com.dx.facade.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 @title 总代佣金记录分页接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月27日 23:06:57
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("总代佣金记录分页接口请求数据传输对象")
public class FundsGeneralProxyCommissionRecordListReqDTO implements Serializable {

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty(value = "商户id")
    private Long merchantId = null;

    private Long id;

    @ApiModelProperty(value = "开始月份:yyyyMM,不能为空")
    private String startMonth;

    @ApiModelProperty(value = "结束月份:yyyyMM,不能为空")
    private String endMonth;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "是否总代理账号(0-总代理 1-非总代)")
    private String isMainProxy;

    @ApiModelProperty(value = "客户端状态 (0-已取消 1-已发放 2-无佣金)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "代理类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private List<Integer> accountType;

    @ApiModelProperty(value = "最小个人佣金")
    private BigDecimal totalPersonCommissionAmountMin;

    @ApiModelProperty(value = "最大个人佣金")
    private BigDecimal totalPersonCommissionAmountMax;

    @ApiModelProperty(value = "最小下级总佣金")
    private BigDecimal totalChildCommissionAmountMin;

    @ApiModelProperty(value = "最大下级总佣金")
    private BigDecimal totalChildCommissionAmountMax;

    @ApiModelProperty(value = "最小团队总拥金")
    private BigDecimal commissionAmountMin;

    @ApiModelProperty(value = "最大团队总拥金")
    private BigDecimal commissionAmountMax;

//    @ApiModelProperty(value = "排序方式(1-下级总佣金 2-团队总佣金 3- 等级专享佣金 4-等级专享比例 5-返佣金额 6-冲正后净输赢 7-上月结余 8-代理净输赢 9-会员总输赢 10-场馆费 11-会员返水 12-会员优惠)")
//    @ApiModelProperty(value = "排序方式(1-个人佣金 2-下级总佣金 3-团队总佣金 4-等级专享佣金 5-等级专享比例 6-返佣金额 7-佣金比列 8-冲正后净输赢 9-上月结余 10-代理净输赢 11-会员总输赢 12-场馆费 13-会员返水 14-会员优惠 15-会员账号调整 16-补单输赢 17-代理返点 18-佣金加减)")
//    private Integer orderKey;
//
//    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
//    private String orderType;
}
