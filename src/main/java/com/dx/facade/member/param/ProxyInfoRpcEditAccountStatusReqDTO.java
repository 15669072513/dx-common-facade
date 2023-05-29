package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-代理信息编辑 账号状态 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditAccountStatusReqDTO", description = "信息编辑-账号状态")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditAccountStatusReqDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer paymentLockStatus;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
