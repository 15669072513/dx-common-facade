package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 资金->代理资金记录->非总代佣金记录
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.23
 */
@Data
public class ProxyCommissionGeneralRecordReqDTO implements Serializable {
    @ApiModelProperty(value = "id")
    private Long  id;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "查询范围 1:查询全部（包含子孙） 0:只查询自身", hidden = true)
    private Integer dataAreaType;

    @ApiModelProperty(value = "开始月份:yyyyMM,不能为空")
    private String startMonth;

    @ApiModelProperty(value = "结束月份:yyyyMM,不能为空")
    private String endMonth;

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

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

    @ApiModelProperty(value = "排序方式(1-个人佣金 2-下级总佣金 3-团队总佣金 4.剩余未收 5-等级专享佣金 6-等级专享比例 7-返佣金额 8-佣金比列 9-冲正后净输赢 10-上月结余 11-代理净输赢 12-会员总输赢 13-场馆费 14-会员优惠 15-会员返水 16-会员账号调整 17-补单输赢 18-代理返点)")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
    private String orderType;
}
