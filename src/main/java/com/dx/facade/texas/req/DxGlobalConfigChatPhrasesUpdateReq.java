package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;


/**
 * 全局配置--聊天短语更新req
 */
@Data
public class DxGlobalConfigChatPhrasesUpdateReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("短语排序")
    private Integer sort;
    @ApiModelProperty("短语状态")
    private Integer state;
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
