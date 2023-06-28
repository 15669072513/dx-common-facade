package com.dx.facade.enums;

/**
 * 游戏相关枚举转换
 * @author: cowboy
 * @description
 * @date 2023-06-27
 */
public class GameConstant {

    /**
     * 牌桌状态
     */
    public enum GameTableStatus {
        未开始(0, "未开始"),
        进行中(1, "进行中"),
        已结束(2, "已结束"),
        ;

        private Integer code;
        private String desc;

        GameTableStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static GameConstant.GameTableStatus getType(Integer code) {
            for (GameConstant.GameTableStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }


    /**
     * 手牌状态
     */
    public enum GameHandStatus {
        进行中(0, "进行中"),
        已结束(1, "已结束"),
        ;

        private Integer code;
        private String desc;

        GameHandStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return code;
        }

        public String desc() {
            return desc;
        }

        public String getDesc() {
            return desc;
        }

        public static GameConstant.GameHandStatus getType(Integer code) {
            for (GameConstant.GameHandStatus enums : values()) {
                if (enums.code.equals(code)) {
                    return enums;
                }
            }
            return null;
        }
    }
}
