package com.dx.facade.game.resp;

import lombok.Data;
/**
 * 场馆登陆响应类
 *
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22
 */
@Data
public class GameLoginResp extends GameBaseResp {

    private String url;

    private String imgDomain;

    /**
     * 是否完成活动流水 1 完成 0 有未完成的活动
     */
    private Integer type;


    public GameLoginResp(int code, String msg) {
        super(code, msg);
    }


    public GameLoginResp() {
        super();
    }
}
