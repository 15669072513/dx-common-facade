package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 邮箱 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoRpcEditCreditLevel", description = "会员信息编辑-信用等级")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditCreditLevel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value="信用等级(2)")
    private Integer creditLevel;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
