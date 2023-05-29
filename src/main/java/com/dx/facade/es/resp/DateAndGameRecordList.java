package com.dx.facade.es.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class DateAndGameRecordList {
    @ApiModelProperty("时间 格式：XX月XX日")
    private String date;

    @ApiModelProperty("投注明细")
    private List<GameRecordInfo> gameRecords = new ArrayList<>();
}
