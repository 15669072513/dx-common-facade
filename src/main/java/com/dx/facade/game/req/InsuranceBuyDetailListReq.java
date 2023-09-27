package com.dx.facade.game.req;

import com.dx.facade.report.param.base.BaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("保险购买详情请求实体")
@Data
public class InsuranceBuyDetailListReq  extends BaseRequest {
  @ApiModelProperty("保险ID")
  private Long insuranceId;
}
