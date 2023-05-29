package com.dx.facade.payment.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Tianci 查询启用中的银行卡列表
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TianCiBankCodeResp {

    @ApiModelProperty(value = "银行Code")
    private String id;

    @ApiModelProperty(value = "银行全称")
    private String name;
}
