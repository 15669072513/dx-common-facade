package com.dx.facade.security.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("密钥返回实体")
@Data
public class SecurityKeyInfoDTO {
  @ApiModelProperty("id")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long id;
  @ApiModelProperty("keyId platformId+applicationId+version的哈希")
  private String keyId;
  @ApiModelProperty("密钥")
  private String keyStr;
  @ApiModelProperty("平台ID")
  private Integer platformId;
  @ApiModelProperty("平台名称")
  private String platformName;
  @ApiModelProperty("应用ID")
  private Integer applicationId;
  @ApiModelProperty("应用名称")
  private String applicationName;
  @ApiModelProperty("版本")
  private String version;
  @ApiModelProperty("状态 状态： true-有效，false-无效")
  private Boolean status;
}
