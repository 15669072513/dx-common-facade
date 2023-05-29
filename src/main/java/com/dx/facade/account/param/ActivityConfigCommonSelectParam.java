package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigCommonSelectParam {

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "无效赔率开关 默认停用(0=停用, 1=开启)", hidden = true)
    private Integer status;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "商户id不能为空")
    private Long merchantId;
}
