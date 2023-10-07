package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderUserSettlementResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderUserSettlementRespDto implements Serializable {
    private List<GameOrderUserSettlementResp> respList;

    public GameOrderUserSettlementRespDto(List<GameOrderUserSettlementResp> respList) {
        this.respList = respList;
    }
}
