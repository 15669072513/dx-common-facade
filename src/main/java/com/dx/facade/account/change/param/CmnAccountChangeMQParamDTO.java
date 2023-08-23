package com.dx.facade.account.change.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author Dealer
 * @description:
 * @date 2023/08/21
 * @copyright
 */
@Data
@Slf4j
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="通用mq账变对象", description="通用mq账变对象")
public class CmnAccountChangeMQParamDTO implements Serializable {

    @ApiModelProperty(value = "业务幂等标识-每笔业务唯一标志，如果一个eventId对应过个CmnAccountChangeMQParamDTO， 则不可用eventID")
    private String idempotentKey;

    @ApiModelProperty(value = "OBQJ会员账变且计算流水")
    private MemberBillWalletChangeParmDTO memberBillWalletChangeParmDTO;

    @ApiModelProperty(value = "会员账变对象(退还筹码为0)")
    private MemberWalletChangeInZeroParmDTO memberWalletChangeInZeroParmDTO;

    @ApiModelProperty(value = "会员账变对象")
    private MemberWalletChangeParmDTO memberWalletChangeParmDTO;

    @ApiModelProperty(value = "同一事务下同一用户多次账变")
    private MultipleWalletChangeParmDTO multipleWalletChangeParmDTO;

    @ApiModelProperty(value = "代理账变对象")
    private ProxyBillWalletChangeParmDTO proxyBillWalletChangeParmDTO;

    @ApiModelProperty(value = "代理账变且计算流水(代理目前只有私庄业务才计流水)")
    private ProxyWalletChangeParmDTO proxyWalletChangeParmDTO;

    @ApiModelProperty(value = "转账行为导致的账变对象(包含主动方和被动方)")
    private TransferWalletChangeParmDTO transferWalletChangeParmDTO;



}