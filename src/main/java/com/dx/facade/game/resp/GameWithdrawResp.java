package com.dx.facade.game.resp;

import lombok.Data;

/**
 * 场馆下分响应
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22
 */
@Data
public class GameWithdrawResp extends GameBaseResp {



    public GameWithdrawResp(int code, String msg) {
        super(code, msg);
    }


    public GameWithdrawResp() {
        super();
    }
}
