package com.dx.facade.game.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@ApiModel("购买详情实体信息")
@Data
public class InsuranceInfoBuyDetailResp {
  @ApiModelProperty("id")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long id;
  @ApiModelProperty("手牌")
  private String handCards;
  @ApiModelProperty("公牌")
  private String publicCards;
  @ApiModelProperty("底池")
  private BigDecimal potAmount;
  @ApiModelProperty("最大投保额")
  private BigDecimal maxInsuredAmount;
  @ApiModelProperty("玩家投注额")
  private BigDecimal betAmount;
  @ApiModelProperty("保险购买详情集合")
  private List<InsuranceBuyDetailResp> insuranceBuyDetailList;
}
