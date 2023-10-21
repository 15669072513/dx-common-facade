package com.dx.facade.member.resp;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 个人返佣比例查询响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-9-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "个人CommissionRate响应DTO对象", description = "个人返佣比例响应DTO")
public class MemberCommissionRateRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("上级代理个人返佣比例")
    private List<MemberCommissionRateResp> proxyCommissionRateResp;

}
