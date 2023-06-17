package com.dx.facade.enums;

import com.dx.exception.BizException;

import java.util.Arrays;

/**
 * 场馆Game-api 相关枚举
 */
public class GameEnums {
    public GameEnums() {
    }

    public static enum MqDepositType {
        NORMAL(1, "普通转账上分"),
        ACTIVITY(2, "活动上分"),

        ;
        private int code;
        private String desc;

        private MqDepositType(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static MqDepositType getType(Integer code) throws BizException {
            return Arrays.stream(values()).filter(item -> item.code == code).findAny().orElse(null);
        }
    }


    // game-api 转账状态
    public enum TransferStatus {

        INIT(0, "初始"),
        TRANSFERING(1, "转账中"),
        SUCCESS(2, "成功"),
        FAILED(3, "失败"),
        ;
        private int code;
        private String desc;

        private TransferStatus(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int code() {
            return this.code;
        }
        public String desc() {
            return this.desc;
        }

        public static TransferStatus getType(Integer code) throws BizException {
            return Arrays.stream(values()).filter(item -> item.code == code).findAny().orElse(null);
        }
    }

    // game-api 转账状态 给中控后台下拉展示，只需要成功 失败
    public enum TransferStatusShow {

        TRANSFERING(1, "处理中"),
        SUCCESS(2, "成功"),
        FAILED(3, "失败"),
        ;
        private int code;
        private String desc;

        private TransferStatusShow(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public int code() {
            return this.code;
        }
        public String desc() {
            return this.desc;
        }

        public static TransferStatusShow getType(Integer code) throws BizException {
            return Arrays.stream(values()).filter(item -> item.code == code).findAny().orElse(null);
        }
    }

    public enum EsFlagEnum {
        NO(0, "未下发"),
        YES(1, "已下发");
        private EsFlagEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
        private int code;
        private String desc;
        public int code() {
            return this.code;
        }
        public String desc() {
            return this.desc;
        }
    }


}