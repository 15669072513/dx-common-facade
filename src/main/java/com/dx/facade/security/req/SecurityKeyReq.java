package com.dx.facade.security.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("获取key请求实体")
@Data
public class SecurityKeyReq {
  @ApiModelProperty(value = "平台id",required = true)
  private Integer platformId;
  @ApiModelProperty(value = "版本号",required = true)
  private String version;
  @ApiModelProperty(value = "应用ID",required = true)
  private Integer applicationId;
}
