package com.dx.facade.game.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class GameRevieRoundResp {
    @ApiModelProperty("手牌编码")
    private String id="";
    @ApiModelProperty("手牌时间")
    private String handEndDateStr;
    @ApiModelProperty("玩家牌局数量")
    private Long userHandCount=0L;
    @ApiModelProperty("小盲注")
    private BigDecimal sbBlindScore;
    @ApiModelProperty("大盲注")
    private BigDecimal bbBlindScore;
    @ApiModelProperty("手牌号")
    private Integer roundNo;
}
