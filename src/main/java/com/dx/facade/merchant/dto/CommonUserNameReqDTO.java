package com.dx.facade.merchant.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * userName对象封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/08/05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonUserNameReqDTO {
	
    @ApiModelProperty(value = "会员账号", required = true, example = "darcy00")
//    @NotBlank(message = "账号不能为空")
    @NotBlank(message="{MerchantI18nCodeEnum.USER_NAME_NOT_NULL}")
    private String userName;
    
}
