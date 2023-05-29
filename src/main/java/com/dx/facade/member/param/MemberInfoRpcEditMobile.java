package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 手机号码 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoEditMobile", description = "会员信息编辑-手机号码")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditMobile implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "区号",example = "+86")
	private String areaCode;
	
    @ApiModelProperty(value = "手机号码")
    private String mobile;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
