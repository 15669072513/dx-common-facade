package com.dx.facade.game.resp;

import com.dx.facade.game.resp.gamedetail.Game;
import lombok.Data;

import java.util.List;

@Data
public class GameQueryGameListResp extends GameBaseResp {

    private List<Game> data;
}
