package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Set;

@Data
public class TableBringInfoReq implements Serializable, BaseParmDTO {
  @ApiModelProperty("牌桌ids")
  private Set<Integer> tableIds;

  @Override
  public void check() {
    Assert.notNull(tableIds, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("tableIds"));
  }
}
