package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 会员详情-会员信息编辑 姓名 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoEditRealName", description = "会员信息编辑-姓名")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditRealName implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "真实姓名")
    private String realName;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    @Length(min = 2, max = 500, message = "提交审核备注(2-500)")
    private String remark;
}
