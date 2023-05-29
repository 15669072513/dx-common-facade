package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
  * 代理团队信息表
  */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyTeamRespDTO implements Serializable {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    private Long id;

    /**
    * 商户id
    */
    @ApiModelProperty(value="商户id")
    private Long merchantId;
    
	@ApiModelProperty(value="业务Id")
	private Long bizId;
    /**
    * 代理ID
    */
    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    /**
    * 下级代理人数
    */
    @ApiModelProperty(value="下级代理人数")
    private Integer underProxyNum;

    /**
    * 直属下级代理人数
    */
    @ApiModelProperty(value="直属下级代理人数")
    private Integer directlyUnderProxyNum;

    /**
    * 下级会员人数
    */
    @ApiModelProperty(value="下级会员人数")
    private Integer underMemberNum;

    /**
    * 直属下级会员人数
    */
    @ApiModelProperty(value="直属下级会员人数")
    private Integer directlyUnderMemberNum;

    /**
    * 累计首存人数
    */
    @ApiModelProperty(value="累计首存人数")
    private Integer totalFirstDepositNum;

    /**
    * 累计首存金额
    */
    @ApiModelProperty(value="累计首存金额")
    private BigDecimal totalFirstDepositAmount;

    /**
    * 有效会员人数
    */
    @ApiModelProperty(value="有效会员人数")
    private Integer effectiveNum;

    /**
    * 今日活跃会员人数
    */
    @ApiModelProperty(value="今日活跃会员人数")
    private Integer todayActiveNum;

    /**
    * 今日有效活跃会员人数
    */
    @ApiModelProperty(value="今日有效活跃会员人数")
    private Integer todayEffecactiveNum;

    /**
    * 今日新增有效活跃会员人数
    */
    @ApiModelProperty(value="今日新增有效活跃会员人数")
    private Integer todayNewActiveNum;

    /**
    * 今日有效活跃会员人数
    */
    @ApiModelProperty(value="今日有效活跃会员人数")
    private Integer todayNewEffecactiveNum;

    /**
    * 本月新增会员人数
    */
    @ApiModelProperty(value="本月新增会员人数")
    private Integer monthNewMemberNum;

    /**
    * 本月活跃会员人数
    */
    @ApiModelProperty(value="本月活跃会员人数")
    private Integer monthActiveNum;

    /**
    * 本月新增活跃会员人数
    */
    @ApiModelProperty(value="本月新增活跃会员人数")
    private Integer monthNewActiveNum;

    /**
    * 本月有效活跃会员人数
    */
    @ApiModelProperty(value="本月有效活跃会员人数")
    private Integer monthEffecactiveNum;

    /**
    * 本月新增有效活跃会员人数
    */
    @ApiModelProperty(value="本月新增有效活跃会员人数")
    private Integer monthNewEffecactiveNum;

    /**
    * 今日会员总投注金额
    */
    @ApiModelProperty(value="今日会员总投注金额")
    private BigDecimal todayBetAmount;

    /**
    * 今日会员总有效投注金额
    */
    @ApiModelProperty(value="今日会员总有效投注金额")
    private BigDecimal todayPayAmount;

    /**
    * 今日会员总派彩额
    */
    @ApiModelProperty(value="今日会员总派彩额")
    private BigDecimal todayValidBetAmount;

    /**
    * 今日会员总输赢金额
    */
    @ApiModelProperty(value="今日会员总输赢金额")
    private BigDecimal todayNetAmount;

    /**
    * 今日会员总优惠金额(活动+福利)
    */
    @ApiModelProperty(value="今日会员总优惠金额(活动+福利)")
    private BigDecimal todayDiscountAmount;

    /**
    * 今日会员总活动金额
    */
    @ApiModelProperty(value="今日会员总活动金额")
    private BigDecimal todayActiveAmount;

    /**
    * 今日会员总福利金额
    */
    @ApiModelProperty(value="今日会员总福利金额")
    private BigDecimal todayRewardAmount;

    /**
    * 今日会员总返水金额
    */
    @ApiModelProperty(value="今日会员总返水金额")
    private BigDecimal todayRebateAmount;

    /**
    * 今日会员总账户调整金额
    */
    @ApiModelProperty(value="今日会员总账户调整金额")
    private BigDecimal todayAcctadjustAmount;

    /**
    * 今日会员总账户加额
    */
    @ApiModelProperty(value="今日会员总账户加额")
    private BigDecimal todayAdjustAddAmount;

    /**
    * 今日会员总账户减额
    */
    @ApiModelProperty(value="今日会员总账户减额")
    private BigDecimal todayAdjustSubAmount;

    /**
    * 今日会员总净输赢金额
    */
    @ApiModelProperty(value="今日会员总净输赢金额")
    private BigDecimal todayNetwinAmount;

    /**
    * 本月会员总投注金额
    */
    @ApiModelProperty(value="本月会员总投注金额")
    private BigDecimal monthBetAmount;

    /**
    * 本月会员总有效投注金额
    */
    @ApiModelProperty(value="本月会员总有效投注金额")
    private BigDecimal monthValidBetAmount;

    /**
    * 本月会员总派彩额
    */
    @ApiModelProperty(value="本月会员总派彩额")
    private BigDecimal monthPayAmount;

    /**
    * 本月会员总输赢金额
    */
    @ApiModelProperty(value="本月会员总输赢金额")
    private BigDecimal monthNetAmount;

    /**
    * 本月会员总优惠金额(活动+福利)
    */
    @ApiModelProperty(value="本月会员总优惠金额(活动+福利)")
    private BigDecimal monthDiscountAmount;

    /**
    * 本月会员总活动金额
    */
    @ApiModelProperty(value="本月会员总活动金额")
    private BigDecimal monthActiveAmount;

    /**
    * 本月会员总福利金额
    */
    @ApiModelProperty(value="本月会员总福利金额")
    private BigDecimal monthRewardAmount;

    /**
    * 本月会员总返水金额
    */
    @ApiModelProperty(value="本月会员总返水金额")
    private BigDecimal monthRebateAmount;

    /**
    * 本月会员总账户调整金额
    */
    @ApiModelProperty(value="本月会员总账户调整金额")
    private BigDecimal monthAcctadjustAmount;

    /**
    * 本月会员总账户加额
    */
    @ApiModelProperty(value="本月会员总账户加额")
    private BigDecimal monthAdjustAddAmount;

    /**
    * 本月会员总账户减额
    */
    @ApiModelProperty(value="本月会员总账户减额")
    private BigDecimal monthAdjustSubAmount;

    /**
    * 本月会员总净输赢金额
    */
    @ApiModelProperty(value="本月会员总净输赢金额")
    private BigDecimal monthNetwinAmount;

    private static final long serialVersionUID = 1L;
}