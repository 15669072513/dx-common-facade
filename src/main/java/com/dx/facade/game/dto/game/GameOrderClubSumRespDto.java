package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderClubSumResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderClubSumRespDto implements Serializable {
    private List<GameOrderClubSumResp> respList;

    public GameOrderClubSumRespDto(List<GameOrderClubSumResp> respList) {
        this.respList = respList;
    }
}
