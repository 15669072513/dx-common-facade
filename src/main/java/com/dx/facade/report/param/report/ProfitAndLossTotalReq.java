package com.dx.facade.report.param.report;

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
@ApiModel(value = "ProfitAndLossTotalReq", description = "盈亏详情列表Total请求对象")
public class ProfitAndLossTotalReq {

    @ApiModelProperty(value = "本期账单开始日期", example = "20231213")
    private Long periodStDate;
    @ApiModelProperty(value = "本期账单结束日期", example = "20231221")
    private Long periodEnDate;
    @ApiModelProperty(value = "数据类型:all=全部,net=输赢,bet=注单,valid=投注额,rebate=返水,total=盈亏")
    private String amountType;
    @ApiModelProperty(value = "会员id")
    private Long memberId;
}
