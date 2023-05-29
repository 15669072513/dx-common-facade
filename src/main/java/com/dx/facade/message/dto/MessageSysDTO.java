 package com.dx.facade.message.dto;

 import java.util.List;

 import org.springframework.util.Assert;

import com.dx.facade.auth.enums.ConfigKeyEnum;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
  * 系统消息请求参数
  * @author karthus
  * @date 2023/03/10
  */
@Data
 public class MessageSysDTO {
     
     @ApiModelProperty("商户id")
     private Long merchantId;
     
     @ApiModelProperty("用户id")
     private Long userId;
     
     @ApiModelProperty("类型:1通知,2活动")
     private Integer noticeType;

    @ApiModelProperty("消息类别:0会员消息,1代理消息")
    private Integer noticeCategory;
     
     @ApiModelProperty("系统模板code")
     private ConfigKeyEnum  configKeyEnum;
     
     @ApiModelProperty("替换参数")
     private List<MessageSysParamsDTO> params;

     public void check() {
         Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
         Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
         Assert.notNull(noticeType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("noticeType"));
         Assert.notNull(configKeyEnum, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("configKeyEnum"));
         Assert.notNull(params, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("params"));

     }
}
