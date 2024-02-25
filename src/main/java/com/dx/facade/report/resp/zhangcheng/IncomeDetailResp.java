package com.dx.facade.report.resp.zhangcheng;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Adu
 * @create 2024/2/23
 */
@Data
@ApiModel(value = "收益管理-代理收益明细返回", description = "收益管理-代理收益明细返回")
public class IncomeDetailResp implements Serializable {


    @ApiModelProperty(value = "周期开始时间")
    private Integer cycleStartDate;
    @ApiModelProperty(value = "周期结束时间")
    private Integer cycleEndDate;
    /**
     * 场馆类型
     */
    @ApiModelProperty(value = "场馆类型", example = "ty,zr,qkl)")
    private String venueType;

    /**
     * 场馆类型名称
     */
    @ApiModelProperty(value = "场馆类型名称", example = "体育,真人,区块链")
    private String venueTypeName;

    /**
     * 有效投注(服务费贡献）
     */
    @ApiModelProperty(value = "有效投注(服务费贡献，会员输赢）", example = "1500.00")
    private BigDecimal validBetAmount = BigDecimal.ZERO;

    /**
     * 团队返点比例
     */
    @ApiModelProperty(value = "团队返点比例", example = "0.1")
    private BigDecimal rebateRate = BigDecimal.ZERO;

    /**
     * 返点金额(团队)
     */
    @ApiModelProperty(value = "团队返点金额（团队分成）", example = "1500.00")
    private BigDecimal rebateAmount = BigDecimal.ZERO;

    /**
     * 下级返点金额
     */
    @ApiModelProperty(value = "下级返点金额（下级分成）", example = "1500.00")
    private BigDecimal childRebateAmount = BigDecimal.ZERO;

    /**
     * 会员代理返水
     */
    @ApiModelProperty(value = "会员代理返水（平台替代理发放返水）", example = "1500.00")
    private BigDecimal memberProxyRebateAmount = BigDecimal.ZERO;

    /**
     * 团队占成比例
     */
    @ApiModelProperty(value = "团队占成比例", example = "0.01")
    private BigDecimal zhanchengRate = BigDecimal.ZERO;

    /**
     * 应发返点/应发盈亏分成
     */
    @ApiModelProperty(value = "实际返点（实际分成）", example = "1500.00")
    private BigDecimal incomeAmount = BigDecimal.ZERO;

    /**
     * 占成标识： 0：非占成 1：占成
     */
    @ApiModelProperty(value = "占成标识 0：非占成 1：占成", example = "0")
    private Integer zhanchengFlag = 0;

    @ApiModelProperty(value = "返点成本分摊", example = "1500.00")
    private BigDecimal partRebateAmount = BigDecimal.ZERO;


    @ApiModelProperty(value = "订单类型 1-服务费，2-保险", example = "0")
    private Integer betType;
}
