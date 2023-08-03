package com.dx.facade.game.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author admin
 */
@Data
public class BwRecommendGameReq extends PageRequest {

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("场馆code")
    private String venueCode;

    @ApiModelProperty("游戏ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long gameId;

    @ApiModelProperty("语言")
    private String lang;

    @ApiModelProperty("客户端类型：0APP端,1H5,2PC")
    private Integer clientType;
}
