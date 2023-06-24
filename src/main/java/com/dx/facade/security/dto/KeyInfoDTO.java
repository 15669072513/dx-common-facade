package com.dx.facade.security.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("key的返回实体")
@Data
public class KeyInfoDTO {
  @ApiModelProperty("返回的key")
  private String key;
}
