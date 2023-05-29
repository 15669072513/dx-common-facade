package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 代理详情-我的有效契约查询 返回参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/24
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyContractRespDTO {

    @ApiModelProperty(value = "佣金契约")
    List<ContractDetailCommissionRespDTO> commissionResp;

    @ApiModelProperty(value = "返点契约")
    List<ContractDetailRebateRespDTO> rebateResp;

}
