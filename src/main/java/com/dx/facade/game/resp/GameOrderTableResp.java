package com.dx.facade.game.resp;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GameOrderTableResp implements Serializable {

    private List<GameOrderTableSumResp> list;

}
