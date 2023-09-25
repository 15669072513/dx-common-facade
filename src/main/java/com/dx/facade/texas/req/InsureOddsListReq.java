package com.dx.facade.texas.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
@Data
@ApiModel("获取保险赔率请求实体")
public class InsureOddsListReq  implements Serializable{

  @ApiModelProperty("游戏类型 2001-德州 2002-短牌")
  private Integer gameType;
  @ApiModelProperty("outs")
  private Integer outs;
  @ApiModelProperty("赔率类型 1-2人allin赔率 2-3人allin赔率 3-4人allin赔率 4-5人allin赔率 5-6人allin赔率 6-7人allin赔率 7-8人allin赔率 8-9人allin赔率")
  private Integer oddsType;

}
