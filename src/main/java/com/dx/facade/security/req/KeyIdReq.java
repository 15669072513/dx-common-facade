package com.dx.facade.security.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("通过keyId获取key请求实体")
@Data
public class KeyIdReq {
  @ApiModelProperty(value = "keyId",required = true)
  private String keyId;
}
