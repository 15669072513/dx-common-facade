package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 聊天短语（app返回值）
 */
@Data
public class DxGlobalConfigShortPhraseListAppResp implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("排序字段")
    private Integer sort;
    @ApiModelProperty("短语内容")
    private String content;


}
