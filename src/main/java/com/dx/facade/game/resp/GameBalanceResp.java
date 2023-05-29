package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 余额输出
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22 20:07
 */
@Data
public class GameBalanceResp  extends GameBaseResp {

    /**
     * 余额
     */
    private BigDecimal balance;


    public GameBalanceResp(int code, String msg) {
        super(code, msg);
    }

    public GameBalanceResp() {
        super();
    }
}
