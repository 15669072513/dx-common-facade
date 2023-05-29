package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-代理信息编辑 强制契约 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/09/13
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditMandatoryContractReqDTO", description = "信息编辑-强制契约")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditMandatoryContractReqDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "强制契约 0-关闭 1-开启")
    private Integer mandatoryContract;
    
    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
