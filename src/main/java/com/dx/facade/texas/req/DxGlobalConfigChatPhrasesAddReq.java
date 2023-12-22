package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局配置--聊天短语新增req
 */
@Data
public class DxGlobalConfigChatPhrasesAddReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("短语内容")
    private String content;
    @ApiModelProperty("短语排序")
    private Integer sort;
    @ApiModelProperty("操作人id")
    private String opId;
    @ApiModelProperty(
            value = "创建人",
            hidden = true
    )
    private String createdBy;


    @ApiModelProperty(
            value = "修改人",
            hidden = true
    )
    private String updatedBy;

}
