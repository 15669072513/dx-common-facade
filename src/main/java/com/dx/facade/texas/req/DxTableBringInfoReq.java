package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.List;

@ApiModel("牌桌带入带出请求实体")
@Data
public class DxTableBringInfoReq  implements Serializable, BaseParmDTO {

  @ApiModelProperty("牌桌ids")
  private List<Long> tableIds;

  @Override
  public void check() {
    Assert.notNull(tableIds, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("tableIds"));
  }
}
