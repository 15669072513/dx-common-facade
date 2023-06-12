package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 牌局信息表
 */
@Data
public class GameOrderUserTableSumResp implements Serializable {
    /**
     *  牌桌id
     */
    private Long tableId;
    /**
     * 牌桌创建时间
     */
    private Date tableDate;
    /**
     * 时长
     */
    private Long ms;
    /**
     * 牌桌名称
     */
    private String tableName;
    /**
     * 头像
     */
    private String userHearUrl;
    /**
     * 玩家昵称
     */
    private String nickName;
    /**
     * 盈亏筹码
     */
    private BigDecimal netChip;
    /**
     * 盲注(大盲/小盲)
     */
    private String blinds;

}
