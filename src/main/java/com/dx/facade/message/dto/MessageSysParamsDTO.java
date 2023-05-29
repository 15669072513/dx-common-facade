 package com.dx.facade.message.dto;


 import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 模板替换参数
 * 
 * @author karthus
 * @date 2023/03/10
 */
@Data
public class MessageSysParamsDTO {

    @ApiModelProperty("替换参数中文(如其他语言跟中文一致，只用传该值)")
    private String values;

    @ApiModelProperty("替换参数英文")
    private String valuesEn;

    @ApiModelProperty("替换参数越南")
    private String valuesVi;

    @ApiModelProperty("替换参数泰文")
    private String valuesTh;
}
