package com.dx.facade.report.param.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 发放佣金查询
 */
@Data
public class SettlementCommissionProxyRecordAwaitIssueReqDTO implements Serializable {


    /**
     * 需要发放的下级代理id集合
     */
    @ApiModelProperty("需要发放的下级代理id集合")
    private List<Long> proxyIds;

    /**
     * 上级代理id
     */
    @ApiModelProperty("上级代理id")
    private Long parentProxyId;


    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Integer reportYm;

}
