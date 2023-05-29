package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;

/**
 * 会员详情-会员信息编辑 账号状态 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "会员VIP详情参数", description = "会员VIP详情参数")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVIPDetailParam{
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;
}
