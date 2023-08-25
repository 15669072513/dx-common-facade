package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.Set;

@Data
public class TableUserBringInfoReq implements Serializable, BaseParmDTO {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty("用户IDs")
  private Set<Long> userIds;
  @ApiModelProperty("牌桌ID")
  private Integer tableId;

  @Override
  public void check() {
    Assert.notNull(userIds, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userIds"));
    Assert.notNull(tableId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("tableId"));
  }
}
