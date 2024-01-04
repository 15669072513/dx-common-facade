package com.dx.facade.texas.resp;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 通用增值服务返回
 */
@Data
public class DxGlobalConfigCommonValueAddedResp implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("增值信息")
    private JSONObject vals;

}
