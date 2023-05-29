package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 会员基本信息修改baseInfo
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "会员头像上传参数DTO", description = "会员头像上传参数DTO")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberUploadDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "头像图片地址")
	@NotNull(message = "头像图片地址不能为空")
	private String topImagesUrl;

	@ApiModelProperty(value = "用户userId")
	@NotNull(message = "用户userId不能为空")
	private Long userId;

	@ApiModelProperty(value = "商户id")
	@NotNull(message = "商户id不能为空")
	private Long merchantId;
}
