package com.dx.facade.member.resp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 会员返点比例查询响应
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员RebateRate响应对象", description = "会员返点比例响应")
public class MemberCommissionRateResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户名称")
    private String userName;
    
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;
    
    @ApiModelProperty("代理等级")
    private Integer proxyLevel;
    
    @ApiModelProperty("德州俱乐部返佣比例")
    private BigDecimal texasCommission;
    
    @ApiModelProperty("德州保险返点比例")
    private BigDecimal texasInsuranceCommission;
    
    @ApiModelProperty("其他返佣比例")
    private BigDecimal otherCommission;

}
