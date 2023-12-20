package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 聊天短语
 */
@Data
public class DxGlobalConfigShortPhraseListResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("排序字段")
    private Integer sort;

    @ApiModelProperty("短语内容")
    private String content;

    @ApiModelProperty("配置状态")
    private String state;

    @ApiModelProperty("配置创建时间")
    private String createAt;

    @ApiModelProperty("配置修改时间")
    private String updateAt;

    @ApiModelProperty("配置修改人")
    private String opName;
}
