package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 游戏记录查询对象
 */
@ApiModel("德信-盈亏表查询对象")
@Data
public class ProfitAndLossStatementReq extends BaseRequest {
    @ApiModelProperty("注单id")
    private String id;

    @ApiModelProperty(value = "开始时间 yyyy-MM-dd HH:mm:ss")
    private String startTime;

    @ApiModelProperty(value = "结束时间 yyyy-MM-dd HH:mm:ss")
    private String endTime;
}
