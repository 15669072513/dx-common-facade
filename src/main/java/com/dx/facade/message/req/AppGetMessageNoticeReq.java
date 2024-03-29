package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AppGetMessageNoticeReq extends PageRequest {


    private Long userId;

    private Long merchantId;

    @ApiModelProperty("1=通知 2=站内信消息  3=公告  4=通知栏")
    private Integer noticeType;

    private Integer deviceType;

    @ApiModelProperty("消息类别:0会员消息,1代理消息")
    private Integer noticeCategory;

    @ApiModelProperty("消息标题")
    private String title;

    @ApiModelProperty("消息内容")
    private String content;

    /** 注册开始时间 */
    @ApiModelProperty("创建开始时间")
    private String createdAtStart;

    /** 注册结束时间 */
    @ApiModelProperty("创建结束时间")
    private String createdAtEnd;

    @ApiModelProperty("是否已读(0否,1是)")
    private Integer isRead;

    @ApiModelProperty(value = "是否pc端展示 0:app，1:pc", required = false)
    private Integer pc = 0 ;
}
