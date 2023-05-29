package com.dx.facade.game.resp;

import lombok.Data;

/**
 * 场馆上分响应
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22
 */
@Data
public class GameDepositResp extends GameBaseResp {



    public GameDepositResp(int code, String msg) {
        super(code, msg);
    }


    public GameDepositResp() {
        super();
    }
}
