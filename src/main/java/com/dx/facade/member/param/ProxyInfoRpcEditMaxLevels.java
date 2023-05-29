package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 代理详情-代理信息编辑 代理线层级上限 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/03/11
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditMaxLevels", description = "代理信息编辑-代理线层级上限")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditMaxLevels implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "代理线层级上限(2)")
    private Integer maxLevels;

    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
