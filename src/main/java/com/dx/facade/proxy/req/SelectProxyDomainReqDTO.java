package com.dx.facade.proxy.req;

import com.dx.facade.common.PageRequest;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

@Data
public class SelectProxyDomainReqDTO extends PageRequest {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "商户id集合",hidden = true)
    private List<Long> merchantIdIds;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "域名名称")
    @Size(max = 500, message = "域名最多500个字符")
    private String domainName;

    @ApiModelProperty(value = "创建人")
    @Size(max = 12, message = "创建人最多12个字符")
    private String createdBy;

    @ApiModelProperty(value = "最近操作人")
    @Size(max = 12, message = "最近操作人最多12个字符")
    private String updatedBy;

    @ApiModelProperty(value = "代理推广域名类型(0=pc  1=H5 2=APP 3=专用) ")
    private Integer domainType;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty("排序列 1-创建时间 2-最近操作时间")
    private Integer orderKey;

    @ApiModelProperty("排序方式：desc-降序 asc-升序")
    private String orderType;
}
