package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 账号状态 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoEditAccountStatus", description = "会员信息编辑-账号状态")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditAccountStatus implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer paymentLockStatus;
	
	@ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
	private Integer gameLockStatus;

    @ApiModelProperty(value = "账号状态修改后名称", hidden = true)
    private String afterModifyName;

    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
