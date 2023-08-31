package com.dx.facade.game.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author admin
 */
@Data
public class BwGameCollectReq extends PageRequest {

    @ApiModelProperty("商户id")
    private Long merchantId;

    @ApiModelProperty("用户id")
    private Long memberId;

    @ApiModelProperty("游戏id")
    private Long gameId;

}
