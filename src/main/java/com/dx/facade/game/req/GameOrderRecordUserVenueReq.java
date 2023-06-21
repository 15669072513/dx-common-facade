package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 游戏记录查询对象
 */
@ApiModel("游戏记录查询对象")
@Data
public class GameOrderRecordUserVenueReq extends BaseRequest {

    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty("代理id")
    private Long parentProxyId;
    @ApiModelProperty("状态")
    private Integer status;
}
