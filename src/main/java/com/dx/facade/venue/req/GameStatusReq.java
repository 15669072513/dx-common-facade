package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@Data
public class GameStatusReq {
    @ApiModelProperty(value = "游戏id")
    @NotNull
    private Long gameId;

    @ApiModelProperty(value = "状态(0已禁用,1开启中,2维护中)")
    @Range(min = 0, max = 2)
    private Integer status;

    @ApiModelProperty(value = "当前登录用户", hidden = true)
    private String currentUser;
}
