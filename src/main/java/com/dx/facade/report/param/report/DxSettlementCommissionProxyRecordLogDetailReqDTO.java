package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.util.List;

@Data
public class DxSettlementCommissionProxyRecordLogDetailReqDTO {

    /**
     * '1：调整返佣增加，2：调整返佣减少，2：返佣取消，3：待发佣金）
     */
    @ApiModelProperty("'操作类型（1：调整返佣增加，2：调整返佣减少，2：返佣取消，3：待发佣金）")
    private List<Integer> operationType;
    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;
    /**
     * 返佣表行id
     */
    @ApiModelProperty("返佣表行id")
    private Long settlementCommissionProxyRecordId;
}
