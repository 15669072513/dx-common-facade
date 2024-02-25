package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="审核结果信息",description = "审核结果信息")
@Data
public class ProxyRebateAuditResultIncomeRespDTO {
    @ApiModelProperty(value = "是是否成功 0-成功,1-失败")
    private Integer isSuccess;
    @ApiModelProperty(value = "记录id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String recordId;
    @ApiModelProperty(value = "错误消息")
    private String message;
}
