package com.dx.facade.member.param;

import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 更新会员登录、游戏、支付锁定状态
 * 
 * @Author: fitz
 * @Date 2023/8/19
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新会员登录、游戏、支付锁定状态", description = "更新会员登录、游戏、支付锁定状态")
public class UpdateMemberLockStatusParamDTO implements BaseParmDTO{

    @ApiModelProperty(value = "会员id (20)")
    private Long userId;

	@ApiModelProperty(value = "登录权限：0-关闭 1-开启")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "游戏锁定：0-关闭 1-开启")
	private Integer gameLockStatus;
	
	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer paymentLockStatus;
	
    @ApiModelProperty(value = "操作人")
    private String operateBy;

	@Override
	public void check() {
		Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
	}

}
