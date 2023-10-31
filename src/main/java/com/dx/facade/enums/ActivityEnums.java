package com.dx.facade.enums;

import com.dx.exception.BizException;

public class ActivityEnums {
    public ActivityEnums() {
    }

    public static enum ActivityInviteRecordStatus {
        未达标(1, "未达标"),
        进行中(2, "进行中"),
        已过期(3, "已过期");

        private Integer code;
        private String desc;

        private ActivityInviteRecordStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRecordStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRecordStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRecordStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRecordStatus");
        }
    }

    public static enum ActivityInviteRewardSendPosition {
        现金钱包(1, "现金钱包"),
        红利中心(2, "红利中心");

        private Integer code;
        private String desc;

        private ActivityInviteRewardSendPosition(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardSendPosition getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardSendPosition[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardSendPosition enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardSendPosition");
        }
    }

    public static enum ActivityInviteRewardAuditFlag {
        无需审核(0, "无需审核"),
        需要审核(1, "需要审核");

        private Integer code;
        private String desc;

        private ActivityInviteRewardAuditFlag(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardAuditFlag getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardAuditFlag[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardAuditFlag enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardAuditFlag");
        }
    }

    public static enum ActivityInviteRewardInviteesFlag {
        无奖励(0, "无奖励"),
        有奖励(1, "有奖励");

        private Integer code;
        private String desc;

        private ActivityInviteRewardInviteesFlag(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardInviteesFlag getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardInviteesFlag[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardInviteesFlag enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardInviteesFlag");
        }
    }

    public static enum ActivityInviteNotificationType {
        邀请任务红利中心(1, "邀请任务红利中心"),
        邀请任务现金钱包(2, "邀请任务现金钱包"),
        投注任务红利中心(3, "投注任务红利中心"),
        投注任务现金钱包(4, "投注任务现金钱包");

        private Integer code;
        private String desc;

        private ActivityInviteNotificationType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteNotificationType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteNotificationType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteNotificationType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardCountType");
        }
    }

    public static enum ActivityInviteRewardCountType {
        固定金额(1, "固定金额"),
        比例金额(2, "比例金额");

        private Integer code;
        private String desc;

        private ActivityInviteRewardCountType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardCountType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardCountType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardCountType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardCountType");
        }
    }

    public static enum ActivityInviteBetStatus {
        否(0, "否"),
        是(1, "是");

        private Integer code;
        private String desc;

        private ActivityInviteBetStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteBetStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteBetStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteBetStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteBetStatus 不存在");
        }
    }

    public static enum ActivityInviteStatusType {
        邀请人(1, "邀请人"),
        被邀请人(2, "被邀请人");

        private Integer code;
        private String desc;

        private ActivityInviteStatusType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteStatusType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteStatusType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteStatusType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteStatusType");
        }
    }

    public static enum ActivityInviteDetailsType {
        未结算(1, "未结算"),
        审核中(2, "审核中"),
        待领取(3, "待领取"),
        已领取(4, "已领取"),
        已拒绝(5, "已拒绝"),
        已过期(6, "已过期");

        private Integer code;
        private String desc;

        private ActivityInviteDetailsType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteDetailsType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteDetailsType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteDetailsType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteDetailsType");
        }
    }

    public static enum ActivityInviteTaskStatus {
        不在名单内会员(0, "不在名单内会员"),
        未展示(1, "未展示"),
        已结束_主任务关闭(2, "已结束_主任务关闭"),
        未开始_进行中_已过期(3, "未开始_进行中_已过期");

        private Integer code;
        private String desc;

        private ActivityInviteTaskStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteTaskStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteTaskStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteTaskStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteTaskStatus");
        }
    }

    public static enum ActivityInviteesRewardStatus {
        未达标(1, "未达标"),
//        已失效(2, "已失效"),
//        审核中(3, "审核中"),
//        已拒绝(4, "已拒绝"),
        待领取(5, "待领取"),
        已领取(6, "已领取"),
        已过期(7, "已过期");

        private Integer code;
        private String desc;

        private ActivityInviteesRewardStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteesRewardStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteesRewardStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteesRewardStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteesRewardStatus");
        }
    }

    public static enum ActivityInviteRewardStatus {
        未达标(1, "未达标"),
//        已失效(2, "已失效"),
//        审核中(3, "审核中"),
//        已拒绝(4, "已拒绝"),
        待领取(5, "待领取"),
        已领取(6, "已领取"),
        已过期(7, "已过期");

        private Integer code;
        private String desc;

        private ActivityInviteRewardStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public String getDesc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardStatus");
        }
    }

    public static enum ActivityInviteRewardType {
        按存款金额(1, "按存款金额"),
        按邀请人数(2, "按邀请人数");

        private Integer code;
        private String desc;

        private ActivityInviteRewardType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public String getDesc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteRewardType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteRewardType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteRewardType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteRewardType");
        }
    }

    public static enum ActivityInviteDepositCountType {
        首存存款(1, "首存存款"),
        累计存款(2, "累计存款");

        private Integer code;
        private String desc;

        private ActivityInviteDepositCountType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityInviteDepositCountType getType(Integer code) throws BizException {
            ActivityEnums.ActivityInviteDepositCountType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityInviteDepositCountType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityInviteDepositCountType");
        }
    }

    public static enum ActivityConfigActivityStatus {
        新创建(0, "新创建"),
        未展示(1, "未展示"),
        未开始(2, "未开始"),
        进行中(3, "进行中"),
        已过期(4, "已过期"),
        已停用(5, "已停用"),
        已结束(6, "已结束");

        private Integer code;
        private String desc;

        private ActivityConfigActivityStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityConfigActivityStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityConfigActivityStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityConfigActivityStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityConfigActivityStatus");
        }
    }

    public static enum ActivityConfigStatus {
        停用(0, "停用"),
        启用(1, "启用");

        private Integer code;
        private String desc;

        private ActivityConfigStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityConfigStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityConfigStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityConfigStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityConfigActivityStatus");
        }
    }

    public static enum ActivityConfigApplyType {
        每场馆一次(1, "每场馆一次"),
        每账号一次(2, "每账号一次"),
        每活动一次(3, "每账号一次");

        private Integer code;
        private String desc;

        private ActivityConfigApplyType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityConfigApplyType getType(Integer code) throws BizException {
            ActivityEnums.ActivityConfigApplyType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityConfigApplyType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityConfigActivityApplyType");
        }
    }

    public static enum ActivityConfigInTypeUser {
        所有用户(1, "所有用户"),
        名单内用户(2, "名单内用户"),
        指定代理条线用户(3, "指定代理条线用户");

        private Integer code;
        private String desc;

        private ActivityConfigInTypeUser(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityConfigInTypeUser getType(Integer code) throws BizException {
            ActivityEnums.ActivityConfigInTypeUser[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityConfigInTypeUser enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityConfigInTypeUser");
        }
    }

    public static enum ActivityAmountTypeEnum {
        首存活动(1, "首存活动"),
        VIP晋级优惠(3, "VIP晋级优惠"),
        纯展示页活动(4, "纯展示页活动");

        private Integer code;
        private String desc;

        ActivityAmountTypeEnum(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityAmountTypeEnum getType(Integer code) throws BizException {
            ActivityEnums.ActivityAmountTypeEnum[] var1 = values();
            ActivityEnums.ActivityAmountTypeEnum[] var2 = values();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                ActivityEnums.ActivityAmountTypeEnum enums = var2[var4];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityAmountTypeEnum");
        }
    }

    public static enum ActivityType {
        首存活动(1, "首存活动"),
        VIP晋级优惠(3, "VIP晋级优惠"),
        纯展示页活动(4, "纯展示页活动"),
        好友邀请(5, "好友邀请");

        private Integer code;
        private String desc;

        ActivityType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityType getType(Integer code) throws BizException {
            ActivityEnums.ActivityType[] var1 = values();
            ActivityEnums.ActivityType[] var2 = values();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                ActivityEnums.ActivityType enums = var2[var4];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityType");
        }
    }

    public static enum ActivityBonusAuditLocation {
        现金钱包(1, "现金钱包"),
        红利中心(2, "红利中心"),
        B端钱包(3, "场馆钱包");

        private Integer code;
        private String desc;

        ActivityBonusAuditLocation(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityBonusAuditLocation getType(Integer code) throws BizException {
            ActivityEnums.ActivityBonusAuditLocation[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityBonusAuditLocation enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityBonusAuditLocation");
        }
    }

    public static enum ActivityBonusAuditOperationType {
        单会员发放(1, "单会员发放"),
        批量发放(2, "批量发放");

        private Integer code;
        private String desc;

        ActivityBonusAuditOperationType(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityBonusAuditOperationType getType(Integer code) throws BizException {
            ActivityEnums.ActivityBonusAuditOperationType[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityBonusAuditOperationType enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("ActivityBonusAuditOperationType");
        }
    }

    public static enum ActivityBonusAuditStatus {
        待一审(1, "待一审"),
        一审审核(2, "一审审核"),
        待二审(3, "待二审"),
        二审审核(4, "二审审核"),
        一审拒绝(5, "一审拒绝"),
        二审拒绝(6, "二审拒绝"),
        审核通过(7, "审核通过");

        private Integer code;
        private String desc;

        ActivityBonusAuditStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public static ActivityEnums.ActivityBonusAuditStatus getType(Integer code) throws BizException {
            ActivityEnums.ActivityBonusAuditStatus[] var1 = values();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                ActivityEnums.ActivityBonusAuditStatus enums = var1[var3];
                if (enums.code.equals(code)) {
                    return enums;
                }
            }

            throw new BizException("没有这个ActivityBonusAuditStatus");
        }
    }

    public static enum BillStatus {
        UNCOMPLETE(0, "未完成"),
        COMPLETE(1, "已完成");

        private Integer code;
        private String desc;

        BillStatus(Integer code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }
    }

    public static enum TaskType {
        FIRST_DEPOSIT_ACTIVITY(1, "首存活动", "First deposit activity", "Hoạt động gửi tiền lần đầ", "กิจกรรมการฝากเงินครั้งแรก"),
        VIP_PROMOTION_ACTIVITY(2, "VIP晋级优惠活动", "VIP promotion offer", "Ưu đãi VIP", "ข้อเสนอโปรโมชั่นวีไอพี"),
        DEPOSIT_PROMOTION_ACTIVITY(3, "存款优惠活动", "Deposit Promotions", "Khuyến mãi nạp tiền", "โปรโมชั่นเงินฝาก");

        private Integer code;
        private String desc;
        private String descEn;
        private String descVi;
        private String descTh;

        TaskType(Integer code, String desc, String descEn, String descVi, String descTh) {
            this.code = code;
            this.desc = desc;
            this.descEn = descEn;
            this.descVi = descVi;
            this.descTh = descTh;
        }

        public Integer code() {
            return this.code;
        }

        public String desc() {
            return this.desc;
        }

        public String descEn() {
            return this.descEn;
        }

        public String descVi() {
            return this.descVi;
        }

        public String descTh() {
            return this.descTh;
        }
    }
}