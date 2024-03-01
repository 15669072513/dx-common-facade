package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PublicCardResp {

  @ApiModelProperty("公牌号码")
  private Integer cardNum;


  @ApiModelProperty("是否改牌")
  private boolean manipulateMark;
}
