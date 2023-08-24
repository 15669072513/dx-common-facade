package com.dx.facade.game.resp;

import com.dx.facade.game.dto.GameRecordRoundDeatailDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@ApiModel("牌局回顾圈层详情明细传输类")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GameRecordDeatailPackResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("手牌编码")
    private String handCode;

    @ApiModelProperty("圈层")
    private String roundCode;

    @ApiModelProperty("弃牌玩家数")
    private Integer losePalyers;

    @ApiModelProperty("该轮参与行动的人数")
    private Integer joinCount;

    @ApiModelProperty("底池金额 （其他轮都是延续上一轮的底池，翻牌前轮的总底池数量）")
    private BigDecimal potAmount;

    @ApiModelProperty("当前局数")
    private Long roundNum;

    @ApiModelProperty("总局数")
    private Long totalRound;

    @ApiModelProperty("每个圈层对应的详细记录")
    private List<GameRecordRoundDeatailDto> gameRecordRoundDeatailList;

}
