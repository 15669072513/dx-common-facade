package com.dx.facade.texas.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局配置--聊天短语分页查询参数
 */
@Data
public class DxGlobalConfigChatPhrasesListReq extends PageRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("短语状态")
    private Integer state;
}
