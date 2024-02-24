package com.dx.facade.texas.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author broadway
 * @since 2023-06-06
 */
@Data
public class DxHandInfoListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("牌局主键，自增")
    private String handId;

    @ApiModelProperty("牌局code，业务生成")
    private String handCode;

    @ApiModelProperty("牌桌主键")
    private Long tableId;

    @ApiModelProperty("牌桌code")
    private String tableCode;

    @ApiModelProperty("牌桌类型 2001:德州局 2002:短牌局")
    private Long tableType;

    @ApiModelProperty("牌桌名称")
    private String tableName;

    @ApiModelProperty("俱乐部主键")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;

    @ApiModelProperty("流水订单号，流水信息主键")
    private String orderNo;

    @ApiModelProperty("游戏ID")
    private Long gameTypeId;

    @ApiModelProperty("游戏名称")
    private String gameName;

    @ApiModelProperty("牌局开始时间")
    private Long handBeginTime;

    @ApiModelProperty("牌局结束时间")
    private Long handEndTime;

    @ApiModelProperty("'参与用户ID集合'")
    private String userIds;

    @ApiModelProperty("参与用户名称集合")
    private String userNames;

    @ApiModelProperty("手牌号")
    private Integer handNum;

    @ApiModelProperty("期初金额汇总")
    private BigDecimal beforeChip=BigDecimal.ZERO;

    @ApiModelProperty("中途带入金额汇总")
    private BigDecimal bringMidwayChip=BigDecimal.ZERO;

    @ApiModelProperty("期末余额汇总")
    private BigDecimal afterChip=BigDecimal.ZERO;

    @ApiModelProperty("公牌信息")
    private String publicCards;

    @ApiModelProperty("有效底池")
    private BigDecimal validPot=BigDecimal.ZERO;

    @ApiModelProperty("0 进行中 1已结束")
    private Integer handStatus;

    @ApiModelProperty("手牌服务费")
    private BigDecimal pumpingAmount=BigDecimal.ZERO;

    @ApiModelProperty("会员输赢汇总")
    private BigDecimal netAmount=BigDecimal.ZERO;

    @ApiModelProperty("有效金额")
    private BigDecimal validBetAmount=BigDecimal.ZERO;

    @ApiModelProperty("庄家位置")
    private Integer villageSeat;


    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore=BigDecimal.ZERO;

    @ApiModelProperty("小盲位置")
    private Integer sbSeat;

    @ApiModelProperty("大盲位置")
    private Integer bbSeat;

    @ApiModelProperty("创建时间")
    private Long createdAt;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改时间")
    private Long updatedAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("是否删除（0 未删除 1已删除）")
    private Integer deleteFlag;

    @ApiModelProperty("经典保险盈亏")
    private BigDecimal insuredNetAmount;

    @ApiModelProperty("手牌盈亏")
    private BigDecimal handNetAmount;

    @ApiModelProperty("前注功能 0-关闭 1-开启 2-关闭隐藏")
    private Integer anteSwitch = 0;

    @ApiModelProperty("前注")
    private BigDecimal anteScore = BigDecimal.ZERO;
}
