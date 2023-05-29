package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 代理下级概览
 *
 * @author laway
 */
@Data
@Builder
public class ProxyOverviewRespDTO {

    @ApiModelProperty(value = "下级成员汇总")
    private Long userCount;

    @ApiModelProperty(value = "本月新增人数")
    private Long monthUserCount;

    @ApiModelProperty(value = "本月活跃成员")
    private Long monthActivityUserCount;

    @ApiModelProperty(value = "今日活跃人数")
    private Long todayActiveUserCount;

    @ApiModelProperty(value = "本月有效活跃")
    private Long monthValidActiveUserCount;

}
