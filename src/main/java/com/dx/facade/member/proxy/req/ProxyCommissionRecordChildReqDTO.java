package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

import com.dx.facade.report.common.OrderReqDTO;

/**
 *佣金审核(帐目详情)直属下级详情
 *
 * @author kygo
 * @version 1.0.0
 * @since 2021.9.23
 */
@Data
public class ProxyCommissionRecordChildReqDTO extends OrderReqDTO implements Serializable {

    @ApiModelProperty(value = "月份")
    private Long reportYm;

    @ApiModelProperty(value = "代理Id")
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "直属下级-1或者全部下级-2(全部下级的需要循环在循环数据量有点大)")
    private Integer isAllChildProxy;

    @ApiModelProperty(value = "商户号")
    private Long merchantId;

    @ApiModelProperty(value = "排序方式(1-个人佣金 2-下级总佣金 3-团队总佣金 4-等级专享佣金 5-等级专享比例 6-返佣金额 7-佣金比列 8-冲正后净输赢 9-上月结余 10-代理净输赢 11-会员总输赢 12-场馆费 13-会员返水 14-会员优惠  15-会员账号调整 16-补单输赢 17-代理返点 18-佣金加减)")
    private Integer orderKey;

    @ApiModelProperty(value = "排序方式(asc-正序 desc-逆序)")
    private String orderType;

    @Override
    public String getDefaultOrderSql() {
        return " order by commission_amount desc,created_time asc ";
    }

    @Override
    public void initOrderKeyToColumn(List<OrderKeyColumn> orderKeyList) {
        orderKeyList.add(new OrderKeyColumn(1,"total_person_commission_amount"));
        orderKeyList.add(new OrderKeyColumn(2,"total_child_commission_amount"));
        orderKeyList.add(new OrderKeyColumn(3,"commission_amount + reward_amount"));
        orderKeyList.add(new OrderKeyColumn(4,"reward_amount"));
        orderKeyList.add(new OrderKeyColumn(5,"proxy_vip_level_rate"));
        orderKeyList.add(new OrderKeyColumn(6,"commission_amount"));
        orderKeyList.add(new OrderKeyColumn(7,"commission_rate"));
        orderKeyList.add(new OrderKeyColumn(8,"total_rush_amount"));
        orderKeyList.add(new OrderKeyColumn(9,"total_last_amount"));
        orderKeyList.add(new OrderKeyColumn(10,"total_pure_amount"));
        orderKeyList.add(new OrderKeyColumn(11,"total_net_amount"));
        orderKeyList.add(new OrderKeyColumn(12,"total_platform_amount"));
        orderKeyList.add(new OrderKeyColumn(13,"total_rebate_amount"));
        orderKeyList.add(new OrderKeyColumn(14,"total_discount_amount"));
        orderKeyList.add(new OrderKeyColumn(15,"total_adjust_amount"));
        orderKeyList.add(new OrderKeyColumn(16,"total_patch_net_amount"));
        orderKeyList.add(new OrderKeyColumn(17,"total_proxy_rebate_amount"));
        orderKeyList.add(new OrderKeyColumn(18,"adjust_commission_amount"));
    }
}
