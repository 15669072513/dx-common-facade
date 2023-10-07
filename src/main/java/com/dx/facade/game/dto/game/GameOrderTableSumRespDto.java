package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderTableSumResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderTableSumRespDto implements Serializable {
    private List<GameOrderTableSumResp> respList;

    public GameOrderTableSumRespDto(List<GameOrderTableSumResp> respList) {
        this.respList = respList;
    }
}
