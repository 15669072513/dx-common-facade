package com.dx.facade.texas.req;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class WalletDetailPageRequest implements Serializable, BaseParmDTO {
  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("开始时间")
  private LocalDateTime startDate;
  @ApiModelProperty("结束时间")
  private LocalDateTime endDate;
  @ApiModelProperty("账变类型 1-带入牌桌 2-带出牌桌")
  private Integer changeType;

  @Override
  public void check() {
    Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
  }
}
