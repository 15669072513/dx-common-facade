package com.dx.facade.proxy.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectProxyDomainInfoReqDTO extends PageRequest {

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "域名类型")
    private Integer domainType;

    @ApiModelProperty(value = "域名")
    private String domainName;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    private Integer status;
}
