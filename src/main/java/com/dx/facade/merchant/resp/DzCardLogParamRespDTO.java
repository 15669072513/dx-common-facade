package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DzCardLogParamRespDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户code")
    private String merchantCode;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "操作栏目1游戏管理2俱乐部管理")
    private Integer operationMenu;

    @ApiModelProperty(value = "操作页面1游戏规则-德州扑克2游戏规则-短牌3保险赔率-德州扑克4保险赔率-短牌5牌桌详情6俱乐部申请列表7通用俱乐部管理")
    private Integer operationPage;

    @ApiModelProperty(value = "操作类型:0编辑1 解散2编辑机器人数量3.审核通过4审核拒绝5设置")
    private Integer operationType;

    @ApiModelProperty(value = "操作功能")
    private String function;

    @ApiModelProperty(value = "操作对象(商户名称)")
    private String operationTarget;

    @ApiModelProperty(value = "操作人类型1总控超管2总控管理员3总控职员4商户超管5商户管理员6商户职员")
    private Integer operatorType;

    @ApiModelProperty(value = "操作IP")
    private String ip;

    @ApiModelProperty(value = "操作前")
    private String operationBefore;

    @ApiModelProperty(value = "操作后")
    private String operationAfter;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "操作人")
    private String operatorId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;
}
