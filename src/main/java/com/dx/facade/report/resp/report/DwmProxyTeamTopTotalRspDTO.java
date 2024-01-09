package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmProxyTeamTopTotalRspDTO", description = "合计代理团队top返回对象")
public class DwmProxyTeamTopTotalRspDTO {

    @ApiModelProperty("本页合计")
    private DwmProxyTeamTopTotalRsp totalPage;
    @ApiModelProperty("全部合计")
    private DwmProxyTeamTopTotalRsp total;
}
