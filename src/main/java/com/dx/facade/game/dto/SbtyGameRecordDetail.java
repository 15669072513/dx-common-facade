package com.dx.facade.game.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 沙巴体育详情
 *
 * @author Smith
 * @version 1.0.0
 * @date 2021/6/16 14:55
 */
@Data
public class SbtyGameRecordDetail {

    /**
     * 混合过关资料唯一识别码
     */
    private Long parlay_id;

    /**
     * 联盟识别码
     */
    private Integer league_id;

    /**
     * 赛事编号，当BetType = 10时，不会返回此字段.
     * 当Sport type: 202/220/222时, 则为Game No
     */
    private Long match_id;

    /**
     * 主队识别码，当BetType = 10时，隐藏栏位
     */
    private Integer home_id;

    /**
     * 客队识别码，当BetType = 10时，隐藏栏位
     */
    private Integer away_id;

    /**
     * 比赛开球时间
     */
    private String match_datetime;

    /**
     * 注单赔率
     */
    private BigDecimal odds;

    /**
     * 下注类型。请参考附件"下注类型表"
     */
    private Integer bet_type;

    /**
     * 下注选项内容.
     * sport type: 245,则为虚拟娱乐城投注队伍 (请参考虚拟娱乐城投注队伍表),
     * 若投注类型为 4608~4610, bet_team 固定返回”26”
     */
    private String bet_team;

    /**
     * 体育种类。请参考附件"体育种类表"
     */
    private Integer sport_type;

    /**
     * 主队让球
     */
    private BigDecimal home_hdp;

    /**
     * 客队让球
     */
    private BigDecimal away_hdp;

    /**
     * 让球
     */
    private BigDecimal hdp;

    /**
     * 比赛是否为live, 1: 是/ 0: 否
     */
    private String islive;

    /**
     * 下注时主队得分
     */
    private Integer home_score;

    /**
     * 下注时客队得分
     */
    private Integer away_score;

    /**
     * 注单状态
     */
    private String ticket_status;

    /**
     * example: 2016-03-16T00:00:00
     * 决胜时间(仅显示日期),请依此字段做为后台报表对帐使用
     */
    private String winlost_datetime;

    /**
     * X 与 Y 的值。请参考附件"下注类型表",例) bettype 145 - Set X Winne
     */
    private String bet_tag;

    /**
     * 投注项名称
     */
    private String playOptionName;

    /**
     * 赛事信息
     */
    private String matchInfo;
    /**
     * 玩法信息
     */
    private String playName;

    /**
     * 游戏名称
     */
    private String gameTypeName;

    /**
     * 联赛名称
     */
    private String matchName;



}
