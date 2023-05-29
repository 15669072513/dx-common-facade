package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 风控 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoEditWindControl", description = "会员信息编辑-风控")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditWindControl implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "风控层级ID", required = true)
    private Long windControlId;
    
    @ApiModelProperty(value = "风控层级名称", required = true)
    private String windControlName;
    
    @ApiModelProperty(value = "提交审核备注(100)", required = true)
    private String remark;
}
