package com.dx.facade.game.req;

import com.dx.entity.PageReq;
import com.dx.facade.account.req.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;

@ApiModel("资金明细页统计请求实体")
@Data
public class FundDetailReq  extends BaseRequest implements BaseParmDTO{

  @ApiModelProperty("用户ID")
  private Long userId;
  @ApiModelProperty("开始时间")
  private Long startDate;
  @ApiModelProperty("结束时间")
  private Long endDate;
  @ApiModelProperty("注单状态 0未结算 1已结算 2不结算")
  private Integer obBetStatus;

  @Override
  public void check() {
    Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
  }
}
