package com.dx.facade.report.param.report;

import com.dx.facade.enums.BwVenueTypeEnum;
import com.dx.facade.report.enums.ProfitAndLossTypeEnum;
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
@ApiModel(value = "ProfitAndLossTabReq", description = "盈亏详情列表Tab请求对象")
public class ProfitAndLossTabReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Long periodStDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Long periodEnDate;
    @ApiModelProperty(value = "数据类型:ty=体育,zr=真人,dj=电竞,qp=棋牌,cp=彩票,DZ_CARD=德州")
    private String bwVenueType;
    @ApiModelProperty(value = "数据类型: 1=场馆盈亏，2=返水盈利，3=有效投注",required = true, example = "1")
    private Integer profitLossTab;
    @ApiModelProperty(value = "会员id")
    private Long memberId;
}
