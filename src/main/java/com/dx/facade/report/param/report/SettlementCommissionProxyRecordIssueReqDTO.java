package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SettlementCommissionProxyRecordIssueReqDTO extends LocalDatePageRequest {


    /**
     * 需要发放的下级代理id集合
     */
    @ApiModelProperty("需要发放的下级代理id集合")
    private List<Long> subProxyIds;

    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long  proxyId;

}
