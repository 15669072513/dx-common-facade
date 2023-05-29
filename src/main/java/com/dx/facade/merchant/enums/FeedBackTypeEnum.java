package com.dx.facade.merchant.enums;

import com.dx.exception.BizException;

/**
 @title
 @desc 会员反馈类型枚举
 @path
 @author timas
 @version 1.0.0
 @since 2022-10-04 16:14:56
*/
public class FeedBackTypeEnum {

    /**
     * 会员反馈类型
     */
    public static enum FeedBackType {
        //问题类型(0:存款问题,1-取款问题,2-游戏问题,3-优惠问题,4-网站/app登录,5-修改资料,6-流水问题,7-其他)
        ZERO(0, "存款问题"),
        ONE(1, "取款问题"),
        TWO(2, "游戏问题"),
        THREE(3, "优惠问题"),
        THOU(4, "app登录"),
        FIVE(5, "修改资料"),
        SIX(6, "流水问题"),
        SHEEN(7, "其他");

        public Integer value;
        public String desc;

        private FeedBackType(Integer value, String desc) {
            this.value = value;
            this.desc = desc;
        }

        public Integer value() {
            return value;
        }

        public String desc() {
            return desc;
        }

        public static FeedBackTypeEnum.FeedBackType getType(Integer value) throws BizException {
            for (FeedBackTypeEnum.FeedBackType type : values()) {
                if (type.value.equals(value)) {
                    return type;
                }
            }
            throw new BizException("会员反馈没有这个类型");
        }
    }
}
