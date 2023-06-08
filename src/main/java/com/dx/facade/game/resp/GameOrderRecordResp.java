package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class GameOrderRecordResp {
    /**
     *  手牌id
     */
    private Long handId;
    /**
     * 时间
     */
    private Date roundDate;
    /**
     * 头像
     */
    private String userHearUrl;
    /**
     * 会员账号
     */
    private String userName;
    /**
     * 手牌信息
     */
    private String handInfo;
    /**
     * 公共牌信息
     */
    private String globalPokerCode;
    /**
     * 开牌结果
     */
    private String resultInfo;
    /**
     * 投注状态
     */
    private String betStatus;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;

}
