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
public class ProxyRebateRecordDetailRespDTO {

    /**
     * 代理账号信息
     */
    @ApiModelProperty(value = "代理账号信息")
    private ProxyAccountsRespDTO accountsVo;

    /**
     * 审核信息
     */
    @ApiModelProperty(value = "审核信息")
    private List<ProxyCommissionDetailRespDTO> proxyCommissionDetaiVoList;
}
