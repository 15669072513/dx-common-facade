package com.dx.facade.report.resp.report;


import com.dx.util.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetAmountDayRespDTO  extends NetAmountDaySummaryRespDTO {

    @ApiModelProperty("日期，比如20210531")
    private String staticsDate;

    public String getStaticsDate() {
        if (StringUtil.isBlank(staticsDate) || staticsDate.length() < 8) {
            return staticsDate;
        }
        return staticsDate.substring(0, 4)
                + "-"
                + staticsDate.substring(4, 6)
                + "-"
                + staticsDate.substring(6, 8);
    }
}
