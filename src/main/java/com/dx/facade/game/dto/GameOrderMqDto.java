package com.dx.facade.game.dto;

import lombok.Data;

import java.util.List;

/**
 * @author heart
 */
@Data
public class GameOrderMqDto {
    private String linkId;

    private List<GameOrderRecordDto> gameOrderRecordDto;
}
