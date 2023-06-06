package com.dx.facade.game.dto;

import lombok.Data;

import java.util.List;

/**
 * @author heart
 */
@Data
public class GameOrderMqDto {
    private String linkId;

    /**
     *  订单记录
     */
    private List<GameOrderRecordDto> gameOrderRecordDto;
    /**
     * 牌局回顾
     */
    private List<GameReviewDto> gameReviewDtoList;
}
