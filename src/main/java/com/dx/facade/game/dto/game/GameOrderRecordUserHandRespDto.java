package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderRecordUserHandResp;
import lombok.Data;

import java.util.List;
@Data
public class GameOrderRecordUserHandRespDto {
    private List<GameOrderRecordUserHandResp> respList;

    public GameOrderRecordUserHandRespDto(List<GameOrderRecordUserHandResp> respList) {
        this.respList = respList;
    }
}
