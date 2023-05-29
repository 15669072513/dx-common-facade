package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代理登录 入参对象
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/5/11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryProxyByNameReqDTO {
    
    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "上级账号")
    private String parentProxyName;
    
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "契约类型 1:佣金契约 2:反点契约")
    private Integer contractType;
}
