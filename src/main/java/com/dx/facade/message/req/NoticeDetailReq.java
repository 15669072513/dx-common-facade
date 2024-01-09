package com.dx.facade.message.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import com.dx.facade.common.PageRequest;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@ApiModel(value="BwMessageNoticeDetailReq对象明细", description="查询BwMessageNoticeDetailReq明细列表入参")
public class NoticeDetailReq extends PageRequest {


    @ApiModelProperty(value = "活动通知id", required = true)
    @Length(max = 20,message = "活动通知id长度不能大于20")
    private String noticeId;

    @ApiModelProperty(value = "类型：1、通知 2、活动消息", required = true)
    @NotNull(message = "类型不能为空")
    @Max(value = 9,message = "类型不能大于9")
    @Min(value = 0,message = "类型不能小于0")
    private Integer configType;
}
