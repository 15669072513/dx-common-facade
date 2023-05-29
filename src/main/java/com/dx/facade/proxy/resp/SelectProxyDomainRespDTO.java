package com.dx.facade.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectProxyDomainRespDTO {

    @ApiModelProperty(value = "主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "展示顺序")
    private Integer displayOrder;

    @ApiModelProperty(value = "域名名称")
    private String domainName;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "状态")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Integer status;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "防封微信二维码")
    private String wechatQrCode;

    @ApiModelProperty(value = "防封qq二维码")
    private String qqQrCode;

    @ApiModelProperty(value = "防封微信短链")
    private String wechatShortChain;

    @ApiModelProperty(value = "防封qq短链")
    private String qqShortChain;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createdAt;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "域名类型(0=pc  1=H5 2=APP 3=专用)")
    private Integer domainType;

}
