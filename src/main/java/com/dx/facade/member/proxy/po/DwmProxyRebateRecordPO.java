package com.dx.facade.member.proxy.po;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/** 代理返点结算表 */
@Data
public class DwmProxyRebateRecordPO {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理name")
    private String parentProxyName;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "代理姓名")
    private String proxyName;

    @ApiModelProperty(value = "代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "代理层级ID")
    private Long proxyLevelId;

    @ApiModelProperty(value = "代理层级路径")
    private String proxyPath;

    @ApiModelProperty(value = "代理线层级上限")
    private Integer maxLevels;

    @ApiModelProperty(value = "单号")
    private String orderNo;

    @ApiModelProperty(value = "审核状态 0-待一审 1-一审拒绝 2-待二审 3-二审拒绝 4-二审通过")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "当前锁单账号")
    private String lockAccount;

    @ApiModelProperty(value = "周期类型: 1-天 2-周 3-月")
    private Integer cycleType;

    @ApiModelProperty(value = "周期名称")
    private String cycleName;

    @ApiModelProperty(value = "周期起始日期")
    private Integer cycleStatrtDate;

    @ApiModelProperty(value = "周期结束日期")
    private Integer cycleEndDate;

    @ApiModelProperty(value = "报表日期")
    private Integer reportDate;

    @ApiModelProperty(value = "总会员游戏流水")
    private BigDecimal totalBetAmount;

    @ApiModelProperty(value = "总会员有效游戏流水")
    private BigDecimal totalValidBetAmount;

    @ApiModelProperty(value = "会员游戏注单量")
    private Integer totalBetNum;

    @ApiModelProperty(value = "会员游戏人数")
    private Integer totalBetMemberNum;

    @ApiModelProperty(value = "会员总盈亏")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "总会员流水纠正金额")
    private BigDecimal totalAdjustBetAmount;

    @ApiModelProperty(value = "实际总流水金额")
    private BigDecimal totalRealBetAmount;

    @ApiModelProperty(value = "活跃用户")
    private Integer activeNum;

    @ApiModelProperty(value = "有效活跃用户")
    private Integer effecactiveActiveNumNew;

    @ApiModelProperty(value = "契约ID")
    private Long contractId;

    @ApiModelProperty(value = "契约等级序号")
    private Integer contractLevel;

    @ApiModelProperty(value = "返点比例")
    private BigDecimal rebateRate;

    @ApiModelProperty(value = "团队返点金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;

    @ApiModelProperty(value = "报表创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty(value = "派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "派发时间")
    private LocalDateTime payoutTime;

    @ApiModelProperty(value = "领取时间")
    private LocalDateTime reciveDate;

    @ApiModelProperty(value = "审核账号")
    private String audit1Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "审核备注")
    private String audit1Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty(value = "审核账号")
    private String audit2Operator;

    @ApiModelProperty(value = "审核结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "审核时间")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "审核备注")
    private String audit2Desc;

    @ApiModelProperty(value = "审核时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @TableField(exist = false)
    private Integer  accountLockStatus;

    @TableField(exist = false)
    private Integer loginLockStatus;

    @TableField(exist = false)
    private String windControlName;
}
