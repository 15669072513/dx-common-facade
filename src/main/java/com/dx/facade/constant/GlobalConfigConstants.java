package com.dx.facade.constant;

/**
 * 全局配置通用，固定字段
 */
public interface GlobalConfigConstants {

    interface CommonField {
        String TOGGLE_ON_OFF = "toggle";
    }

    interface CommonValue {
        Integer TOGGLE_ON = 1;
        Integer TOGGLE_OFF = 0;
    }

    interface State {
        Integer ENABLE = 1;//启用
        Integer DISABLE = 0;//禁用
        Integer LOGIC_DEL = 2;//逻辑删除
    }

}
