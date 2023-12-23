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
@ApiModel(value = "ProfitAndLossReq", description = "盈亏详情列表请求对象")
public class ProfitAndLossTabReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Integer periodStDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Integer periodEnDate;
    @ApiModelProperty(value = "数据类型:\n" +
            "ty=体育\n" +
            "zr=真人\n" +
            "dj=电竞\n" +
            "qp=棋牌\n" +
            "cp=彩票\n" +
            "DZ_CARD=德州")
    private String bwVenueType;
    @ApiModelProperty(value = "数据类型:\n" +
            "1=场馆盈亏\n" +
            "2=返水盈利\n" +
            "3=有效投注",
            required = true, example = "1")
    private Integer profitLossTab;
    @ApiModelProperty(value = "会员id")
    private Long memberId;

    private BwVenueTypeEnum bwVenueTypeEnum;

    private ProfitAndLossTypeEnum profitAndLossTypeEnum;

    private String profitAndLossTypeStr;
}
