package com.dx.facade.game.dto.game;

import com.dx.facade.game.resp.GameOrderTableSumResp;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderTableListRespDto implements Serializable {

    private List<Long> tableList;

}
