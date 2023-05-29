package com.dx.facade.message.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class SearchMessageAnnouncementReq extends PageRequest {


    @ApiModelProperty("商户Id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("公告时效[1-限时 2-永久]")
    private Integer aging;

    @ApiModelProperty("终端")
    private String terminal;

    @ApiModelProperty("标识[0-无 1-重要]")
    private Integer tag;

    @ApiModelProperty("公告状态[0-已禁用 1-开启中]")
    private Integer status;

    @ApiModelProperty("搜索创建人或最后更新人")
    private String opName;

    @ApiModelProperty("0 创建人 1 最后更新人")
    private Integer opType = 0;



    private List<Long> merchantIds;

}
