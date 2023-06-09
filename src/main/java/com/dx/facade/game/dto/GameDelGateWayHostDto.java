package com.dx.facade.game.dto;


import lombok.Data;

/**
 * MQ ->DX_GAME_DEL_GATEWAY_HOST 对象
 */
@Data
public class GameDelGateWayHostDto {

    private Long tableId;

    private String host;
}
