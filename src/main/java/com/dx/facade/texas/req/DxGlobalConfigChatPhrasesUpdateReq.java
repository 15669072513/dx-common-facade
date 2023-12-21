package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局开关类配置新增
 */
@Data
public class DxGlobalConfigChatPhrasesUpdateReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("短语排序")
    private Integer sort;
    @ApiModelProperty("短语状态")
    private Integer state;
    @ApiModelProperty("操作人id")
    private String opId;

}
