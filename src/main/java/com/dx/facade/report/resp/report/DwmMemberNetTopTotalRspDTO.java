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
@ApiModel(value = "DwmMemberNetTopTotalRspDTO", description = "合计会员盈亏top返回对象")
public class DwmMemberNetTopTotalRspDTO {

    @ApiModelProperty("本页合计")
    private DwmMemberNetTopTotalRsp totalPage;
    @ApiModelProperty("全部合计")
    private DwmMemberNetTopTotalRsp total;
}
