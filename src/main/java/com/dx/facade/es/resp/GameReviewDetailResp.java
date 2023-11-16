package com.dx.facade.es.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *  牌局回顾详情输出
 *
 * @author broadway
 * @date 2023/11/09 14:26
 */
@Data
public class GameReviewDetailResp {
    /** 主键id */
    private Long id;

    /** 牌桌类型 2001:德州局 2002:短牌局 */
    private Long tableType;

    /** 牌桌id */
    private Long tableId;

    /** 用户id */
    private Long userId;

    /** 手牌code */
    private String handCode;

    /** 业务事件ID */
    private String eventId;

    /** 业务事件时间 */
    private LocalDateTime eventTime;

    /** 牌桌名称 */
    private String tableName;

    /** 局次 */
    private Integer handCounts;

    /** 当前剩余筹码 */
    private BigDecimal chipScore;

    /** 用户当前操作金额 */
    private BigDecimal amount;

    /** 保险输赢 */
    private BigDecimal insuredNetAmount=BigDecimal.ZERO;

    /** 圈次,参考枚举:TexasRoundEnum */
    private int roundCode;

    /** 用户游戏内下注操作类型,参考枚举:TexasBetActionEnum */
    private String betActionCode;

    /** 是否亮牌标识 1 亮牌，2非亮牌 */
    private Integer showStatus;

    /** 只针对大盲并且在pre圈 Walks 手牌数，0 无效;1 有效 */
    private Integer walks;

    /** 主动入池 0 无效;1 有效 */
    private Integer itp;

    /** 翻牌前加注次数 */
    private Integer raiseCount;

    /** 资金类型：0 非资金流水; 1 投注; 2 结算; */
    private String fundType;

    /**
     * 是否特殊动作 0 否; 1 是( 退出，进入房间。留座离卓，站起 ,强制站起),3购买保险
     */
    private Integer isSpecial;

    /** 删除标志 */
    private Integer deleteFlag=0;

}
