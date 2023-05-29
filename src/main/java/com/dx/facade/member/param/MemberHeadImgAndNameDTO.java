package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "修改姓名和头像参数", description = "修改姓名和头像参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberHeadImgAndNameDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;

    @ApiModelProperty(value = "用户真实姓名")
	@Length(min = 1, max = 64, message = "用户真实姓名长度(1-64)")
    private String realName;

	@ApiModelProperty(value = "用户头像图片URL")
	private String headImgUrl;
}
