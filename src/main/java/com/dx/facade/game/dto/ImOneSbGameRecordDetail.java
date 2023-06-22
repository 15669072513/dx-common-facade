package com.dx.facade.game.dto;

import lombok.Data;

/**
 * ImOne imsb注单详情
 * 
 * @author karthus
 * @version 1.0.0
 */
@Data
public class ImOneSbGameRecordDetail {

    /**
     * 盘口类别: Early 早盘, Today 今日, Live 滚球 如果 betType = OR (冠军赛 事)，则回传 Null。
     */
    private String market;

    /**
     * 赛事名称
     */
    private String eventName;

    /**
     * 赛事时间 格式: YYYY-MM-DD HH:mm:ss +08:00
     */
    private String eventDateTime;

    /**
     * 竞技名称
     */
    private String competitionName;

    /**
     * 主队名称
     */
    private String HomeTeamName;

    /**
     * 客队名称
     */
    private String awayTeamName;

    /**
     * 玩法类别: CS, FGLG, TG 等
     */
    private String betType;

    /**
     * 1H 上半场, 2H 下半场, FT 全场 如果 betType = OR (冠军赛 事)，则回传 Null。
     */
    private String period;

    /**
     * 参考 IMOne API Specification - Appendix - Bet Type List v1.x.xlsx
     */
    private String selection;

    /**
     * 0=Not cancel 未取消, 1=Cancel 已取消
     */
    private String isWagerItemCancelled;

    /**
     * 投注取消理由 0 = 其他 1 = 危险红牌 2 = 危险进球 3 = 赛事终止 4 = 其他：危险 5 = 其他：系统超时 尚未取消，则返回 0
     */
    private String wagerItemCancelReason;

    /**
     * 0 = 尚未取消 1 = 赛事被取消 2 = 投注被取消
     */
    private String wagerItemCancelType;

    /**
     * 体育名称: Soccer, Basketball 等。
     */
    private String sportsname;

    /**
     * 赔率
     */
    private String oddsValue;

    /**
     * 赛事编号
     */
    private String eventID;

    /**
     * 盘口类型
     */
    private String oddsType;
}
