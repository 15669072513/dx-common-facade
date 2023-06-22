package com.dx.facade.security.req;

import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@ApiModel("获取key请求实体")
@Data
public class SecurityKeyReq {
  @ApiModelProperty(value = "平台id", required = true)
  private Integer platformId;
  @ApiModelProperty(value = "版本号", required = true)
  private String version;
  @ApiModelProperty(value = "应用ID", required = true)
  private Integer applicationId;

  public void check() {
    Assert.notNull(platformId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("platformId"));
    Assert.notNull(version, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("version"));
    Assert.notNull(applicationId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("applicationId"));
  }
}
