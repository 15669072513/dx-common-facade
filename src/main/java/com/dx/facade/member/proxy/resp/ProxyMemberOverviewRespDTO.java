package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * 代理详情-成员概览信息
 * @author laway
 */
@Data
@Builder
public class ProxyMemberOverviewRespDTO {

    @ApiModelProperty(value = "今日新增")
    private Long todayNewUserCount;
    @ApiModelProperty(value = "本月新增")
    private Long monthNewUserCount;

    @ApiModelProperty(value = "活跃人数")
    private Long activityUserCount;
    @ApiModelProperty(value = "今日活跃人数")
    private Long todayActivityUserCount;
    @ApiModelProperty(value = "本月活跃人数")
    private Long monthActivityUserCount;
    @ApiModelProperty(value = "有效活跃人数")
    private Long validUserCount;
    @ApiModelProperty(value = "今日有效活跃人数")
    private Long todayValidUserCount;
    @ApiModelProperty(value = "本月有效活跃人数")
    private Long monthValidUserCount;
}
