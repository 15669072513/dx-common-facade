package com.dx.facade.merchant.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title
 @desc
 @path
 @author Gollum
 @version 1.0.0
 @since 2022-10-12 20:20:39
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigAppVersionQueryReqDTO extends PageRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户唯一标识", example = "111111")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    public Long merchantId;

    @ApiModelProperty(value = "版本号")
    private String version;

    @ApiModelProperty(value = "状态[0:待开启,1:开启中]")
    private Integer status;

    @ApiModelProperty(value = "终端[0:Android,1:IOS]")
    private Integer clientType;
}
