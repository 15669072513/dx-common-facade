package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderHandSumResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class GameOrderHandSumRespDto implements Serializable {
    private List<GameOrderHandSumResp> respList;

    public GameOrderHandSumRespDto(List<GameOrderHandSumResp> respList) {
        this.respList = respList;
    }
}
