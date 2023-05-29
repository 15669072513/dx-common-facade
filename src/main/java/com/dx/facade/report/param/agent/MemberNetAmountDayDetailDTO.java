package com.dx.facade.report.param.agent;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MemberNetAmountDayDetailDTO
 *
 * @author kygo
 * @version 1.0.0
 * @since 20220412
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberNetAmountDayDetailDTO {
    @ApiModelProperty(value = "开始时间", required = true, example = "2021-06-17")
    private String startTime;

    @ApiModelProperty(value = "结束时间", required = true, example = "2021-06-17")
    private String endTime;

    @ApiModelProperty(value = "会员ID", required = true, example = "122021061733")
    private String memberId;
}
