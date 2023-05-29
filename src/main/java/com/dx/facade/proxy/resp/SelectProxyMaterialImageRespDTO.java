package com.dx.facade.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class SelectProxyMaterialImageRespDTO {

    @ApiModelProperty(value = "主键id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "图片类型（ 1-综合推广图 2-体育推广图 3-真人推广图 4-电竞推广图 5-彩票推广图 6-棋牌推广图 7-活动推广图）")
    private Integer imageType;

    @ApiModelProperty(value = "展示顺序")
    private Integer displayOrder;

    @ApiModelProperty(value = "图片名称")
    private String imageName;

    @ApiModelProperty(value = "图片尺寸")
    private String imageSize;

    @ApiModelProperty(value = "图片地址")
    private String imageAddress;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

}
