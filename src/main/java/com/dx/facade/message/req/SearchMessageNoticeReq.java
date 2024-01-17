package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SearchMessageNoticeReq extends PageRequest {

    @ApiModelProperty("类型：1、通知 2、站内信消息")
    private Integer noticeType = 1;

    @ApiModelProperty("商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户id", hidden = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<Long> merchantIds;

    @ApiModelProperty("名称")
    private String title;

    @ApiModelProperty("发送对象[0-全部 1-会员 2-终端]")
    private Integer sendObj;

    @ApiModelProperty("创建人")
    private String createdBy;


}
