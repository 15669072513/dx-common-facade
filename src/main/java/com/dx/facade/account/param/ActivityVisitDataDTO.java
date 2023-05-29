package com.dx.facade.account.param;

import com.dx.facade.member.resp.MemberInfoRespDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author dereck
 */
@Data
@AllArgsConstructor
@Builder
public class ActivityVisitDataDTO {
    
    @ApiModelProperty(value = "活动类型 1-纯展示页活动 2-首存活动 3-好友邀请活动",required = true)
    private Integer activityType;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "活动id",required = true)
    private Long activityId;
    
    @ApiModelProperty(value = "活动名称",required = true)
    private String activityName;
    
    @ApiModelProperty(value = "活动标题",required = true)
    private String activityTitle;
    
    @ApiModelProperty(value = "会员对象",required = true)
    private MemberInfoRespDTO memberBO;
    
    @ApiModelProperty(value = "访问终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）",required = true)
    private Integer deviceType;
    
    @ApiModelProperty(value = "访问ip",required = true)
    private String visitIp;
    
}
