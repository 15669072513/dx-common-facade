package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityConfigTagParam {

    @ApiModelProperty(value = "活动页签ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long tagId;

    @ApiModelProperty(value = "活动状态, 状态 0-停用 1-启用")
    private Integer status;
}
