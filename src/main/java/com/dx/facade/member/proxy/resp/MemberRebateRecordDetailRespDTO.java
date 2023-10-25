package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 代理返点审核详情
 */
@Builder
@Data
public class MemberRebateRecordDetailRespDTO {

    /**
     * 会员账号信息
     */
    @ApiModelProperty(value = "会员账号信息")
    private MemberAccountsRespDTO accountsVo;

    /**
     * 审核信息
     */
    @ApiModelProperty(value = "审核信息")
    private List<MemberCommissionDetailRespDTO> memberCommissionDetaiVoList;
}
