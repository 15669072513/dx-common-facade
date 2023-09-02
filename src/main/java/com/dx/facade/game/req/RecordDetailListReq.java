package com.dx.facade.game.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@ApiModel("战绩详情请求实体")
@Data
public class RecordDetailListReq extends PageRequest {
    @ApiModelProperty(value = "牌桌ID", required = true)
    @NotNull(message = "请选择牌桌")
    private Long tableId;

    @ApiModelProperty(value = "请求来源：1.游戏app 2.代理app", required = true)
    private Integer requestSource;
}
