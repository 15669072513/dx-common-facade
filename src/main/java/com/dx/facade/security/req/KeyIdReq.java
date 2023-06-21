package com.dx.facade.security.req;

import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@ApiModel("通过keyId获取key请求实体")
@Data
public class KeyIdReq {
  @ApiModelProperty(value = "keyId", required = true)
  private String keyId;

  public void check() {
    Assert.notNull(keyId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("keyId"));
  }
}
