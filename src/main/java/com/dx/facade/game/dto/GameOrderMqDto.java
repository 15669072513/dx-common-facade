package com.dx.facade.game.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author heart
 */
@Data
public class GameOrderMqDto implements Serializable {
    /**
     * 链路id
     */
    private String linkId;

    /**
     *  注单记录
     */
    private List<GameOrderRecordDto> gameOrderRecordDtoList;
    /**
     * 牌局回顾
     */
    private List<GameReviewDto> gameReviewDtoList;
}
