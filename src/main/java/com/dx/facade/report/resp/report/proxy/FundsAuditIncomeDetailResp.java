package com.dx.facade.report.resp.report.proxy;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(value = "FundsAuditIncomeDetailResp", description = "收益比例弹框")
public class FundsAuditIncomeDetailResp {
    @ApiModelProperty("结算开始日期")
    private Integer startDate;
    @ApiModelProperty("结算结束日期")
    private Integer endDate;
    @ApiModelProperty("团队人数")
    private Integer commissionNum;
    @ApiModelProperty("新增团队人数")
    private Integer newCommissionNum;
    @ApiModelProperty("活跃团队人数")
    private Integer activeCommissionNum;
    @ApiModelProperty("直属会员人数")
    private Integer directlyMemberNum;
    @ApiModelProperty("新增直属会员数")
    private Integer newDirectlyMemberNum;
    @ApiModelProperty("活跃直属会员数")
    private Integer activeDirectlyMemberNum;
    @ApiModelProperty("下级代理人数")
    private Integer underProxyNum;
    @ApiModelProperty("新增下级代理人数")
    private Integer newUnderProxyNum;

    //List<ZhanchengRateInfo> records;



}
