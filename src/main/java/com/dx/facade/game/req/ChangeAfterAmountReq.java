package com.dx.facade.game.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * @author set
 * 根据用户、牌桌纬度获取最后一条账变后的余额
 */
@ApiModel("根据用户牌桌纬度获取最后一条账变后的余额请求实体")
@Data
public class ChangeAfterAmountReq implements Serializable, BaseParmDTO {
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("牌桌ID")
  private Long tableId;

  @Override
  public void check() {
    Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
    Assert.notNull(tableId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("tableId"));
  }
}
