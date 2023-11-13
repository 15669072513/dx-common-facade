package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateWithdrawConfigReq implements BaseParmDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("银行卡单笔提款最低额度")
    private BigDecimal bankCardMinAmount;

    @ApiModelProperty("银行卡单笔提款最高额度")
    private BigDecimal bankCardMaxAmount;

    @ApiModelProperty("虚拟币单笔提款最低额度")
    private BigDecimal virtualMinAmount;

    @ApiModelProperty("虚拟币单笔提款最高额度")
    private BigDecimal virtualMaxAmount;

    @ApiModelProperty("大额标记金额")
    private BigDecimal bigAmount;

    @ApiModelProperty("会员存款")
    private BigDecimal depositMultiple;

    @ApiModelProperty("会员存款后台")
    private BigDecimal depositBackMultiple;

    @ApiModelProperty("充值上分")
    private BigDecimal upScoreMultiple;

    @ApiModelProperty("会员返水")
    private BigDecimal rebateMultiple;

    @ApiModelProperty("会员返水增加调整")
    private BigDecimal otherRebateAddMultiple;

    @ApiModelProperty("信用借款")
    private BigDecimal loanMultiple;

    @ApiModelProperty("通过代理每日取款次数")
    private Integer proxyDailyCount;

    @ApiModelProperty("通过代理每日取款金额")
    private BigDecimal proxyDailyAmount;

    @ApiModelProperty("代理ID")
    private Long proxyId;

    @ApiModelProperty("代理姓名")
    private String proxyName;

    @ApiModelProperty("使用状态/开关，0=隐藏/停用，1=展示/启用")
    private Integer status;

    @ApiModelProperty("每日提款次数")
    private Integer dailyCount;

    @ApiModelProperty("每日累计提款金额")
    private BigDecimal dailyAmount;

    @ApiModelProperty("俱乐部返水调整")
    private BigDecimal clubRebateAddMultiple;

    @ApiModelProperty("保险返水调整")
    private BigDecimal insuranceRebateAddMultiple;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("虚拟币TRC20协议提现手续费")
    private BigDecimal trcVirtualFee;
    @ApiModelProperty("虚拟币ERC20协议提现手续费")
    private BigDecimal ercVirtualFee;
    @ApiModelProperty("银行卡提现手续费")
    private BigDecimal bankCardFee;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.hasText(operator, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("operator"));
    }
}
