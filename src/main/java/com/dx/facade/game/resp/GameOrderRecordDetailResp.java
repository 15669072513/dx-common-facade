package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 牌局信息表
 */
@Data
public class GameOrderRecordDetailResp implements Serializable {
    /**
     *  手牌id
     */
    private Long handId;
    /**
     * 牌局结束时间
     */
    private Date handEndDate;
    /**
     * 牌局开始时间
     */
    private Date handBeginDate;
    /**
     * 游戏名称
     */
    private String gameName;
    /**
     * 头像
     */
    private String userHearUrl;
    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 手牌信息
     */
    private String handInfo;
    /**
     * 公共牌信息
     */
    private String globalPokerCode;
    /**
     * 开牌结果（PokerResultInfoEnum）
     */
    private String resultInfo;
    /**
     * 投注状态（GameBetStatusEnum)
     */
    private String betStatus;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;
    /**
     * 盲注(大盲/小盲)
     */
    private String blinds;

}
