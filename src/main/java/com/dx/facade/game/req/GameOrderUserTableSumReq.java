package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import lombok.Data;

/**
 * 牌局详情请求对象
 */
@Data
public class GameOrderUserTableSumReq extends LocalDatePageRequest {
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 游戏类型 （GameTypeEnum）
     */
    private Integer gameType;

}
