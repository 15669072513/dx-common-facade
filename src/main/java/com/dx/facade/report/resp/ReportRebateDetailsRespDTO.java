package com.dx.facade.report.resp;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @title 统计源代理明细下钻接口响应数据传输对象
 * @desc
 * @dbType mysql
 * @dbTable ob_player.ob_proxy_rebate_d
 *          ob_proxy_rebate_record
 * @author gollum
 * @version 1.0.0
 * @since 2021年9月18日 上午09:56:12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("统计源代理明细下钻接口响应数据传输对象")
public class ReportRebateDetailsRespDTO implements Serializable {

    /**
     * 代理Id，实际为依据父级代理查询出来的子级代理的Id，以下内容均为子级代理信息
     */
    @ApiModelProperty(value = "代理Id")
    private Long proxyId;

    /**
     * 子级代理帐号
     */
    @ApiModelProperty(value = "代理账号", example = "daxia111")
    private String proxyAccount;

    /**
     * 子级代理类型名称，表中无对应字段，需关联
     */
    @ApiModelProperty(value = "子级代理类型名称", example = "正式")
    private String proxyTypeCaption;

    /**
     * 子级代理所属层级名称，表中无对应字段，需关联
     */
    @ApiModelProperty(value = "子级代理所属层级名称", example = "1")
    private String proxyLevelCaption;

    /**
     * 返点发放，表中无对应字段，需计算，依据payout_status
     */
    @ApiModelProperty(value = "返点发放", example = "1000.00")
    private BigDecimal distributeOfRebate;

    /**
     * 返点调整，表中无对应字段，需计算
     */
    @ApiModelProperty(value = "返点调整", example = "0.00")
    private BigDecimal adjustOfRebate;

    /**
     * 实际返点，表中无对应字段，需计算
     */
    @ApiModelProperty(value = "实际返点", example = "1000.00")
    private BigDecimal realOfRebate;
}
