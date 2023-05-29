package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author agan
 */
@Data
public class ActivityCommonUpdateStatusParam {

    @ApiModelProperty(value = "主键id")
    @NotNull(message = "主键id不能为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "无效赔率开关 默认停用(0=停用, 1=开启)")
    private Integer status;

    @ApiModelProperty(value = "修改人",hidden = true)
    private String operator;
}
