package com.dx.facade.message.enums;

public enum MessageBonusTypeEnum {
    // 1、升级礼金，2、生日礼金，3、上半月红包，4、下半月红包，5、会员返水，6、充值送活动，7、人工加额， 8、纯展示页活动
    升级礼金(1),
    生日礼金(2),
    上半月红包(3),
    下半月红包(4),
    会员返水(5),
    充值送活动(6),
    人工加额(7),
    纯展示页活动(8),
    好友邀请_邀请人彩金(9),
    好友邀请_被邀请人彩金(10),
    好友邀请_投注返利(11),
    好友邀请_邀请人彩金_现金钱包(12),
    好友邀请_被邀请人彩金_现金钱包(13),
    好友邀请_投注返利_现金钱包(14),
    存款优惠彩金(15),
    ;

    private int value;

    MessageBonusTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
