package com.dx.facade.member.param;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.NotNull;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.dx.facade.account.service.BaseParmDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 会员基本信息修改baseInfo
 *
 * @author timas
 * @version 1.0.0
 * @date 2021/04/29
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberBaseInfoUpdDTO implements BaseParmDTO {
    
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "会员id")
	@NotNull(message = "会员id不能为空")
	private Long memberId;

	@ApiModelProperty("真实姓名")
	private String realName;

	@ApiModelProperty("出生日期")
	private LocalDate birthday;

	@ApiModelProperty("性别 0-女，1-男")
	private Integer gender;

	@ApiModelProperty("昵称")
	private String nickName;
	
    @ApiModelProperty(value = "修改来源 1：个人中心 2：德州 默认 1")
    private Integer source = 1;


	@Override
	public void check() {
		Assert.isTrue(StringUtils.hasText(realName) || Objects.nonNull(birthday) || Objects.nonNull(gender) ||StringUtils.hasText(nickName)
				, "必须修改一项");
	}
}
