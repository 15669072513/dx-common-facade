package com.dx.facade.texas.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局配置返回信息 --- 增值服务开关类配置(app 返回值）
 */
@Data
public class DxGlobalConfigValueAddedResp implements Serializable {

    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("增值类型")
    private Integer chatContentType;
    @ApiModelProperty("是否开启标记")
    private Integer enableFlag;
    @ApiModelProperty("发送消息间隔")
    private Integer sendMessageInterval;
    @ApiModelProperty("录音总时长")
    private Integer recordTotalTime;

}
