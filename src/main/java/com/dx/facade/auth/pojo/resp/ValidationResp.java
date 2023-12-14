package com.dx.facade.auth.pojo.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 验证码类型
 *
 * @author tilt
 * @date 2023/12/01 11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "验证码类型", description = "验证码类型")
public class ValidationResp {

    /**
     * code
     */
    @ApiModelProperty(value = "验证码类型:1-谷歌验证码 2-图形验证码（暂未使用） 3-海月盾")
    private Integer verifyCodeType;

}
