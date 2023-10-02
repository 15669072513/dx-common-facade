package com.dx.facade.report.param.report;

import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 发放佣金查询
 */
@Data
public class SettlementCommissionProxyRecordIssueReqDTO implements Serializable {


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


    /**
     * 报表日期
     */
    @ApiModelProperty("报表日期")
    private Integer reportDate;

}
