package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tilt
 */
@Data
@ApiModel(value = "com-ob-param-ProxyInfoRpcEditWithdrawLimitType", description = "代理信息编辑-取款限制类型")
public class ProxyInfoRpcEditWithdrawLimitType {
    @ApiModelProperty("取款限制类型：1-账单限制，2-流水限制")
    private Integer withdrawLimitType;

}
