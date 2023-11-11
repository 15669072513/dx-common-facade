package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 会员/代理提款配置表
 * </p>
 *
 * @author Jackma
 * @since 2022-10-08
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawConfigResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("币种类型")
    private String currency;

    @ApiModelProperty("用户类型 （0-会员 1-代理）")
    private Integer userType;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("代理用户id")
    private Long proxyId;

    @ApiModelProperty("代理用户名称")
    private String proxyName;

    @ApiModelProperty("使用状态/开关，0=隐藏/停用，1=展示/启用")
    private Integer status;

    @ApiModelProperty("大额标记金额")
    private BigDecimal bigAmount;

    @ApiModelProperty("每日提款次数")
    private Integer dailyCount;

    @ApiModelProperty("每日累计提款金额")
    private BigDecimal dailyAmount;

    @ApiModelProperty("银行卡单笔提款最低额度")
    private BigDecimal bankCardMinAmount;

    @ApiModelProperty("银行卡单笔提款最高额度")
    private BigDecimal bankCardMaxAmount;

    @ApiModelProperty("虚拟币单笔提款最低额度")
    private BigDecimal virtualMinAmount;

    @ApiModelProperty("虚拟币单笔提款最高额度")
    private BigDecimal virtualMaxAmount;

    @ApiModelProperty("操作人")
    private String operator;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("虚拟币TRC20协议提现手续费")
    private BigDecimal trcVirtualFee;
    @ApiModelProperty("虚拟币ERC20协议提现手续费")
    private BigDecimal ercVirtualFee;
    @ApiModelProperty("银行卡提现手续费")
    private BigDecimal bankCardFee;
    @ApiModelProperty("存款流水倍数")
    private BigDecimal depositMultiple;
    @ApiModelProperty("存款优惠流水倍数")
    private BigDecimal depositDiscountMultiple;
    @ApiModelProperty("后台存款流水倍数")
    private BigDecimal depositBackMultiple;
    @ApiModelProperty("后台存款优惠流水倍数")
    private BigDecimal depositBackDiscountMultiple;
    @ApiModelProperty("会员返水流水倍数")
    private BigDecimal rebateMultiple;
    @ApiModelProperty("会员其它返水增加调整流水倍数")
    private BigDecimal otherRebateAddMultiple;
    @ApiModelProperty("会员俱乐部返水增加调整流水倍数")
    private BigDecimal clubRebateAddMultiple;
    @ApiModelProperty("会员保险返水增加调整流水倍数")
    private BigDecimal insuranceRebateAddMultiple;
    @ApiModelProperty("上分流水倍数")
    private BigDecimal upScoreMultiple;
    @ApiModelProperty("借款流水倍数")
    private BigDecimal loanMultiple;

    @ApiModelProperty("通过代理每日取款次数")
    private Integer proxyDailyCount;

    @ApiModelProperty("通过代理每日取款金额")
    private BigDecimal proxyDailyAmount;


}
