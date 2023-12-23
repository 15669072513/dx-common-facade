package com.dx.facade.report.param.report;

import com.dx.facade.enums.BwVenueTypeEnum;
import com.dx.facade.report.enums.ProfitAndLossTypeEnum;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProfitAndLossReq", description = "盈亏详情列表请求对象")
public class ProfitAndLossReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Long periodStDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Long periodEnDate;
    @ApiModelProperty(value = "会员id")
    private Long memberId;

}
