package com.dx.facade.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author royal
 * APP手牌列表返回
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DxAppHandInfoResp implements Serializable {

    @ApiModelProperty("手牌id")
    private String handId;

    @ApiModelProperty("手牌号")
    private String handCode;

    @ApiModelProperty("局次")
    private Integer handNum;

    @ApiModelProperty("手牌开始时间")
    private String handStartDateStr;

    @ApiModelProperty("手牌结束时间")
    private String handEndDateStr;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginDate;

    @ApiModelProperty("牌局结束时间")
    private Long handEndDate;

    @ApiModelProperty("小盲位置")
    private Integer sbChairId;

    @ApiModelProperty("大盲位置")
    private Integer bbChairId;

    @ApiModelProperty("手牌（牌桌第多少手）")
    private Integer roundNo=0;

    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注")
    private BigDecimal anteScore = BigDecimal.ZERO;

    @ApiModelProperty("抽水金额(服务费)-代理入口使用")
    private BigDecimal pumpingAmount = BigDecimal.ZERO;

    @ApiModelProperty("总底池-代理入口使用")
    private BigDecimal totalPotAmount = BigDecimal.ZERO;

    @ApiModelProperty("保险池-代理入口使用")
    private BigDecimal insuredNetAmount = BigDecimal.ZERO;

    @ApiModelProperty(value = "当前登录会员的总盈亏")
    private BigDecimal totalNetAmount = BigDecimal.ZERO;

    @ApiModelProperty("显示手牌信息。当前登录会员的手牌，如未参与，则显示虚线牌")
    private List<AppHandInfoDetail> handInfo;

    @ApiModelProperty("赢家")
    private String winNickName;

    @ApiModelProperty("赢家备注名")
    private String winNameRemark;

    @ApiModelProperty("牌型")
    private String winResultInfo;

    @ApiModelProperty("赢家手牌")
    private List<AppHandInfoDetail> winHandInfo;

    @ApiModelProperty("公牌")
    private Map<Integer, Boolean> globalPokerCode;

    @ApiModelProperty("赢家总输赢")
    private BigDecimal winTotalNetAmount = BigDecimal.ZERO;
}
