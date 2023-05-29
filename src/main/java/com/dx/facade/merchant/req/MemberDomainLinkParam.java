package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 好友邀请 客户端链接展示 入参
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/02/08
 */
@Builder
@Data
public class MemberDomainLinkParam {

    @ApiModelProperty(value = "商户id", required = true)
    @NotNull(message = "商户ID不允许为空")
    private Long merchantId;

    @ApiModelProperty(value = "会员ID", required = true)
    @NotNull(message = "会员ID")
    private Long userId;


}
