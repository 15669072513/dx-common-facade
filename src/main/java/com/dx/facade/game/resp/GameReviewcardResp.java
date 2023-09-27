package com.dx.facade.game.resp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 牌局信息表
 */
@Data
public class GameReviewcardResp implements Serializable  {
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
     * 公牌 有为空数据
     */
    @ApiModelProperty("公共牌信息")
    private List<Integer> publicCards =new ArrayList<>();

    /***
     * 手牌 有为空数据
     */
    @ApiModelProperty("手牌信息")
    private List<Integer> handCards =new ArrayList<>();

    /***
     * 玩家牌型展示是否置亏标识
     */
    @ApiModelProperty("玩家牌型显示是否置灰标识")
    private List<Map<Integer,Boolean>> showCards =new ArrayList<>();

    /** 最终成牌 */
    @ApiModelProperty("最终成牌")
    @JsonIgnore
    private String lastCards;

    /** 成牌时7张牌舍弃的2张牌 */
    @ApiModelProperty("成牌时7张牌舍弃的2张牌")
    @JsonIgnore
    private String loseCards;

    /**
     * 开牌结果（#PokerResultInfoEnum）
     */
    @ApiModelProperty("牌型")
    private String resultInfo;

    /**
     * 眼睛标识
     */
    @ApiModelProperty("眼睛标识")
    private boolean showFlag;
    /**
     * 投注状态（GameBetStatusEnum)
     */
    @ApiModelProperty("投注状态,参考枚举: GameBetStatusEnum")
    private Integer betStatus;
    /**
     * 盈亏筹码
     */
    @ApiModelProperty("盈亏筹码")
    private BigDecimal netAmount;

    @ApiModelProperty("保险输赢")
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

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

    @ApiModelProperty("底池竞争亮牌标识 0不需要亮牌 1强制亮牌 2自主亮牌通知 3已自主亮牌")
    private Integer showStatus;

}
