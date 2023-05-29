package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员日游戏返水报表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberRebateRecordFlinkReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "登录站点:1OB旗舰,2美播真人")
    private Integer loginAppId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "vip等级序号")
    private Integer vipSerialNum;

    @ApiModelProperty(value = "报表日期（yyyymmdd）")
    private Integer reportDate;

    @ApiModelProperty(value = "批次身份代码")
    private Long batchId;

    @ApiModelProperty(value = "重置标志")
    private Integer resetFlag;

    @ApiModelProperty(value = "重置时间")
    private LocalDateTime resetDate;

    @ApiModelProperty(value = "会员姓名")
    private String realName;

    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    @ApiModelProperty(value = "场馆id")
    private Long venueId;

    @ApiModelProperty(value = "场馆名称")
    private String venueName;

    @ApiModelProperty(value = "B端游戏id")
    private Long gameId;

    @ApiModelProperty(value = "游戏名称")
    private String gameName;

    @ApiModelProperty(value = "返水状态（0待发放/1-已发放/2-发放失败）")
    private Integer rebateStatus;

    @ApiModelProperty(value = "返水比例")
    private BigDecimal rebateRatio;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "返水金额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "领取时间")
    private LocalDateTime rebateAt;

    @ApiModelProperty(value = "账号类型（1-试玩,2-商务,3-正式,4-测试,5-置换）")
    private Integer accountType;

    private String parentProxyName;
    
    @ApiModelProperty(value = "注单号")
    private String betNum;
}