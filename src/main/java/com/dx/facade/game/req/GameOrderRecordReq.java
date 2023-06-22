package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 游戏记录查询对象
 */
@ApiModel("德信-游戏记录查询对象")
@Data
public class GameOrderRecordReq extends BaseRequest {
    @ApiModelProperty("注单id")
    private String id;
    @ApiModelProperty("游戏账号")
    private String playerName;
    @ApiModelProperty("游戏名称")
    private String gameName;
    @ApiModelProperty("手牌id")
    private String handId;
    @ApiModelProperty("俱乐部id")
    private String clueId;
    @ApiModelProperty("牌桌id")
    private String tableId;
    @ApiModelProperty(value = "开始时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime betStartTime;

    @ApiModelProperty(value = "结束时间", required = true, example = "2021-06-17")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime betEndTime;

}
