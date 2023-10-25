package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-信息编辑 支付密码重置 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "会员支付密码重置请求", description = "信息编辑-支付密码重置")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcResetPayPassword implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@ApiModelProperty("提交备注")
	private String resetPwdRemark;
}
