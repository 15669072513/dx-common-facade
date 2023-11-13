package com.dx.facade.game.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@ApiModel("保险购买详情实体")
@Data
public class InsuranceBuyDetailResp {
  @ApiModelProperty("id")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long id;
  @ApiModelProperty("保险ID")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long insuredId;
  @ApiModelProperty("玩家ID")
  @JsonSerialize(using = ToStringSerializer.class)
  private Long userId;
  @ApiModelProperty("用户名")
  private String userName;
  @ApiModelProperty("用户昵称")
  private String nickName;
  @ApiModelProperty("已买outs")
  private String buyOuts;
  @ApiModelProperty("所有outs")
  private String allOuts;
  @ApiModelProperty("是否投保人 0否 1是")
  private Integer isInsured;
  @ApiModelProperty("赔率")
  private BigDecimal odds;
  @ApiModelProperty("投保赔付额")
  private BigDecimal insuredRewards;
  @ApiModelProperty("保险投注额")
  private BigDecimal insuredAmount;
  @ApiModelProperty(value = "手牌")
  private String handCards;
}
