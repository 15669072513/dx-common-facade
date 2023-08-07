package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 牌局信息表
 */
@Data
public class GameReviewResp implements Serializable  {
    /**
     *  手牌id
     */
    @ApiModelProperty("手牌id")
    private String handId;

    /**
     *  局号
     */
    @ApiModelProperty("局号")
    private Integer roundNo;

    /**
     *  会员id
     */
    @ApiModelProperty("会员id")
    private Long userId;
    /**
     *  手牌编码
     */
    @ApiModelProperty("手牌编码")
    private String handCode;
    /**
     * 手牌结束时间
     */
    @ApiModelProperty("手牌结束时间")
    private Long handEndDate;

    @ApiModelProperty("手牌开始时间")
    private Long handBeginDate;
    /**
     * 游戏名称
     */
    @ApiModelProperty("游戏名称")
    private String gameName;
    /**
     * 头像
     */
    @ApiModelProperty("头像")
    private String userHeadUrl;
    /**
     * 玩家昵称
     */
    @ApiModelProperty("玩家昵称")
    private String nickName;
    /**
     * 手牌信息
     */
    @ApiModelProperty("手牌信息")
    private String handInfo;
    /**
     * 公共牌信息
     */
    @ApiModelProperty("公共牌信息")
    private String globalPokerCode;
    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    @ApiModelProperty("牌型")
    private String resultInfo;
    /**
     * 投注状态（GameBetStatusEnum)
     */
    @ApiModelProperty("投注状态")
    private Integer betStatus;
    /**
     * 盈亏筹码
     */
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount;
    /***
     * 小盲注
     */
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;

    /***
     * 大盲注
     */
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;

    @ApiModelProperty(value = "座位号")
    private Integer chairId;

    @ApiModelProperty(value = "座位类型大类 1:前位 2:中位 3:后位 4:盲位")
    private Integer seatType;

    @ApiModelProperty(value = "座位类型,参考枚举:TexasSeatTypeEnum")
    private Integer seatCode;

    @ApiModelProperty("座位号")
    private Integer seatNum;

    @ApiModelProperty("底池竞争亮牌标识 1亮牌 2弃牌")
    private Integer showStatus;

}
