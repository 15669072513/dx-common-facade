package com.dx.facade.message.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class AppReadNoticeReq {


    private Long userId;

    private Long merchantId;

    private List<Long> messageIds;//detail 表的id

    private Integer noticeCategory;

    @ApiModelProperty("1=通知 2=站内信消息  3=公告  4=通知栏")
    private Integer noticeType;
}
