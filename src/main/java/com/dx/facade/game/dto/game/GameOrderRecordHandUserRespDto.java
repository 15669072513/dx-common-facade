package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderRecordHandUserResp;
import com.dx.facade.game.resp.UserValiBetAmountResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderRecordHandUserRespDto implements Serializable {

        private List<GameOrderRecordHandUserResp> respList;

        public GameOrderRecordHandUserRespDto(List<GameOrderRecordHandUserResp> respList) {
            this.respList = respList;
        }
    }
