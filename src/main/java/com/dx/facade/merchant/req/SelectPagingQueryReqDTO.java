package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectPagingQueryReqDTO {

    @ApiModelProperty(value = "当前页数", required = true, example = "1")
    private Long pageNum = 1L;

    @ApiModelProperty(value = "每页大小", required = true, example = "20")
    private Long pageSize = 20L;

}
