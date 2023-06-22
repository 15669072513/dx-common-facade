package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderUserSumByUserIdResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderUserSumByUserIdRespDto implements Serializable {
    private List<GameOrderUserSumByUserIdResp> respList;

    public GameOrderUserSumByUserIdRespDto(List<GameOrderUserSumByUserIdResp> respList) {
        this.respList = respList;
    }
}
