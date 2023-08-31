package com.dx.facade.enums;

import com.dx.enums.I18nEnum;

public enum GameI18nCodeEnum implements I18nEnum {

    GAME_ALREADY_EXISTS(9990001),//配置已存在，请勿重复新增
    GAME_ALREADY_DISABLED(9990002),//该游戏已禁用
    GAME_ALREADY_MAINTENANCE(9990003),//该游戏维护中
    GAME_COLLECTION_ALREADY_CAPPED(9990003),//游戏收藏已上限
	;
    private int code;

    GameI18nCodeEnum(Integer code){
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }
}
