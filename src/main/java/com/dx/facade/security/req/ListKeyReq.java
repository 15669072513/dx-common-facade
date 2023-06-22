package com.dx.facade.security.req;

import com.dx.exception.BizException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.util.CollectionUtils;

import java.util.Set;

@ApiModel("根据多个keyId获取多个key请求实体")
public class ListKeyReq {
  @ApiModelProperty(value = "keyId集合", required = true)
  private Set<String> keyIds;

  public void checkReq() throws BizException {
    if(CollectionUtils.isEmpty(keyIds)){
      throw new BizException("请填写正确参数");
    }
  }
}
