package com.dx.facade.game.req;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("时间分页查询对象")
public class GameOrderRecordUserReq extends LocalDatePageRequest {
    /**
     * 玩家id
     */
    private Long userId;
    /**
     * 游戏类型 （GameTypeEnum）
     */
    private String gameType;

}
