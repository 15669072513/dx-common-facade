package com.dx.facade.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

import com.dx.facade.common.PageRequest;

@Data
public class SelectProxyMaterialImageReqDTO extends PageRequest {

      @ApiModelProperty(value = "商户id")
      private Long merchantId;

      @ApiModelProperty(value = "商户id集合",hidden = true)
      private List<Long> merchantIdIds;

      @ApiModelProperty(value = "图片名称")
      private String imageName;

      @ApiModelProperty(value = "图片类型")
      private Integer imageType;

      @ApiModelProperty(value = "图片尺寸")
      private String imageSize;

      @ApiModelProperty(value = "创建人")
      private String createdBy;

      @ApiModelProperty(value = "最近操作人")
      private String updatedBy;

      @ApiModelProperty(value = "排序key")
      private Integer orderKey;

      @ApiModelProperty(value = "desc、asc")
      private String orderType;
}
