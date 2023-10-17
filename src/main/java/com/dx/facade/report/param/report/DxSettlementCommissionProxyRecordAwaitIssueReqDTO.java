package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 发放佣金查询
 */
@Data
public class DxSettlementCommissionProxyRecordAwaitIssueReqDTO implements Serializable {

    /**
     * 团队返佣列表行id
     */
    @ApiModelProperty("团队返佣列表行id")
    private List<Long> ids;

    /**
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

}
