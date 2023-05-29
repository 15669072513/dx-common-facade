package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-信息编辑 代理标签 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditLabelReqDTO", description = "信息编辑-代理标签")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditLabelReqDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "标签id(20)")
    private Long labelId;
    
    @ApiModelProperty(value = "标签名称(50)")
    private String labelName;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
