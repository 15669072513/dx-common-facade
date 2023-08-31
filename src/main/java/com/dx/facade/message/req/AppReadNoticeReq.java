package com.dx.facade.message.req;

import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class AppReadNoticeReq {


    private Long userId;

    private Long merchantId;

    private List<Long> messageIds;//detail 表的id

    private Integer noticeCategory;

    private Integer noticeType;
}
