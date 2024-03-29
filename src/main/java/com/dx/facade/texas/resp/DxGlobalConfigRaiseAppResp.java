package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 加注(app 返回值）
 */
@Data
public class DxGlobalConfigRaiseAppResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("牌局名称")
    private String gameName;

    @ApiModelProperty("牌局类型")
    private Integer gameType;

    @ApiModelProperty("加注类型")
    private Integer raiseType;

    @ApiModelProperty("配置value")
    private String val;


}
