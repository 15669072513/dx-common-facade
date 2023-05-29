package com.dx.facade.account.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @program: activity-server
 * @description:
 * @author: Jerrmy
 * @create: 2021-08-11 23:23
 **/
@ApiModel(value = "com-ob-param-ActivityTaskParamDTO")
@Data
public class ActivityTaskParamDTO implements Serializable {

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    @NotNull(message = "会员ID不允许为空")
    private Long userId;

    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户ID")
    @NotNull(message = "商户ID不允许为空")
    private Long merchantId;

    /**
     * 场馆编号
     */
    @ApiModelProperty(value = "场馆编号")
    @NotBlank(message = "场馆编号不允许为空")
    private String gameCode;

}
