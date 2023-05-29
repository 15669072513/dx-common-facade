package com.dx.facade.payment.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.facade.member.param.ProxyFinanceRpcReqDto;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawMQDTO {
    @ApiModelProperty(value = "消息类型 0=提款，1=更新代理财务信息")
    private Integer messageType;

    @ApiModelProperty(value="商户ID")
    private Long merchantId;

    @ApiModelProperty(value="用户id")
    private Long userId;

    @ApiModelProperty(value="用户类型 0=会员 1=代理")
    private Integer userType;

    @ApiModelProperty(value = "业务类型(1=存款,2=取款,3=人工加额存款,4=人工减额提款,5=代理代存)")
    private Integer bizType;

    @ApiModelProperty(value="金额")
    private BigDecimal amount;

    @ApiModelProperty(value="业务单号，幂等性。传递订单号，确保一笔交易不会重复执行")
    private String eventId;

    @ApiModelProperty(value="订单的事件发生时间")
    private LocalDateTime eventTime;

    @ApiModelProperty(value="存取款表id")
    private Long orderId;

    @ApiModelProperty(value="审核结果，通过或拒绝")
    private Boolean auditResult;

    @ApiModelProperty(value="用户卡id")
    private Long userBankCardId;

    @ApiModelProperty(value = "是否大额(false=否 true=大额)")
    private Boolean isBig;

    @ApiModelProperty(value = "订单状态，存款状态(1:待处理,2:已关闭,3:成功,4:失败), 取款状态(1:待一审,2:一审审核,3:待二审,4:二审审核,5:待三审,6:三审审核,7:待出款,8:一审拒绝,9:二审拒绝,10:三审拒绝,11:出款成功,12:出款取消,13:出款失败)")
    private Integer orderStatus;

    //------------------------银行卡虚拟币账号信息-------------------------//

    @ApiModelProperty(value = "存款/提款方式(1=银行卡 2=虚拟币)")
    private Integer withdrawType;

    @ApiModelProperty(value = "银行编码")
    private String bankCode;

    @ApiModelProperty(value = "提款银行卡账户名(张三)")
    private String withdrawAccountName;

    @ApiModelProperty(value = "提款卡号/虚拟币账户地址")
    private String withdrawAccountNo;

    @ApiModelProperty(value = "提款银行(招商银行)/虚拟币种类(USDT)")
    private String withdrawBank;

    @ApiModelProperty(value = "提款银行地址(广东省广州市)/虚拟币协议(ERC20)")
    private String withdrawBankAddress;

    //------------------------代理财务信息-------------------------//

    @ApiModelProperty(value = "代理财务信息")
    ProxyFinanceRpcReqDto proxyFinanceRpcReqDto;
}
