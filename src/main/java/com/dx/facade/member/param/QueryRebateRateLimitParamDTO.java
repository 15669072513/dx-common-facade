package com.dx.facade.member.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 返点比例上限查询请求参数DTO
 * 
 * @author bicycle
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "返点比例上限查询请求参数", description = "返点比例上限查询请求参数")
public class QueryRebateRateLimitParamDTO implements  Serializable {


    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("佣金结算模式： 1-返点模式 2-返佣模式")
    private Integer commissionMode;
    
    @ApiModelProperty("平台标识： 0-非平台 1-平台")
    private Integer platformFlag;

    /**
     * v1.5.0 现有业务不需要区分用户来获取，  佣金模式 和 平台标识 可唯一确定一套返点配置
     */
    @ApiModelProperty("用户标识： 0-会员 1-代理 2-平台")
    private Integer type;
}
