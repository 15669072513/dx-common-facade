package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 游戏记录查询对象
 */
@ApiModel("游戏记录查询对象")
@Data
public class GameOrderRecordReq extends BaseRequest {
    @ApiModelProperty("会员账号")
    private String userName;
    @ApiModelProperty("游戏名称")
    private Integer ganmeName;
    @ApiModelProperty("状态")
    private Long status;
}
