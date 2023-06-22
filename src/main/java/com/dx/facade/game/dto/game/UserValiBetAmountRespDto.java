package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.UserValiBetAmountResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserValiBetAmountRespDto implements Serializable {
    private List<UserValiBetAmountResp> respList;

    public UserValiBetAmountRespDto(List<UserValiBetAmountResp> respList) {
        this.respList = respList;
    }
}
