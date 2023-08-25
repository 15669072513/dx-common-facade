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
 * 会员返点比例查询响应DTO
 * </p>
 *
 * @author bicycle
 * @since 2023-7-22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员RebateRate响应DTO对象", description = "会员返点比例响应DTO")
public class MemberRebateRateRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("上级代理团队返点比例")
    private List<MemberRebateRateResp> proxyRebateRateResp;
    
    @ApiModelProperty("会员返点比例")
    private MemberRebateRateResp memberRebateRateResp;

}
