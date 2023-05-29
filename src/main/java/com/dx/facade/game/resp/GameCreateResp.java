package com.dx.facade.game.resp;

import lombok.Data;

/**
 * 场馆创建响应类
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22
 */
@Data
public class GameCreateResp extends GameBaseResp {

    private Object extraInfo;

    public GameCreateResp(int code, String msg) {
        super(code, msg);
    }



    public GameCreateResp() {
        super();
    }
}
