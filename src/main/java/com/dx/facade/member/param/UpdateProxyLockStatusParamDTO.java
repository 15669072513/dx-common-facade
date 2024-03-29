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
 * @Description: 更新代理登录、开局、俱乐部管理权限开关
 * 
 * @Author: fitz
 * @Date 2023/6/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "更新代理登录、开局、俱乐部管理权限开关", description = "更新代理登录、开局、俱乐部管理权限开关")
public class UpdateProxyLockStatusParamDTO implements BaseParmDTO{

    @ApiModelProperty(value = "商户id (20)")
    private Long merchantId;
	
    @ApiModelProperty(value = "代理id (20)")
    private Long proxyId;

	@ApiModelProperty(value = "登录权限：1-关闭 0-开启")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "开局权限：1-关闭 0-开启")
	private Integer openLockStatus;
	
	@ApiModelProperty(value = "管理俱乐部权限：1-关闭 0-开启")
	private Integer manageClubLockStatus;
	
    @ApiModelProperty(value = "操作人")
    private String operateBy;

	@Override
	public void check() {
		 Assert.notNull(proxyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyId"));
	}

}
