package com.dx.facade.report.constant;

import java.util.Arrays;

/**
 * MemberRewardConstant
 *
 * @author focus
 * @version 1.0.0
 * @since 2022年3月24日 下午5:34:48
 */
public class MemberRewardConstant {

    /**
     * 好友邀请福利类型
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum RewardType implements IConstantDef {

        /**
         * 会员VIP奖励
         */
        REWARD,
        /**
         * 好友邀请
         */
        INVITE;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal() + 1;
        }
    }

    /**
     * 好友邀请领取类型
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum ProvideStatus implements IConstantDef {

        /**
         * 待领取
         */
        UNPROVIDE,
        /**
         * 已领取
         */
        PROVIDED,
        /**
         * 失败
         */
        FAILED;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal();
        }
    }

    /**
     * 好友邀请奖励类型
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum ProvideType implements IConstantDef {
        /**
         * 邀请任务
         */
        INVITE,
        /**
         * 存款任务
         */
        DEPOSIT,
        /**
         * 投注任务
         */
        BET;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal() + 1;
        }

        public static ProvideType getProvideType(Integer providerType) {
            return Arrays.stream(ProvideType.values()).filter(s -> s.value() == providerType).findFirst().get();
        }
    }

    /**
     * 好友邀请发送类型
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum SendType implements IConstantDef {

        /**
         * 系统发送
         */
        SYSTEM;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal() + 1;
        }
    }

    /**
     * 好友邀请发送位置
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum SendPosition implements IConstantDef {

        /**
         * 中心钱包
         */
        CENTER_WALLET,
        /**
         * 红利中心
         */
        CENTER_REWARD,
        /**
         * 场馆钱包
         */
        VENUE_WALLET;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal() + 1;
        }
    }

    /**
     * 好友邀请角色类型
     *
     * @author focus
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum InviteRuleType implements IConstantDef {
        /**
         * 无效
         */
        INVALID,
        /**
         * 邀请人
         */
        INVITER,
        /**
         * 被邀请人
         */
        INVITEE;

        /**
         * value
         *
         * @return Int
         * @author focus
         * @since 2022年3月24日 下午5:34:48
         */
        @Override
        public int value() {
            return ordinal();
        }
    }

    /**
     * 好友邀请子任务类型
     *
     * @author candice
     * @version 1.0.0
     * @since 2022年3月24日 下午5:35:15
     */
    public enum InviterChildTaskEnum {
        邀请任务(1),
        存款任务(2),
        投注任务(3);
        private int value;
        private InviterChildTaskEnum(int value) {
            this.value = value;
        }
        public int getValue() {
            return this.value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
}
